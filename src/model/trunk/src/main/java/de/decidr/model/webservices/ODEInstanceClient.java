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

package de.decidr.model.webservices;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

import org.apache.ode.bpel.pmapi.InstanceManagement;

/**
 * This is a WS-Client for the <code>{@link InstanceManagement}</code> web
 * service provided by the ODE engine. Provides a simple and intuitive way of
 * accessing the above-mentioned web services from inside java using JAX-WS.
 * 
 * @author Reinhold
 * @deprecated ODE doesn't support JAX-WS
 */
@WebServiceClient(name = "InstanceManagement", targetNamespace = ODEInstanceClient.TARGET_NAMESPACE, wsdlLocation = ODEInstanceClient.WSDL_LOCATION)
@Deprecated
public class ODEInstanceClient extends Service {

    private static final String ENDPOINT_NAME = "InstanceManagementSOAP11port_http";
    public static final String TARGET_NAMESPACE = "http://www.apache.org/ode/pmapi";
    public static final QName SERVICE = new QName(TARGET_NAMESPACE,
            "InstanceManagement");
    public static final String LOCAL_ODE_LOCATION = "http://127.0.0.1:8080/ode/services/listServices";
    public static final String WSDL_LOCATION = "http://127.0.0.1:8080/ode/processes/InstanceManagement?wsdl";
    public final static QName INSTANCE_ENDPOINT = new QName(TARGET_NAMESPACE,
            ENDPOINT_NAME);

    public ODEInstanceClient() throws MalformedURLException {
        this(new URL(WSDL_LOCATION));
    }

    public ODEInstanceClient(URL wsdlDocumentLocation) {
        this(wsdlDocumentLocation, SERVICE);
    }

    public ODEInstanceClient(URL wsdlDocumentLocation, QName serviceName) {
        super(wsdlDocumentLocation, serviceName);
    }

    @WebEndpoint(name = ENDPOINT_NAME)
    public InstanceManagement getInstancePort() {
        return super.getPort(INSTANCE_ENDPOINT, InstanceManagement.class);
    }

    @WebEndpoint(name = ENDPOINT_NAME)
    public InstanceManagement getInstancePort(WebServiceFeature... features) {
        return super.getPort(INSTANCE_ENDPOINT, InstanceManagement.class,
                features);
    }
}
