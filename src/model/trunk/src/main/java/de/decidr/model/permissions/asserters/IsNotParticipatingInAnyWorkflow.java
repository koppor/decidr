package de.decidr.model.permissions.asserters;

import org.hibernate.Session;
import de.decidr.model.commands.TransactionalCommand;
import de.decidr.model.entities.User;
import de.decidr.model.permissions.Asserter;
import de.decidr.model.permissions.Permission;
import de.decidr.model.permissions.Role;
import de.decidr.model.permissions.UserRole;
import de.decidr.model.transactions.HibernateTransactionCoordinator;
import de.decidr.model.transactions.TransactionAbortedEvent;
import de.decidr.model.transactions.TransactionCoordinator;
import de.decidr.model.transactions.TransactionEvent;

public class IsNotParticipatingInAnyWorkflow implements Asserter, TransactionalCommand  {

    private Long userid = null;
    Boolean result = false;

    @Override
    public Boolean assertRule(Role role, Permission permission) {

        if((role instanceof UserRole)&&(permission instanceof de.decidr.model.permissions.WorkflowModelPermission)){
        
            userid = role.getActorId();
    
            TransactionCoordinator htac = HibernateTransactionCoordinator
                    .getInstance();
    
            htac.runTransaction(this);
        }
        else{
            result = false;
        }
        
        return result;
    }

    @Override
    public void transactionAborted(TransactionAbortedEvent evt) {
        // TODO Auto-generated method stub

    }

    @Override
    public void transactionCommitted(TransactionEvent evt) {
        // TODO Auto-generated method stub

    }

    @SuppressWarnings("unchecked")
    @Override
    public void transactionStarted(TransactionEvent evt) {
        Session session = evt.getSession();

        User user = (User)session.load(User.class, userid);
        
        // FIXME make HQL Statement for performance tuning
        result=(false == user.getUserParticipatesInWorkflow().isEmpty());
    }
    
}
