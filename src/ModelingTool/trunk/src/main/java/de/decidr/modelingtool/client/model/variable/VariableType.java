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

package de.decidr.modelingtool.client.model.variable;

import de.decidr.modelingtool.client.ModelingToolWidget;

/**
 * TODO: add comment
 * 
 * @author Jonas Schlaak
 */
public enum VariableType {

    // JS externalize dwdl name
    STRING("string", ModelingToolWidget.messages.typeString()), INTEGER(
            "integer", ModelingToolWidget.messages.typeInteger()), FLOAT(
            "float", ModelingToolWidget.messages.typeFloat()), BOOLEAN(
            "boolean", ModelingToolWidget.messages.typeBoolean()), FILE(
            "anyURI", ModelingToolWidget.messages.typeFile()), DATE("date",
            ModelingToolWidget.messages.typeDate()), ROLE("null",
            ModelingToolWidget.messages.typeRole()), FORM("form",
            ModelingToolWidget.messages.typeForm());

    private final String dwdlName;

    private final String localName;

    private VariableType(String dwdlName, String localName) {
        this.dwdlName = dwdlName;
        this.localName = localName;
    }

    /**
     * 
     * This method returns the dwdl name the variable type has according to the
     * dwdl structure document.
     * 
     * @return dwdl name
     */
    public String getDwdlName() {
        return dwdlName;
    }

    /**
     * 
     * This methods returns the localized name of the variable type (e.g.
     * "Datei" for "File") in a proper format (i.e. no caps).
     * 
     * @return local name
     */
    public String getLocalName() {
        return localName;
    }

    public static VariableType getTypeFromLocalName(String localName) {
        VariableType result = null;
        for (VariableType t : VariableType.values()) {
            if (localName == t.getLocalName())
                result = t;
        }
        return result;
    }
}
