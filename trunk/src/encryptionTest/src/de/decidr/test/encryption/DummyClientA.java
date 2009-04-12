package de.decidr.test.encryption;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name = "DummyServiceA", targetNamespace = "http://decidr.de/test/encryption", wsdlLocation = "http://127.0.0.1:8080/encryptionTest/services/DummyServiceAService?wsdl")
public class DummyClientA extends Service {

	public DummyClientA(URL wsdlDocumentLocation, QName serviceName) {
		super(wsdlDocumentLocation, serviceName);
	}

	public DummyClientA() throws MalformedURLException {
		super(
				new URL(
						"http://127.0.0.1:8080/encryptionTest/services/DummyServiceAService?wsdl"),
				QName
						.valueOf("{http://decidr.de/test/encryption}DummyServiceA"));
		// new QName("http://decidr.de/test/encryption", "DummyServiceA"));
	}

	@WebEndpoint(name = "DummyServiceAInterfacePort")
	public DummyServiceAInterface getDummyServiceAInterfacePort() {
		return super.getPort(new QName("http://decidr.de/test/encryption",
				"DummyServiceAInterfacePort"), DummyServiceAInterface.class);
	}

	@WebEndpoint(name = "DummyServiceAInterfacePort")
	public DummyServiceAInterface getDummyServiceAInterfacePort(
			WebServiceFeature... features) {
		return super.getPort(new QName("http://decidr.de/test/encryption",
				"DummyServiceAInterfacePort"), DummyServiceAInterface.class,
				features);
	}
}
