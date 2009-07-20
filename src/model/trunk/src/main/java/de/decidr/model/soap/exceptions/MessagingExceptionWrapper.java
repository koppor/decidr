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
package de.decidr.model.soap.exceptions;

import javax.mail.MessagingException;
import javax.xml.ws.WebFault;

//This class was generated by Apache CXF 2.1.3
//Fri Jun 12 16:46:57 CEST 2009
//Generated source version: 2.1.3
/**
 * Wrapper around <code>{@link MessagingException}</code> to be used by web
 * services. May be treated like an ordinary
 * <code>{@link MessagingException}</code>.
 * 
 * @author Reinhold
 */
@WebFault(name = "messagingException", targetNamespace = "http://decidr.de/exceptions")
public class MessagingExceptionWrapper extends MessagingException {
    public static final long serialVersionUID = 20090612164657L;

    private java.lang.String messagingException;

    public MessagingExceptionWrapper() {
        super();
    }

    public MessagingExceptionWrapper(String message) {
        super(message);
    }

    public MessagingExceptionWrapper(String message,
            java.lang.String messagingException) {
        super(message);
        this.messagingException = messagingException;
    }

    public java.lang.String getFaultInfo() {
        return this.messagingException;
    }
}
