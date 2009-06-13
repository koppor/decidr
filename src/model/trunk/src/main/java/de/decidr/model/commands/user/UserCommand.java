package de.decidr.model.commands.user;

import org.hibernate.Session;

import de.decidr.model.commands.AclEnabledCommand;
import de.decidr.model.entities.User;
import de.decidr.model.exceptions.EntityNotFoundException;
import de.decidr.model.permissions.Permission;
import de.decidr.model.permissions.Role;

/**
 * Abstract base class for commands that deal with users.
 * 
 * @author Markus Fischer
 * @author Daniel Huss
 * @version 0.1
 */
public abstract class UserCommand extends AclEnabledCommand {

    private Long userId;

    /**
     * Creates a new UserCommand.
     * 
     * @param role
     * @param additionalPermissions
     */
    public UserCommand(Role role, Long userId) {
        super(role, (Permission) null);
        this.userId = userId;
    }

    /**
     * Fetches the user from the database
     * 
     * @param session
     *            the Hibernate session to use for lookup.
     * @return
     * @throws EntityNotFoundException
     *             if no user is found
     */
    protected User fetchUser(Session session) throws EntityNotFoundException {
        User user = (User) session.get(User.class, userId);

        if (user == null) {
            throw new EntityNotFoundException(User.class, userId);
        }

        return user;
    }
}