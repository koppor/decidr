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
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.05 at 06:27:20 PM MEZ 
//

package de.decidr.model.workflowmodel.dwdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for tFlowNode complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="tFlowNode">
 *   &lt;complexContent>
 *     &lt;extension base="{http://decidr.de/schema/dwdl}tBasicNode">
 *       &lt;sequence>
 *         &lt;element ref="{http://decidr.de/schema/dwdl}nodes"/>
 *         &lt;element ref="{http://decidr.de/schema/dwdl}arcs"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tFlowNode", propOrder = { "nodes", "arcs" })
public class FlowNode extends BasicNode {

    @XmlElement(required = true)
    protected Nodes nodes;
    @XmlElement(required = true)
    protected Arcs arcs;

    /**
     * Gets the value of the arcs property.
     * 
     * @return possible object is {@link Arcs }
     * 
     */
    public Arcs getArcs() {
        return arcs;
    }

    /**
     * Gets the value of the nodes property.
     * 
     * @return possible object is {@link Nodes }
     * 
     */
    public Nodes getNodes() {
        return nodes;
    }

    public boolean isSetArcs() {
        return (this.arcs != null);
    }

    public boolean isSetNodes() {
        return (this.nodes != null);
    }

    /**
     * Sets the value of the arcs property.
     * 
     * @param value
     *            allowed object is {@link Arcs }
     * 
     */
    public void setArcs(Arcs value) {
        this.arcs = value;
    }

    /**
     * Sets the value of the nodes property.
     * 
     * @param value
     *            allowed object is {@link Nodes }
     * 
     */
    public void setNodes(Nodes value) {
        this.nodes = value;
    }

}
