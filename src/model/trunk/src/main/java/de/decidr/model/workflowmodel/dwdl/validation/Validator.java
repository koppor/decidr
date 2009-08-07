/*
 * The DecidR Development Team licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package de.decidr.model.workflowmodel.dwdl.validation;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import de.decidr.model.acl.roles.UserRole;
import de.decidr.model.exceptions.TransactionException;
import de.decidr.model.facades.UserFacade;
import de.decidr.model.workflowmodel.dwdl.Actor;
import de.decidr.model.workflowmodel.dwdl.Literal;
import de.decidr.model.workflowmodel.dwdl.Variable;
import de.decidr.model.workflowmodel.dwdl.Workflow;

/**
 * This class provides the functionality to determine whether a given DWDL is
 * valid or not.
 * 
 * @author Modood Alvi
 * @version 0.1
 */
// MA: bitte hier drin mal <ctrl><shift><f> drücken!
public class Validator {

    private javax.xml.validation.Validator validator = null;
    private Schema schema = null;

    private SimpleDateFormat sdfD = new SimpleDateFormat("yyyy-MM-dd");
    private SimpleDateFormat sdfT = new SimpleDateFormat("HH:mm:ss");

    public Validator() {
        try {
            SchemaFactory sf = SchemaFactory
                    .newInstance("http://www.w3.org/2001/XMLSchema");
            schema = sf.newSchema(new StreamSource("dwdl.xsd"));

            validator = schema.newValidator();
        } catch (SAXException e) {
            // MA Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * GH testing only
     * 
     * @param dwdl
     * @return
     */
    public List<IProblem> validate(StreamSource dwdl) {
        DWDLErrorHandler errHandler = null;
        List<IProblem> errList = null;

        validator.setErrorHandler(new DWDLErrorHandler());
        try {
            validator.validate(dwdl);
        } catch (SAXException e) {
            errList = new ArrayList<IProblem>();
            errList.add(new Problem(e.getMessage(), "global"));
        } catch (IOException e) {
            errList = new ArrayList<IProblem>();
            errList.add(new Problem(e.getMessage(), "global"));
        }

        errHandler = (DWDLErrorHandler) (validator.getErrorHandler());
        errList = errHandler.getProblemList();

        // GH how to transform from byte[] to TWorkflow?
        // errList.addAll(checkVariables(dwdl));
        // errList.addAll(checkUsers(dwdl));

        return errList;
    }

    /**
     * MA: add comment
     * 
     * @param dwdl
     *            The DWDL workflow to validate
     * @return List of problems found during validation process.
     */
    public List<IProblem> validate(Workflow dwdl) {
        DWDLErrorHandler errHandler = null;

        // GH requires confirmation
        DOMSource dom = new DOMSource((Node) dwdl);
        List<IProblem> errList = null;

        validator.setErrorHandler(new DWDLErrorHandler());
        try {
            validator.validate(dom);
        } catch (SAXException e) {
            errList = new ArrayList<IProblem>();
            errList.add(new Problem(e.getMessage(), "global"));
        } catch (IOException e) {
            errList = new ArrayList<IProblem>();
            errList.add(new Problem(e.getMessage(), "global"));
        }

        errHandler = (DWDLErrorHandler) (validator.getErrorHandler());
        errList = errHandler.getProblemList();

        errList.addAll(checkVariables(dwdl));
        errList.addAll(checkUsers(dwdl));

        return errList;
    }

    /**
     * MA: add comment
     * 
     * @param dwdl
     *            The DWDL workflow to validate
     * @return List of problems found during validation process.
     */
    public List<IProblem> validate(byte[] dwdl) {
        return null;
    }

    /**
     * Checks for all users, whether they are registered
     * 
     * @param dwdl
     *            TWorkflow - the actual DWDL
     * @return A list of Problems with unregistered users
     */
    private List<IProblem> checkUsers(Workflow dwdl) {
        List<IProblem> userErr = new ArrayList<IProblem>();
        UserFacade userFacade = new UserFacade(new UserRole());
        // GH: where to find the users:
        // - Actors
        // - EMail Activity
        // - Human Task

        for (Actor actor : dwdl.getRoles().getActor()) {
            try {
                if (!userFacade.isRegistered(actor.getUserId())) {
                    userErr.add(new Problem("User " + actor.getName() + "("
                            + actor.getEmail() + "" + "does not exist!", actor
                            .getEmail()));
                }
            } catch (TransactionException e) {
                userErr.add(new Problem("Connection to Database failed!",
                        "global"));
                break;
            }
        }

        return userErr;
    }

    /**
     * Checks for all variables, whether the value matches the variable type and
     * returns a list of all found errors.
     * 
     * @param dwdl
     *            TWorkflow - the actual DWDL
     * @return List with all variables (including an error description) where
     *         value and type mismatch
     */
    private List<IProblem> checkVariables(Workflow dwdl) {
        List<IProblem> varErr = new ArrayList<IProblem>();

        // GH Gesame Klasse: schonmal was von 'nem "foreach" und "Generics"
        // gehört?
        // RR nö, in wie fern helfen mir die generics hierbei?
        for (Variable tVar : dwdl.getVariables().getVariable()) {
            String type = tVar.getType();

            if (tVar.getInitialValue() != null) {
                if (type.toLowerCase().equals("integer")) {
                    if (tVar.getInitialValues() == null) {
                        if (!isVariableInteger(tVar.getInitialValue())) {
                            varErr.add(new Problem("value is not integer!",
                                    tVar.getName()));
                        }
                    } else {
                        for (Literal literals : tVar.getInitialValues()
                                .getInitialValue()) {
                            if (!isVariableInteger(tVar.getInitialValue())) {
                                varErr.add(new Problem("value(s) not integer!",
                                        tVar.getName()));
                                break;
                            }
                        }
                    }

                } else if (type.toLowerCase().equals("float")) {
                    if (tVar.getInitialValues() == null) {
                        if (!isVariableFloat(tVar.getInitialValue())) {
                            varErr.add(new Problem("value is not float!", tVar
                                    .getName()));
                        }
                    } else {
                        for (Literal literals : tVar.getInitialValues()
                                .getInitialValue()) {
                            if (!isVariableFloat(tVar.getInitialValue())) {
                                varErr.add(new Problem("value(s) not float!",
                                        tVar.getName()));
                                break;
                            }
                        }
                    }

                } else if (type.toLowerCase().equals("string")) {
                    // GH even required?

                } else if (type.toLowerCase().equals("boolean")) {
                    if (tVar.getInitialValues() == null) {
                        if (!isVariableBoolean(tVar.getInitialValue())) {
                            varErr.add(new Problem("value is not boolean!",
                                    tVar.getName()));
                        }
                    } else {
                        for (Literal literals : tVar.getInitialValues()
                                .getInitialValue()) {
                            if (!isVariableBoolean(tVar.getInitialValue())) {
                                varErr.add(new Problem("value(s) not boolean!",
                                        tVar.getName()));
                                break;
                            }
                        }
                    }

                } else if (type.toLowerCase().equals("date")) {
                    if (tVar.getInitialValues() == null) {
                        if (!isVariableDate(tVar.getInitialValue())) {
                            varErr.add(new Problem(
                                    "value is not a valid date!", tVar
                                            .getName()));
                        }
                    } else {
                        for (Literal literals : tVar.getInitialValues()
                                .getInitialValue()) {
                            if (!isVariableDate(tVar.getInitialValue())) {
                                varErr.add(new Problem(
                                        "value(s) are not a valid date!", tVar
                                                .getName()));
                                break;
                            }
                        }
                    }

                } else if (type.toLowerCase().equals("time")) {
                    if (tVar.getInitialValues() == null) {
                        if (!isVariableTime(tVar.getInitialValue())) {
                            varErr.add(new Problem(
                                    "value is not a valid time!", tVar
                                            .getName()));
                        }
                    } else {
                        for (Literal literals : tVar.getInitialValues()
                                .getInitialValue()) {
                            if (!isVariableTime(tVar.getInitialValue())) {
                                varErr.add(new Problem(
                                        "value(s) are not a valid time!", tVar
                                                .getName()));
                                break;
                            }
                        }
                    }
                }
            }
        }

        return varErr;
    }

    /**
     * Checks whether the value of the given variable is from type boolean (in
     * this case only true or false are valid)
     * 
     * @param var
     *            the variable to check
     * @return true, if the value of the variable if of type boolean, false if
     *         not
     */
    private boolean isVariableBoolean(Literal var) {
        if (!(var.toString() == "true" || var.toString() == "false")) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Checks whether the value of the given variable is from type integer
     * 
     * @param var
     *            the variable to check
     * @return true, if the value of the variable if of type integer, false if
     *         not
     */
    private boolean isVariableInteger(Literal var) {
        try {
            Integer.parseInt(var.toString());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Checks whether the value of the given variable is from type float
     * 
     * @param var
     *            the variable to check
     * @return true, if the value of the variable if of type float, false if not
     */
    private boolean isVariableFloat(Literal var) {
        try {
            Float.parseFloat(var.toString());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Checks whether the value of the given variable is from type date (see
     * declaration of sdfD)
     * 
     * @param var
     *            the variable to check
     * @return true, if the value of the variable if of type date, false if not
     */
    private boolean isVariableDate(Literal var) {
        try {
            sdfD.parse(var.toString());
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    /**
     * Checks whether the value of the given variable is from type time (see
     * declaration of sdfT)
     * 
     * @param var
     *            the variable to check
     * @return true, if the value of the variable if of type time, false if not
     */
    private boolean isVariableTime(Literal var) {
        try {
            sdfT.parse(var.toString());
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
