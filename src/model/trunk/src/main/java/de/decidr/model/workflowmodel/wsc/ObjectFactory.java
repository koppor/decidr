//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.08.28 at 04:33:51 PM MESZ 
//


package de.decidr.model.workflowmodel.wsc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.decidr.model.workfowmodel.wsc package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Roles_QNAME = new QName("http://decidr.de/schema/wsc", "roles");
    private final static QName _Assignment_QNAME = new QName("http://decidr.de/schema/wsc", "assignment");
    private final static QName _Configurations_QNAME = new QName("http://decidr.de/schema/wsc", "configurations");
    private final static QName _Actor_QNAME = new QName("http://decidr.de/schema/wsc", "actor");
    private final static QName _Role_QNAME = new QName("http://decidr.de/schema/wsc", "role");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.decidr.model.workfowmodel.wsc
     * 
     */
    public ObjectFactory() {
        // TODO document empty block
    }

    /**
     * Create an instance of {@link TConfiguration }
     * 
     */
    public TConfiguration createTConfiguration() {
        return new TConfiguration();
    }

    /**
     * Create an instance of {@link TRoles }
     * 
     */
    public TRoles createTRoles() {
        return new TRoles();
    }

    /**
     * Create an instance of {@link TAssignment }
     * 
     */
    public TAssignment createTAssignment() {
        return new TAssignment();
    }

    /**
     * Create an instance of {@link TRole }
     * 
     */
    public TRole createTRole() {
        return new TRole();
    }

    /**
     * Create an instance of {@link TActor }
     * 
     */
    public TActor createTActor() {
        return new TActor();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TRoles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/wsc", name = "roles")
    public JAXBElement<TRoles> createRoles(TRoles value) {
        return new JAXBElement<TRoles>(_Roles_QNAME, TRoles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TAssignment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/wsc", name = "assignment")
    public JAXBElement<TAssignment> createAssignment(TAssignment value) {
        return new JAXBElement<TAssignment>(_Assignment_QNAME, TAssignment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/wsc", name = "configurations")
    public JAXBElement<TConfiguration> createConfigurations(TConfiguration value) {
        return new JAXBElement<TConfiguration>(_Configurations_QNAME, TConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TActor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/wsc", name = "actor")
    public JAXBElement<TActor> createActor(TActor value) {
        return new JAXBElement<TActor>(_Actor_QNAME, TActor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/wsc", name = "role")
    public JAXBElement<TRole> createRole(TRole value) {
        return new JAXBElement<TRole>(_Role_QNAME, TRole.class, null, value);
    }

}
