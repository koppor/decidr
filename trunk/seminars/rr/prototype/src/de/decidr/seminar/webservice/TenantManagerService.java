/**
 * 
 */
package de.decidr.seminar.webservice;

import java.util.Map;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.bind.annotation.XmlTransient;

import de.decidr.seminar.tenantmgr.TenantManager;
import de.decidr.seminar.tenantmgr.TenantManagerFactory;

/**
 * @author RR
 * 
 */
// @XmlType(name = "TenantService", namespace = "http://decidr.de/seminarWS")
@WebService(name = "TenantServicePT", serviceName = "TenantService", targetNamespace = "http://decidr.de/seminarWS")
@SOAPBinding(style = Style.RPC)
public class TenantManagerService {

	@XmlTransient
	public static TenantManager manager;

	@WebMethod(exclude = true)
	public synchronized TenantManager getManager() {
		if (manager == null)
			manager = TenantManagerFactory.getTenantManager();
		return manager;
	}

	@WebMethod(operationName = "addTenant")
	@Oneway
	public void addTenant(@WebParam(name = "name") String name)
			throws Exception {
		System.out.println("\n\ncalled........\n\n");
		try {
			getManager().addTenant(name);
		} catch (Exception e) {
			System.out.println("\n\nfailed........\n\n");
			e.printStackTrace();
			throw e;
		}
	}

	@WebMethod(operationName = "login")
	@WebResult(name = "sessionID")
	public String login(@WebParam(name = "name") String name) throws Exception {
		return getManager().login(name);
	}

	@WebMethod(operationName = "logout")
	@Oneway
	public void logout(@WebParam(name = "sessionID") String sid)
			throws Exception {
		getManager().logout(sid);
	}

	@WebMethod(operationName = "addField")
	@Oneway
	public void addCustomField(@WebParam(name = "sessionID") String sid,
			@WebParam(name = "fieldName") String fieldName,
			@WebParam(name = "value") String value) throws Exception {
		getManager().addCustomField(sid, fieldName, value);
	}

	@WebMethod(operationName = "setField")
	@Oneway
	public void setValue(@WebParam(name = "sessionID") String sid,
			@WebParam(name = "fieldName") String fieldName,
			@WebParam(name = "value") String value) throws Exception {
		getManager().setValue(sid, fieldName, value);
	}

	@WebMethod(operationName = "setFields")
	@Oneway
	public void setValues(@WebParam(name = "sessionID") String sid,
			@WebParam(name = "fieldMap") Map<String, String> fields)
			throws Exception {
		for (String field : fields.keySet()) {
			getManager().setValue(sid, field, fields.get(field));
		}
	}

	@WebMethod(operationName = "getField")
	@WebResult(name = "fieldValue")
	public String getValue(@WebParam(name = "sessionID") String sid,
			@WebParam(name = "fieldName") String fieldName) throws Exception {
		return getManager().getValue(sid, fieldName);
	}

	@WebMethod(operationName = "getTenantFields")
	@WebResult(name = "fieldMap")
	public Map<String, String> getValues(
			@WebParam(name = "sessionID") String sid) throws Exception {
		return getManager().getValues(sid);
	}
}
