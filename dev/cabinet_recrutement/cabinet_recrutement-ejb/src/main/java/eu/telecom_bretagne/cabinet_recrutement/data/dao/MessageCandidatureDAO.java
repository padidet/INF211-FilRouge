package eu.telecom_bretagne.cabinet_recrutement.data.dao;
// Generated Jan 30, 2023, 1:37:36 PM by Hibernate Tools 5.4.20.Final


import eu.telecom_bretagne.cabinet_recrutement.data.model.MessageCandidature;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jakarta.ejb.Stateless;
import jakarta.persistence.*;

/**
 * Home object for domain model class MessageCandidature.
 * @see eu.telecom_bretagne.cabinet_recrutement.data.model.MessageCandidature
 * @author Hibernate Tools
 */
@Stateless
public class MessageCandidatureDAO {

    private static final Logger logger = Logger.getLogger(MessageCandidatureDAO.class.getName());

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

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public List<MessageCandidature> findAll() {
        Query query = entityManager.createQuery("select messagecandidature from MessageCandidature messagecandidature order by messagecandidature.id");
        List l = query.getResultList();

        return (List<MessageCandidature>) l;
    }
}

