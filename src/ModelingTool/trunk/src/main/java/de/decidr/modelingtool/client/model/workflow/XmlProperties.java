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

package de.decidr.modelingtool.client.model.workflow;

/**
 * This class holds some xml properties of the dwdl representation of a
 * workflow. These xml properties (such as header, namespace, schema etc.) may
 * not be edited by the user.
 * 
 * @author Jonas
 */
public class XmlProperties {

    //JS fallback constants
    
    private String namespace;
    private String schema;
    private String header;

    public String getHeader() {
        return header;
    }

    public String getNamespace() {
        return namespace;
    }

    public String getSchema() {
        return schema;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

}
