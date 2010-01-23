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

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * XSD Authors: The child element onAlarm needs to be a Local Element
 * Declaration, because there is another onAlarm element defined for the pick
 * activity.
 * 
 * 
 * <p>
 * Java class for tEventHandlers complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="tEventHandlers">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/wsbpel/2.0/process/executable}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/wsbpel/2.0/process/executable}onEvent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="onAlarm" type="{http://docs.oasis-open.org/wsbpel/2.0/process/executable}tOnAlarmEvent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tEventHandlers", propOrder = { "onEvent", "onAlarm" })
public class EventHandlers extends ExtensibleElements {

    protected List<OnEvent> onEvent;
    protected List<OnAlarmEvent> onAlarm;

    /**
     * Gets the value of the onAlarm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the onAlarm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getOnAlarm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OnAlarmEvent }
     * 
     * 
     */
    public List<OnAlarmEvent> getOnAlarm() {
        if (onAlarm == null) {
            onAlarm = new ArrayList<OnAlarmEvent>();
        }
        return this.onAlarm;
    }

    /**
     * Gets the value of the onEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the onEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getOnEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link OnEvent }
     * 
     * 
     */
    public List<OnEvent> getOnEvent() {
        if (onEvent == null) {
            onEvent = new ArrayList<OnEvent>();
        }
        return this.onEvent;
    }

    public boolean isSetOnAlarm() {
        return ((this.onAlarm != null) && (!this.onAlarm.isEmpty()));
    }

    public boolean isSetOnEvent() {
        return ((this.onEvent != null) && (!this.onEvent.isEmpty()));
    }

    public void unsetOnAlarm() {
        this.onAlarm = null;
    }

    public void unsetOnEvent() {
        this.onEvent = null;
    }

}
