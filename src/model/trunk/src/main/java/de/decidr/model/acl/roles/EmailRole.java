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
package de.decidr.model.acl.roles;

/**
 * The role representing the DecidR Email Web service.
 * 
 * @author Daniel Huss
 * @author Reinhold
 * @version 0.1
 */
public class EmailRole extends BasicRole {

    private static final Long EMAIL_ACTOR_ID = -01337L;

    private static EmailRole instance = new EmailRole();

    /**
     * Singleton constructor.
     */
    private EmailRole() {
        super(EMAIL_ACTOR_ID);
    }

    /**
     * @return the singleton instance.
     */
    public static EmailRole getInstance() {
        return instance;
    }
}
