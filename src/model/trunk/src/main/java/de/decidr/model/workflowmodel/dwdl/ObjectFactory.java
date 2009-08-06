//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.08.06 at 06:31:56 PM MESZ 
//


package de.decidr.model.workflowmodel.dwdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.decidr.model.workflowmodel.dwdl package. 
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

    private final static QName _ForEachNode_QNAME = new QName("http://decidr.de/schema/dwdl", "forEachNode");
    private final static QName _StartNode_QNAME = new QName("http://decidr.de/schema/dwdl", "startNode");
    private final static QName _Actor_QNAME = new QName("http://decidr.de/schema/dwdl", "actor");
    private final static QName _CompletionCondition_QNAME = new QName("http://decidr.de/schema/dwdl", "completionCondition");
    private final static QName _StartCounterValue_QNAME = new QName("http://decidr.de/schema/dwdl", "startCounterValue");
    private final static QName _Sources_QNAME = new QName("http://decidr.de/schema/dwdl", "sources");
    private final static QName _Recipient_QNAME = new QName("http://decidr.de/schema/dwdl", "recipient");
    private final static QName _InvokeNode_QNAME = new QName("http://decidr.de/schema/dwdl", "invokeNode");
    private final static QName _Description_QNAME = new QName("http://decidr.de/schema/dwdl", "description");
    private final static QName _Role_QNAME = new QName("http://decidr.de/schema/dwdl", "role");
    private final static QName _BasicNode_QNAME = new QName("http://decidr.de/schema/dwdl", "basicNode");
    private final static QName _Graphics_QNAME = new QName("http://decidr.de/schema/dwdl", "graphics");
    private final static QName _Targets_QNAME = new QName("http://decidr.de/schema/dwdl", "targets");
    private final static QName _FinalCounterValue_QNAME = new QName("http://decidr.de/schema/dwdl", "finalCounterValue");
    private final static QName _IfNode_QNAME = new QName("http://decidr.de/schema/dwdl", "ifNode");
    private final static QName _FaultHandler_QNAME = new QName("http://decidr.de/schema/dwdl", "faultHandler");
    private final static QName _Condition_QNAME = new QName("http://decidr.de/schema/dwdl", "condition");
    private final static QName _HumanTaskData_QNAME = new QName("http://decidr.de/schema/dwdl", "humanTaskData");
    private final static QName _SetProperty_QNAME = new QName("http://decidr.de/schema/dwdl", "setProperty");
    private final static QName _Workflow_QNAME = new QName("http://decidr.de/schema/dwdl", "workflow");
    private final static QName _EndNode_QNAME = new QName("http://decidr.de/schema/dwdl", "endNode");
    private final static QName _Variables_QNAME = new QName("http://decidr.de/schema/dwdl", "variables");
    private final static QName _Arcs_QNAME = new QName("http://decidr.de/schema/dwdl", "arcs");
    private final static QName _Content_QNAME = new QName("http://decidr.de/schema/dwdl", "content");
    private final static QName _FlowNode_QNAME = new QName("http://decidr.de/schema/dwdl", "flowNode");
    private final static QName _Source_QNAME = new QName("http://decidr.de/schema/dwdl", "source");
    private final static QName _Roles_QNAME = new QName("http://decidr.de/schema/dwdl", "roles");
    private final static QName _GetProperty_QNAME = new QName("http://decidr.de/schema/dwdl", "getProperty");
    private final static QName _Nodes_QNAME = new QName("http://decidr.de/schema/dwdl", "nodes");
    private final static QName _Target_QNAME = new QName("http://decidr.de/schema/dwdl", "target");
    private final static QName _Variable_QNAME = new QName("http://decidr.de/schema/dwdl", "variable");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.decidr.model.workflowmodel.dwdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Arc }
     * 
     */
    public Arc createArc() {
        return new Arc();
    }

    /**
     * Create an instance of {@link Target }
     * 
     */
    public Target createTarget() {
        return new Target();
    }

    /**
     * Create an instance of {@link Source }
     * 
     */
    public Source createSource() {
        return new Source();
    }

    /**
     * Create an instance of {@link HumanTaskData }
     * 
     */
    public HumanTaskData createHumanTaskData() {
        return new HumanTaskData();
    }

    /**
     * Create an instance of {@link IfNode }
     * 
     */
    public IfNode createIfNode() {
        return new IfNode();
    }

    /**
     * Create an instance of {@link Arcs }
     * 
     */
    public Arcs createArcs() {
        return new Arcs();
    }

    /**
     * Create an instance of {@link Recipient }
     * 
     */
    public Recipient createRecipient() {
        return new Recipient();
    }

    /**
     * Create an instance of {@link Literal }
     * 
     */
    public Literal createLiteral() {
        return new Literal();
    }

    /**
     * Create an instance of {@link Workflow }
     * 
     */
    public Workflow createWorkflow() {
        return new Workflow();
    }

    /**
     * Create an instance of {@link Variables }
     * 
     */
    public Variables createVariables() {
        return new Variables();
    }

    /**
     * Create an instance of {@link Graphics }
     * 
     */
    public Graphics createGraphics() {
        return new Graphics();
    }

    /**
     * Create an instance of {@link Notification }
     * 
     */
    public Notification createNotification() {
        return new Notification();
    }

    /**
     * Create an instance of {@link FaultHandler }
     * 
     */
    public FaultHandler createFaultHandler() {
        return new FaultHandler();
    }

    /**
     * Create an instance of {@link Parameter }
     * 
     */
    public Parameter createParameter() {
        return new Parameter();
    }

    /**
     * Create an instance of {@link InitialValues }
     * 
     */
    public InitialValues createInitialValues() {
        return new InitialValues();
    }

    /**
     * Create an instance of {@link BasicNode }
     * 
     */
    public BasicNode createBasicNode() {
        return new BasicNode();
    }

    /**
     * Create an instance of {@link Parameters }
     * 
     */
    public Parameters createParameters() {
        return new Parameters();
    }

    /**
     * Create an instance of {@link Condition }
     * 
     */
    public Condition createCondition() {
        return new Condition();
    }

    /**
     * Create an instance of {@link StartNode }
     * 
     */
    public StartNode createStartNode() {
        return new StartNode();
    }

    /**
     * Create an instance of {@link Variable }
     * 
     */
    public Variable createVariable() {
        return new Variable();
    }

    /**
     * Create an instance of {@link TaskItem }
     * 
     */
    public TaskItem createTaskItem() {
        return new TaskItem();
    }

    /**
     * Create an instance of {@link Actor }
     * 
     */
    public Actor createActor() {
        return new Actor();
    }

    /**
     * Create an instance of {@link ForEachNode }
     * 
     */
    public ForEachNode createForEachNode() {
        return new ForEachNode();
    }

    /**
     * Create an instance of {@link EndNode }
     * 
     */
    public EndNode createEndNode() {
        return new EndNode();
    }

    /**
     * Create an instance of {@link Roles }
     * 
     */
    public Roles createRoles() {
        return new Roles();
    }

    /**
     * Create an instance of {@link Targets }
     * 
     */
    public Targets createTargets() {
        return new Targets();
    }

    /**
     * Create an instance of {@link Information }
     * 
     */
    public Information createInformation() {
        return new Information();
    }

    /**
     * Create an instance of {@link Content }
     * 
     */
    public Content createContent() {
        return new Content();
    }

    /**
     * Create an instance of {@link Role }
     * 
     */
    public Role createRole() {
        return new Role();
    }

    /**
     * Create an instance of {@link InvokeNode }
     * 
     */
    public InvokeNode createInvokeNode() {
        return new InvokeNode();
    }

    /**
     * Create an instance of {@link Sources }
     * 
     */
    public Sources createSources() {
        return new Sources();
    }

    /**
     * Create an instance of {@link GetProperty }
     * 
     */
    public GetProperty createGetProperty() {
        return new GetProperty();
    }

    /**
     * Create an instance of {@link SetProperty }
     * 
     */
    public SetProperty createSetProperty() {
        return new SetProperty();
    }

    /**
     * Create an instance of {@link FlowNode }
     * 
     */
    public FlowNode createFlowNode() {
        return new FlowNode();
    }

    /**
     * Create an instance of {@link Nodes }
     * 
     */
    public Nodes createNodes() {
        return new Nodes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForEachNode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/dwdl", name = "forEachNode")
    public JAXBElement<ForEachNode> createForEachNode(ForEachNode value) {
        return new JAXBElement<ForEachNode>(_ForEachNode_QNAME, ForEachNode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartNode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/dwdl", name = "startNode")
    public JAXBElement<StartNode> createStartNode(StartNode value) {
        return new JAXBElement<StartNode>(_StartNode_QNAME, StartNode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Actor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/dwdl", name = "actor")
    public JAXBElement<Actor> createActor(Actor value) {
        return new JAXBElement<Actor>(_Actor_QNAME, Actor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/dwdl", name = "completionCondition")
    public JAXBElement<String> createCompletionCondition(String value) {
        return new JAXBElement<String>(_CompletionCondition_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/dwdl", name = "startCounterValue")
    public JAXBElement<String> createStartCounterValue(String value) {
        return new JAXBElement<String>(_StartCounterValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sources }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/dwdl", name = "sources")
    public JAXBElement<Sources> createSources(Sources value) {
        return new JAXBElement<Sources>(_Sources_QNAME, Sources.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Recipient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/dwdl", name = "recipient")
    public JAXBElement<Recipient> createRecipient(Recipient value) {
        return new JAXBElement<Recipient>(_Recipient_QNAME, Recipient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeNode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/dwdl", name = "invokeNode")
    public JAXBElement<InvokeNode> createInvokeNode(InvokeNode value) {
        return new JAXBElement<InvokeNode>(_InvokeNode_QNAME, InvokeNode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/dwdl", name = "description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Role }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/dwdl", name = "role")
    public JAXBElement<Role> createRole(Role value) {
        return new JAXBElement<Role>(_Role_QNAME, Role.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BasicNode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/dwdl", name = "basicNode")
    public JAXBElement<BasicNode> createBasicNode(BasicNode value) {
        return new JAXBElement<BasicNode>(_BasicNode_QNAME, BasicNode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Graphics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/dwdl", name = "graphics")
    public JAXBElement<Graphics> createGraphics(Graphics value) {
        return new JAXBElement<Graphics>(_Graphics_QNAME, Graphics.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Targets }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/dwdl", name = "targets")
    public JAXBElement<Targets> createTargets(Targets value) {
        return new JAXBElement<Targets>(_Targets_QNAME, Targets.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/dwdl", name = "finalCounterValue")
    public JAXBElement<String> createFinalCounterValue(String value) {
        return new JAXBElement<String>(_FinalCounterValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfNode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/dwdl", name = "ifNode")
    public JAXBElement<IfNode> createIfNode(IfNode value) {
        return new JAXBElement<IfNode>(_IfNode_QNAME, IfNode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultHandler }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/dwdl", name = "faultHandler")
    public JAXBElement<FaultHandler> createFaultHandler(FaultHandler value) {
        return new JAXBElement<FaultHandler>(_FaultHandler_QNAME, FaultHandler.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Condition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/dwdl", name = "condition")
    public JAXBElement<Condition> createCondition(Condition value) {
        return new JAXBElement<Condition>(_Condition_QNAME, Condition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HumanTaskData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/dwdl", name = "humanTaskData")
    public JAXBElement<HumanTaskData> createHumanTaskData(HumanTaskData value) {
        return new JAXBElement<HumanTaskData>(_HumanTaskData_QNAME, HumanTaskData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetProperty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/dwdl", name = "setProperty")
    public JAXBElement<SetProperty> createSetProperty(SetProperty value) {
        return new JAXBElement<SetProperty>(_SetProperty_QNAME, SetProperty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Workflow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/dwdl", name = "workflow")
    public JAXBElement<Workflow> createWorkflow(Workflow value) {
        return new JAXBElement<Workflow>(_Workflow_QNAME, Workflow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndNode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/dwdl", name = "endNode")
    public JAXBElement<EndNode> createEndNode(EndNode value) {
        return new JAXBElement<EndNode>(_EndNode_QNAME, EndNode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Variables }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/dwdl", name = "variables")
    public JAXBElement<Variables> createVariables(Variables value) {
        return new JAXBElement<Variables>(_Variables_QNAME, Variables.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Arcs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/dwdl", name = "arcs")
    public JAXBElement<Arcs> createArcs(Arcs value) {
        return new JAXBElement<Arcs>(_Arcs_QNAME, Arcs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Content }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/dwdl", name = "content")
    public JAXBElement<Content> createContent(Content value) {
        return new JAXBElement<Content>(_Content_QNAME, Content.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlowNode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/dwdl", name = "flowNode")
    public JAXBElement<FlowNode> createFlowNode(FlowNode value) {
        return new JAXBElement<FlowNode>(_FlowNode_QNAME, FlowNode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Source }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/dwdl", name = "source")
    public JAXBElement<Source> createSource(Source value) {
        return new JAXBElement<Source>(_Source_QNAME, Source.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Roles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/dwdl", name = "roles")
    public JAXBElement<Roles> createRoles(Roles value) {
        return new JAXBElement<Roles>(_Roles_QNAME, Roles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProperty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/dwdl", name = "getProperty")
    public JAXBElement<GetProperty> createGetProperty(GetProperty value) {
        return new JAXBElement<GetProperty>(_GetProperty_QNAME, GetProperty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Nodes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/dwdl", name = "nodes")
    public JAXBElement<Nodes> createNodes(Nodes value) {
        return new JAXBElement<Nodes>(_Nodes_QNAME, Nodes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Target }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/dwdl", name = "target")
    public JAXBElement<Target> createTarget(Target value) {
        return new JAXBElement<Target>(_Target_QNAME, Target.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Variable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://decidr.de/schema/dwdl", name = "variable")
    public JAXBElement<Variable> createVariable(Variable value) {
        return new JAXBElement<Variable>(_Variable_QNAME, Variable.class, null, value);
    }

}
