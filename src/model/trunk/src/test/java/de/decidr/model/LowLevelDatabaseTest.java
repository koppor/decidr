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

package de.decidr.model;

import static org.junit.Assert.fail;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import de.decidr.model.testsuites.DatabaseTestSuite;

/**
 * Creates a session for low-level database access.
 * 
 * @author Reinhold
 */
public abstract class LowLevelDatabaseTest {
    protected static Session session = null;

    @BeforeClass
    public static final void setUp() {
        if (!DatabaseTestSuite.running()) {
            fail("Needs to run inside " + DatabaseTestSuite.class.getName());
        }

        session = new Configuration().configure("hibernate.cfg.xml")
                .buildSessionFactory().openSession();
    }

    @AfterClass
    public static final void tearDown() {
        if (session != null) {
            session.close();
        }
    }
}
