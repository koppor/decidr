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
// Generated on: 2009.11.07 at 09:21:14 PM MEZ 
//

package de.decidr.model.workflowmodel.bpel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for tWait complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="tWait">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/wsbpel/2.0/process/executable}tActivity">
 *       &lt;choice>
 *         &lt;element ref="{http://docs.oasis-open.org/wsbpel/2.0/process/executable}for"/>
 *         &lt;element ref="{http://docs.oasis-open.org/wsbpel/2.0/process/executable}until"/>
 *       &lt;/choice>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tWait", propOrder = { "_for", "until" })
public class Wait extends Activity {

    @XmlElement(name = "for")
    protected DurationExpression _for;
    protected DeadlineExpression until;

    /**
     * Gets the value of the for property.
     * 
     * @return possible object is {@link DurationExpression }
     * 
     */
    public DurationExpression getFor() {
        return _for;
    }

    /**
     * Gets the value of the until property.
     * 
     * @return possible object is {@link DeadlineExpression }
     * 
     */
    public DeadlineExpression getUntil() {
        return until;
    }

    public boolean isSetFor() {
        return (this._for != null);
    }

    public boolean isSetUntil() {
        return (this.until != null);
    }

    /**
     * Sets the value of the for property.
     * 
     * @param value
     *            allowed object is {@link DurationExpression }
     * 
     */
    public void setFor(DurationExpression value) {
        this._for = value;
    }

    /**
     * Sets the value of the until property.
     * 
     * @param value
     *            allowed object is {@link DeadlineExpression }
     * 
     */
    public void setUntil(DeadlineExpression value) {
        this.until = value;
    }

}
