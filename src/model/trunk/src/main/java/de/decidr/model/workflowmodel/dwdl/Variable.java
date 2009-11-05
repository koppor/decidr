//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.05 at 06:27:20 PM MEZ 
//


package de.decidr.model.workflowmodel.dwdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for tVariable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tVariable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="initialValue" type="{http://decidr.de/schema/dwdl}tLiteral"/>
 *           &lt;element name="initialValues" type="{http://decidr.de/schema/dwdl}tInitialValues"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="type" use="required" type="{http://decidr.de/schema/dwdl}DWDLVariableType" />
 *       &lt;attribute name="configurationVariable" type="{http://decidr.de/schema/dwdl}tBoolean" default="no" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tVariable", propOrder = {
    "initialValue",
    "initialValues"
})
public class Variable {

    protected Literal initialValue;
    protected InitialValues initialValues;
    @XmlAttribute
    protected String label;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlAttribute(required = true)
    protected String type;
    @XmlAttribute
    protected Boolean configurationVariable;

    /**
     * Gets the value of the initialValue property.
     * 
     * @return
     *     possible object is
     *     {@link Literal }
     *     
     */
    public Literal getInitialValue() {
        return initialValue;
    }

    /**
     * Sets the value of the initialValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Literal }
     *     
     */
    public void setInitialValue(Literal value) {
        this.initialValue = value;
    }

    public boolean isSetInitialValue() {
        return (this.initialValue!= null);
    }

    /**
     * Gets the value of the initialValues property.
     * 
     * @return
     *     possible object is
     *     {@link InitialValues }
     *     
     */
    public InitialValues getInitialValues() {
        return initialValues;
    }

    /**
     * Sets the value of the initialValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitialValues }
     *     
     */
    public void setInitialValues(InitialValues value) {
        this.initialValues = value;
    }

    public boolean isSetInitialValues() {
        return (this.initialValues!= null);
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    public boolean isSetLabel() {
        return (this.label!= null);
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name!= null);
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the configurationVariable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getConfigurationVariable() {
        if (configurationVariable == null) {
            return Boolean.NO;
        } else {
            return configurationVariable;
        }
    }

    /**
     * Sets the value of the configurationVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfigurationVariable(Boolean value) {
        this.configurationVariable = value;
    }

    public boolean isSetConfigurationVariable() {
        return (this.configurationVariable!= null);
    }

}
