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

package de.decidr.model.commands.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.AliasToBeanResultTransformer;

import de.decidr.model.acl.access.UserAccess;
import de.decidr.model.acl.permissions.Permission;
import de.decidr.model.acl.roles.Role;
import de.decidr.model.commands.AclEnabledCommand;
import de.decidr.model.entities.User;
import de.decidr.model.exceptions.TransactionException;
import de.decidr.model.transactions.TransactionEvent;

/**
 * Retrieves the desired properties of one or more users.
 * 
 * @author Daniel Huss
 * @version 0.1
 */
public class GetUserPropertiesCommand extends AclEnabledCommand implements
        UserAccess {
    private Collection<String> propertiesToGet;

    private Collection<Long> userIds;

    private List<User> users = new ArrayList<User>(0);

    /**
     * Creates a new GetUserPropertiesCommand
     * 
     * @param actor
     *            the user or system invoking this command
     * @param userIds
     *            the IDs of the users whose properties are requested
     * @param propertiesToGet
     *            collection of names of the properties which should be
     *            requested
     */
    public GetUserPropertiesCommand(Role actor, Collection<Long> userIds,
            Collection<String> propertiesToGet) {
        super(actor, (Permission) null);
        this.propertiesToGet = propertiesToGet;
        this.userIds = userIds;
    }

    /**
     * Creates a new GetUserPropertiesCommand
     * 
     * @param actor
     *            the user or system invoking this command
     * @param userIds
     *            the IDs of the users whose properties are requested
     * @param propertiesToGet
     *            strings of names of the properties which should be requested
     */
    public GetUserPropertiesCommand(Role role, Collection<Long> userIds,
            String... propertiesToGet) {
        this(role, userIds, Arrays.asList(propertiesToGet));
    }

    /**
     * Creates a new GetUserPropertiesCommand
     * 
     * @param actor
     *            the IDs of the user whose properties are requested
     * @param userId
     *            the ID of the user whose properties are requested
     * @param propertiesToGet
     *            strings of names of the properties which should be requested
     */
    public GetUserPropertiesCommand(Role role, Long userId,
            String... propertiesToGet) {
        this(role, new ArrayList<Long>(), propertiesToGet);
        this.userIds.add(userId);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void transactionAllowed(TransactionEvent evt)
            throws TransactionException {

        users = new ArrayList<User>(0);
        if (userIds == null || userIds.isEmpty()) {
            return;
        }

        Criteria crit = evt.getSession().createCriteria(User.class);
        ProjectionList projectionList = Projections.projectionList();

        for (String propertyToGet : propertiesToGet) {
            projectionList.add(Projections.property(propertyToGet));
        }

        crit.setProjection(projectionList);
        crit.add(Restrictions.in("id", userIds));
        /*
         * The AliasToBeanResultTransformer will turn the array of object
         * returned by list() into instances of the User class. Only the the
         * properties in projectionList will be loaded, all other properties
         * will be null.
         */
        crit.setResultTransformer(new AliasToBeanResultTransformer(User.class));

        users = crit.list();
    }

    /**
     * @return the users
     */
    public List<User> getUser() {
        return users;
    }

    /**
     * @return the first user
     */
    public User getFirstUser() {
        return users.isEmpty() ? null : users.get(0);
    }

    @Override
    public Long[] getUserIds() {
        return userIds.toArray(new Long[userIds.size()]);
    }
}
