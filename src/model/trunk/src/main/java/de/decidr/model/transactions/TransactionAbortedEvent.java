/*
 * The DecidR Development Team licenses this file to you under the Apache
 * License, Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package de.decidr.model.transactions;

import org.hibernate.Session;

/**
 * Event fired after a transaction has been rolled back.
 * 
 * @author Daniel Huss
 * 
 * @version 0.1
 */
public class TransactionAbortedEvent extends TransactionEvent {
    /**
     * The exception that caused the rollback.
     */
    protected Exception exception;

    /**
     * Constructor.
     * 
     * @param session
     * @param exception
     */
    public TransactionAbortedEvent(Session session, Exception exception, Boolean innerTransaction) {
        super(session, innerTransaction);
        this.exception = exception;
    }

    /**
     * @return the exception that caused the rollback.
     */
    public Exception getException() {
        return this.exception;
    }
}