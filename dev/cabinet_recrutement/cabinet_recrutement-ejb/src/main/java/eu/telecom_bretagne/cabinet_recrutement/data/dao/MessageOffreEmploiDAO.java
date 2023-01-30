package eu.telecom_bretagne.cabinet_recrutement.data.dao;
// Generated Jan 30, 2023, 1:37:36 PM by Hibernate Tools 5.4.20.Final


import eu.telecom_bretagne.cabinet_recrutement.data.model.MessageOffreEmploi;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jakarta.ejb.Stateless;
import jakarta.persistence.*;

/**
 * Home object for domain model class MessageOffreEmploi.
 * @see eu.telecom_bretagne.cabinet_recrutement.data.model.MessageOffreEmploi
 * @author Hibernate Tools
 */
@Stateless
public class MessageOffreEmploiDAO {

    private static final Logger logger = Logger.getLogger(MessageOffreEmploiDAO.class.getName());

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(MessageOffreEmploi transientInstance) {
        logger.log(Level.INFO, "persisting MessageOffreEmploi instance");
        try {
            entityManager.persist(transientInstance);
            logger.log(Level.INFO, "persist successful");
        }
        catch (RuntimeException re) {
            logger.log(Level.SEVERE, "persist failed", re);
            throw re;
        }
    }
    
    public void remove(MessageOffreEmploi persistentInstance) {
        logger.log(Level.INFO, "removing MessageOffreEmploi instance");
        try {
            entityManager.remove(persistentInstance);
            logger.log(Level.INFO, "remove successful");
        }
        catch (RuntimeException re) {
            logger.log(Level.SEVERE, "remove failed", re);
            throw re;
        }
    }
    
    public MessageOffreEmploi merge(MessageOffreEmploi detachedInstance) {
        logger.log(Level.INFO, "merging MessageOffreEmploi instance");
        try {
            MessageOffreEmploi result = entityManager.merge(detachedInstance);
            logger.log(Level.INFO, "merge successful");
            return result;
        }
        catch (RuntimeException re) {
            logger.log(Level.SEVERE, "merge failed", re);
            throw re;
        }
    }
    
    public MessageOffreEmploi findById( int id) {
        logger.log(Level.INFO, "getting MessageOffreEmploi instance with id: " + id);
        try {
            MessageOffreEmploi instance = entityManager.find(MessageOffreEmploi.class, id);
            logger.log(Level.INFO, "get successful");
            return instance;
        }
        catch (RuntimeException re) {
            logger.log(Level.SEVERE, "get failed", re);
            throw re;
        }
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public List<MessageOffreEmploi> findAll() {
        Query query = entityManager.createQuery(
                "select messageoffredemploi from MessageOffreEmploi messageoffredemploi order by messageoffredemploi.id");
        List l = query.getResultList();

        return (List<MessageOffreEmploi>) l;
    }
}

