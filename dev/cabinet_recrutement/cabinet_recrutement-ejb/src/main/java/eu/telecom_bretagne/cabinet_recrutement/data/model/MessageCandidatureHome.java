package eu.telecom_bretagne.cabinet_recrutement.data.model;
// Generated Jan 30, 2023, 1:37:36 PM by Hibernate Tools 5.4.20.Final


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class MessageCandidature.
 * @see eu.telecom_bretagne.cabinet_recrutement.data.model.MessageCandidature
 * @author Hibernate Tools
 */
@Stateless
public class MessageCandidatureHome {

    private static final Logger logger = Logger.getLogger(MessageCandidatureHome.class.getName());

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(MessageCandidature transientInstance) {
        logger.log(Level.INFO, "persisting MessageCandidature instance");
        try {
            entityManager.persist(transientInstance);
            logger.log(Level.INFO, "persist successful");
        }
        catch (RuntimeException re) {
            logger.log(Level.SEVERE, "persist failed", re);
            throw re;
        }
    }
    
    public void remove(MessageCandidature persistentInstance) {
        logger.log(Level.INFO, "removing MessageCandidature instance");
        try {
            entityManager.remove(persistentInstance);
            logger.log(Level.INFO, "remove successful");
        }
        catch (RuntimeException re) {
            logger.log(Level.SEVERE, "remove failed", re);
            throw re;
        }
    }
    
    public MessageCandidature merge(MessageCandidature detachedInstance) {
        logger.log(Level.INFO, "merging MessageCandidature instance");
        try {
            MessageCandidature result = entityManager.merge(detachedInstance);
            logger.log(Level.INFO, "merge successful");
            return result;
        }
        catch (RuntimeException re) {
            logger.log(Level.SEVERE, "merge failed", re);
            throw re;
        }
    }
    
    public MessageCandidature findById( int id) {
        logger.log(Level.INFO, "getting MessageCandidature instance with id: " + id);
        try {
            MessageCandidature instance = entityManager.find(MessageCandidature.class, id);
            logger.log(Level.INFO, "get successful");
            return instance;
        }
        catch (RuntimeException re) {
            logger.log(Level.SEVERE, "get failed", re);
            throw re;
        }
    }
}

