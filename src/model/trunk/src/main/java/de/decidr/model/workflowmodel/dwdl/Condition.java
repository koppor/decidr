//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.08.11 at 09:17:08 PM MESZ 
//


package de.decidr.model.workflowmodel.dwdl;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tCondition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="left-operand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="right-operand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://decidr.de/schema/dwdl}nodes"/>
 *         &lt;element ref="{http://decidr.de/schema/dwdl}arcs"/>
 *       &lt;/sequence>
 *       &lt;attribute name="order" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="defaultCondition" type="{http://decidr.de/schema/dwdl}tBoolean" default="no" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCondition", propOrder = {
    "leftOperand",
    "operator",
    "rightOperand",
    "nodes",
    "arcs"
})
public class Condition {

    @XmlElement(name = "left-operand")
    protected String leftOperand;
    protected String operator;
    @XmlElement(name = "right-operand")
    protected String rightOperand;
    @XmlElement(required = true)
    protected Nodes nodes;
    @XmlElement(required = true)
    protected Arcs arcs;
    @XmlAttribute
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;
    @XmlAttribute
    protected Boolean defaultCondition;

    /**
     * Gets the value of the leftOperand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeftOperand() {
        return leftOperand;
    }

    /**
     * Sets the value of the leftOperand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeftOperand(String value) {
        this.leftOperand = value;
    }

    public boolean isSetLeftOperand() {
        return (this.leftOperand!= null);
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

    public boolean isSetOperator() {
        return (this.operator!= null);
    }

    /**
     * Gets the value of the rightOperand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightOperand() {
        return rightOperand;
    }

    /**
     * Sets the value of the rightOperand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightOperand(String value) {
        this.rightOperand = value;
    }

    public boolean isSetRightOperand() {
        return (this.rightOperand!= null);
    }

    /**
     * Gets the value of the nodes property.
     * 
     * @return
     *     possible object is
     *     {@link Nodes }
     *     
     */
    public Nodes getNodes() {
        return nodes;
    }

    /**
     * Sets the value of the nodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Nodes }
     *     
     */
    public void setNodes(Nodes value) {
        this.nodes = value;
    }

    public boolean isSetNodes() {
        return (this.nodes!= null);
    }

    /**
     * Gets the value of the arcs property.
     * 
     * @return
     *     possible object is
     *     {@link Arcs }
     *     
     */
    public Arcs getArcs() {
        return arcs;
    }

    /**
     * Sets the value of the arcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Arcs }
     *     
     */
    public void setArcs(Arcs value) {
        this.arcs = value;
    }

    public boolean isSetArcs() {
        return (this.arcs!= null);
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

    public boolean isSetOrder() {
        return (this.order!= null);
    }

    /**
     * Gets the value of the defaultCondition property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDefaultCondition() {
        if (defaultCondition == null) {
            return Boolean.NO;
        } else {
            return defaultCondition;
        }
    }

    /**
     * Sets the value of the defaultCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultCondition(Boolean value) {
        this.defaultCondition = value;
    }

    public boolean isSetDefaultCondition() {
        return (this.defaultCondition!= null);
    }

}
