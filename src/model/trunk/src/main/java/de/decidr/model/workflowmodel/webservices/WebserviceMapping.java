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
// Generated on: 2009.11.14 at 04:34:51 PM MEZ 
//

package de.decidr.model.workflowmodel.webservices;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Java class for WebserviceMapping complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="WebserviceMapping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activity" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *         &lt;element name="portType" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *         &lt;element name="operation" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *         &lt;element name="binding" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *         &lt;element name="partnerLinkType" type="{http://decidr.de/schema/wsmapping}PLTInfo"/>
 *         &lt;element name="service" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *         &lt;element name="servicePort" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *         &lt;element name="properties" type="{http://decidr.de/schema/wsmapping}Properties" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="propertyAliases" type="{http://decidr.de/schema/wsmapping}PropertyAliases" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebserviceMapping", propOrder = { "activity", "portType",
        "operation", "binding", "partnerLinkType", "service", "servicePort",
        "properties", "propertyAliases" })
public class WebserviceMapping {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String activity;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String portType;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String operation;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String binding;
    @XmlElement(required = true)
    protected PLTInfo partnerLinkType;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String service;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String servicePort;
    protected List<Properties> properties;
    protected List<PropertyAliases> propertyAliases;

    /**
     * Gets the value of the activity property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getActivity() {
        return activity;
    }

    /**
     * Gets the value of the binding property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getBinding() {
        return binding;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Gets the value of the partnerLinkType property.
     * 
     * @return possible object is {@link PLTInfo }
     * 
     */
    public PLTInfo getPartnerLinkType() {
        return partnerLinkType;
    }

    /**
     * Gets the value of the portType property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPortType() {
        return portType;
    }

    /**
     * Gets the value of the properties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the properties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Properties }
     * 
     * 
     */
    public List<Properties> getProperties() {
        if (properties == null) {
            properties = new ArrayList<Properties>();
        }
        return this.properties;
    }

    /**
     * Gets the value of the propertyAliases property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the propertyAliases property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getPropertyAliases().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyAliases }
     * 
     * 
     */
    public List<PropertyAliases> getPropertyAliases() {
        if (propertyAliases == null) {
            propertyAliases = new ArrayList<PropertyAliases>();
        }
        return this.propertyAliases;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getService() {
        return service;
    }

    /**
     * Gets the value of the servicePort property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getServicePort() {
        return servicePort;
    }

    public boolean isSetActivity() {
        return (this.activity != null);
    }

    public boolean isSetBinding() {
        return (this.binding != null);
    }

    public boolean isSetOperation() {
        return (this.operation != null);
    }

    public boolean isSetPartnerLinkType() {
        return (this.partnerLinkType != null);
    }

    public boolean isSetPortType() {
        return (this.portType != null);
    }

    public boolean isSetProperties() {
        return ((this.properties != null) && (!this.properties.isEmpty()));
    }

    public boolean isSetPropertyAliases() {
        return ((this.propertyAliases != null) && (!this.propertyAliases
                .isEmpty()));
    }

    public boolean isSetService() {
        return (this.service != null);
    }

    public boolean isSetServicePort() {
        return (this.servicePort != null);
    }

    /**
     * Sets the value of the activity property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setActivity(String value) {
        this.activity = value;
    }

    /**
     * Sets the value of the binding property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setBinding(String value) {
        this.binding = value;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    /**
     * Sets the value of the partnerLinkType property.
     * 
     * @param value
     *            allowed object is {@link PLTInfo }
     * 
     */
    public void setPartnerLinkType(PLTInfo value) {
        this.partnerLinkType = value;
    }

    /**
     * Sets the value of the portType property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setPortType(String value) {
        this.portType = value;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setService(String value) {
        this.service = value;
    }

    /**
     * Sets the value of the servicePort property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setServicePort(String value) {
        this.servicePort = value;
    }

    public void unsetProperties() {
        this.properties = null;
    }

    public void unsetPropertyAliases() {
        this.propertyAliases = null;
    }

}
