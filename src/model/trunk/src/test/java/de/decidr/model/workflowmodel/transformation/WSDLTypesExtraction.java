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

package de.decidr.model.workflowmodel.transformation;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.wsdl.Definition;
import javax.wsdl.WSDLException;
import javax.wsdl.extensions.ExtensibilityElement;
import javax.wsdl.extensions.UnknownExtensibilityElement;
import javax.wsdl.factory.WSDLFactory;

import org.jdom.input.DOMBuilder;
import org.jdom.output.XMLOutputter;
import org.xml.sax.InputSource;

/**
 * Test wsdl types extraction
 * 
 * @author Modood Alvi
 */
public class WSDLTypesExtraction {

    public static void main(String[] args) throws WSDLException, IOException {
        String wsdlName = "/HumanTaskTest.wsdl";
        WSDLFactory wsdlFactory = WSDLFactory.newInstance();
        javax.wsdl.xml.WSDLReader wsdlReader = wsdlFactory.newWSDLReader();

        wsdlReader.setFeature("javax.wsdl.verbose", true);
        wsdlReader.setFeature("javax.wsdl.importDocuments", true);

        System.out.println("getting wsdl definition...");
        Definition definition = wsdlReader.readWSDL(null, new InputSource(
                WSDLTypesExtraction.class.getResourceAsStream(wsdlName)));
        System.out.println("definition got. parsing.");
        if (definition == null) {
            System.err.println("definition element is null");
            System.exit(1);
        }

        org.w3c.dom.Element schemaElement = null;

        ExtensibilityElement schemaExtElem = findExtensibilityElement(
                definition.getTypes().getExtensibilityElements(), "schema");
        if ((schemaExtElem != null)
                && (schemaExtElem instanceof UnknownExtensibilityElement)) {
            schemaElement = ((UnknownExtensibilityElement) schemaExtElem)
                    .getElement();
        }
        DOMBuilder domBuilder = new DOMBuilder();
        org.jdom.Element jdomSchemaElement = domBuilder.build(schemaElement);
        XMLOutputter out = new XMLOutputter();
        out.output(jdomSchemaElement, System.out);
    }

    private static ExtensibilityElement findExtensibilityElement(
            List extensibilityElements, String name) {
        Iterator itt = extensibilityElements.iterator();
        while (itt.hasNext()) {
            ExtensibilityElement ext = (ExtensibilityElement) itt.next();
            if (ext.getElementType().getLocalPart().equals(name)) {
                return ext;
            }
        }
        throw new RuntimeException("Ext element with name " + name
                + " was not found.");
    }

}
