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
package de.decidr.odemonitor.service;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
 *       &lt;sequence&gt;
 *         &lt;element name=&quot;wfInstances&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}integer&quot;/&gt;
 *         &lt;element name=&quot;wfModels&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}integer&quot;/&gt;
 *         &lt;element name=&quot;odeID&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot;/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "wfInstances", "wfModels", "odeID" })
@XmlRootElement(name = "updateStats")
public class UpdateStats {

    @XmlElement(required = true)
    protected BigInteger wfInstances;
    @XmlElement(required = true)
    protected BigInteger wfModels;
    @XmlElement(required = true)
    protected String odeID;

    /**
     * Gets the value of the wfInstances property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getWfInstances() {
        return wfInstances;
    }

    /**
     * Sets the value of the wfInstances property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setWfInstances(BigInteger value) {
        this.wfInstances = value;
    }

    /**
     * Gets the value of the wfModels property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getWfModels() {
        return wfModels;
    }

    /**
     * Sets the value of the wfModels property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setWfModels(BigInteger value) {
        this.wfModels = value;
    }

    /**
     * Gets the value of the odeID property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getOdeID() {
        return odeID;
    }

    /**
     * Sets the value of the odeID property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setOdeID(String value) {
        this.odeID = value;
    }

}
