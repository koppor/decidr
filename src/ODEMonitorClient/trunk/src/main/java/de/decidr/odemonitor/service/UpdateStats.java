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
 *         &lt;element name=&quot;wfInstances&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}int&quot;/&gt;
 *         &lt;element name=&quot;wfModels&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}int&quot;/&gt;
 *         &lt;element name=&quot;cpuUsage&quot; type=&quot;{http://decidr.de/webservices/ODEMonitor}zeroHundredInt&quot;/&gt;
 *         &lt;element name=&quot;memUsage&quot; type=&quot;{http://decidr.de/webservices/ODEMonitor}zeroHundredInt&quot;/&gt;
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
@XmlType(name = "", propOrder = { "wfInstances", "wfModels", "cpuUsage",
        "memUsage", "odeID" })
@XmlRootElement(name = "updateStats")
public class UpdateStats {

    protected int wfInstances;
    protected int wfModels;
    protected int cpuUsage;
    protected int memUsage;
    @XmlElement(required = true)
    protected String odeID;

    /**
     * Gets the value of the wfInstances property.
     * 
     */
    public int getWfInstances() {
        return wfInstances;
    }

    /**
     * Sets the value of the wfInstances property.
     * 
     */
    public void setWfInstances(int value) {
        this.wfInstances = value;
    }

    /**
     * Gets the value of the wfModels property.
     * 
     */
    public int getWfModels() {
        return wfModels;
    }

    /**
     * Sets the value of the wfModels property.
     * 
     */
    public void setWfModels(int value) {
        this.wfModels = value;
    }

    /**
     * Gets the value of the cpuUsage property.
     * 
     */
    public int getCpuUsage() {
        return cpuUsage;
    }

    /**
     * Sets the value of the cpuUsage property.
     * 
     */
    public void setCpuUsage(int value) {
        this.cpuUsage = value;
    }

    /**
     * Gets the value of the memUsage property.
     * 
     */
    public int getMemUsage() {
        return memUsage;
    }

    /**
     * Sets the value of the memUsage property.
     * 
     */
    public void setMemUsage(int value) {
        this.memUsage = value;
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
