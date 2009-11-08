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

package de.decidr.model.workflowmodel.deployment;

import java.util.List;

import de.decidr.model.entities.ServerLoadView;

/**
 * This class describes the basic deployment strategy
 * 
 * @author Modood Alvi
 * @version 0.1
 */
public interface DeploymentStrategy {

    /**
     * This interface defines a simple deployment strategy. It provides a method
     * how a to select servers for deployment.
     * 
     * @param serverStatistics A {@link List} of {@link ServerLoadView}
     * @return {@link List} of {@link ServerLoadView} on which deployment can be done
     */
    public List<ServerLoadView> selectServer(
            List<ServerLoadView> serverStatistics);

}
