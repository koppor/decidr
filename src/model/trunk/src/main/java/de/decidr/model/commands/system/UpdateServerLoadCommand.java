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
package de.decidr.model.commands.system;

import de.decidr.model.acl.roles.Role;
import de.decidr.model.transactions.TransactionEvent;

/**
 * Updates the server load of a given server in the database. If the server does
 * not exist no exeption is thrown.
 * 
 * @author Markus Fischer
 * @author Daniel Huss
 * 
 * @version 0.1
 */
public class UpdateServerLoadCommand extends SystemCommand {

    private Long serverId = null;
    private byte load;

    /**
     * Updates the server load of a given server in the database. If given
     * server does not exist no exception is thrown.
     * 
     * @param role
     *            the user/system that is executing the command
     * @param serverid
     *            the ID of the server to update
     * @param load
     *            the new load
     */
    public UpdateServerLoadCommand(Role role, Long serverId, byte load) {
        super(role, null);
        this.serverId = serverId;
        this.load = load;
    }

    @Override
    public void transactionAllowed(TransactionEvent evt) {
        evt.getSession().createQuery(
                "update Server set load = :newLoad where id = :serverId")
                .setByte("newLoad", load).setLong("serverId", serverId)
                .executeUpdate();
    }
}
