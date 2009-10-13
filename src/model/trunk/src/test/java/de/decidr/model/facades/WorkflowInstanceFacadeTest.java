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

package de.decidr.model.facades;

import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;

import de.decidr.model.DecidrGlobals;
import de.decidr.model.acl.roles.BasicRole;
import de.decidr.model.acl.roles.Role;
import de.decidr.model.acl.roles.SuperAdminRole;
import de.decidr.model.entities.UserProfile;
import de.decidr.model.exceptions.TransactionException;
import de.decidr.model.testing.DecidrDatabaseTest;

/**
 * Test case for <code>{@link WorkflowInstanceFacade}</code>. Some of the
 * methods can't be tested easily within the confines of a unit test, as they
 * interact with web services. These methods will be tested at a later point in
 * time when the most important test cases are written or during the system
 * test.
 * 
 * @author Reinhold
 */
// JE create & start WF instance?
public class WorkflowInstanceFacadeTest extends DecidrDatabaseTest {

    static WorkflowInstanceFacade adminFacade;
    static WorkflowInstanceFacade userFacade;
    static WorkflowInstanceFacade nullFacade;

    @BeforeClass
    public static void disable() {
        fail("This test class has not yet been implemented");
    }

    /**
     * Initialises the facade instances.
     */
    @BeforeClass
    public static void setUpBeforeClass() {
        Role adminRole = new SuperAdminRole(
                DecidrGlobals.getSettings()
                .getSuperAdmin().getId());
        Role basicRole = new BasicRole(0L);

        WorkflowModelFacade adminModelFacade = new WorkflowModelFacade(
                adminRole);
        WorkflowModelFacade userModelFacade = new WorkflowModelFacade(basicRole);
        WorkflowModelFacade nullModelFacade = new WorkflowModelFacade(null);

        adminFacade = new WorkflowInstanceFacade(adminRole);
        userFacade = new WorkflowInstanceFacade(basicRole);
        nullFacade = new WorkflowInstanceFacade(null);
        
    }

    /**
     * Test method for
     * {@link WorkflowInstanceFacade#getParticipatingUsers(Long)} and
     * {@link WorkflowInstanceFacade#deleteWorkflowInstance(Long)}.
     */
    @Test
    public void testWorkflowInstance() throws TransactionException {
        fail("Not yet implemented"); // JE getParticipatingUsers
        fail("Not yet implemented"); // JE deleteWorkflowInstance
    }

    /**
     * Test method for {@link WorkflowInstanceFacade#getAllWorkItems(Long)} and
     * {@link WorkflowInstanceFacade#removeAllWorkItems(String, Long)}.
     */
    @Test
    public void testWorkItems() {
        fail("Not yet implemented"); // JE getAllWorkItems
        fail("Not yet implemented"); // JE removeAllWorkItems
    }
}
