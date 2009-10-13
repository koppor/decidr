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
package de.decidr.model.soap.types;

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
 *         &lt;element name=&quot;taskID&quot; type=&quot;{http://decidr.de/schema/DecidrTypes}tID&quot;/&gt;
 *         &lt;element name=&quot;processID&quot; type=&quot;{http://decidr.de/schema/DecidrTypes}tID&quot;/&gt;
 *         &lt;element name=&quot;userID&quot; type=&quot;{http://decidr.de/schema/DecidrTypes}tID&quot;/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "taskID", "processID", "userID" })
@XmlRootElement(name = "tTaskIdentifier")
public class TaskIdentifier {

    @XmlElement(required = true)
    protected long taskID;
    @XmlElement(required = true)
    protected String processID;
    @XmlElement(required = true)
    protected long userID;

    /**
     * Default constructor needed by JAXB.
     */
    public TaskIdentifier() {
        // nothing to initialize
    }

    /**
     * Convenience constructor which can be used to ensure that all values have
     * been set.
     */
    public TaskIdentifier(long taskID, String processID, long userID) {
        this.taskID = taskID;
        this.processID = processID;
        this.userID = userID;
    }

    /**
     * Gets the value of the taskID property.
     */
    public long getTaskID() {
        return taskID;
    }

    /**
     * Sets the value of the taskID property.
     */
    public void setTaskID(long value) {
        this.taskID = value;
    }

    /**
     * Gets the value of the processID property.
     */
    public String getProcessID() {
        return processID;
    }

    /**
     * Sets the value of the processID property.
     */
    public void setProcessID(String value) {
        this.processID = value;
    }

    /**
     * Gets the value of the userID property.
     */
    public long getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     */
    public void setUserID(long value) {
        this.userID = value;
    }
}
