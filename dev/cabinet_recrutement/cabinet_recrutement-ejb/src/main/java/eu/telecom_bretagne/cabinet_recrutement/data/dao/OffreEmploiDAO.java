package eu.telecom_bretagne.cabinet_recrutement.data.dao;
// Generated Jan 30, 2023, 1:37:36 PM by Hibernate Tools 5.4.20.Final


import eu.telecom_bretagne.cabinet_recrutement.data.model.OffreEmploi;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jakarta.ejb.Stateless;
import jakarta.persistence.*;

/**
 * Home object for domain model class OffreEmploi.
 * @see eu.telecom_bretagne.cabinet_recrutement.data.model.OffreEmploi
 * @author Hibernate Tools
 */
@Stateless
public class OffreEmploiDAO {

    private static final Logger logger = Logger.getLogger(OffreEmploiDAO.class.getName());

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(OffreEmploi transientInstance) {
        logger.log(Level.INFO, "persisting OffreEmploi instance");
        try {
            entityManager.persist(transientInstance);
            logger.log(Level.INFO, "persist successful");
        }
        catch (RuntimeException re) {
            logger.log(Level.SEVERE, "persist failed", re);
            throw re;
        }
    }
    
    public void remove(OffreEmploi persistentInstance) {
        logger.log(Level.INFO, "removing OffreEmploi instance");
        try {
            entityManager.remove(persistentInstance);
            logger.log(Level.INFO, "remove successful");
        }
        catch (RuntimeException re) {
            logger.log(Level.SEVERE, "remove failed", re);
            throw re;
        }
    }
    
    public OffreEmploi merge(OffreEmploi detachedInstance) {
        logger.log(Level.INFO, "merging OffreEmploi instance");
        try {
            OffreEmploi result = entityManager.merge(detachedInstance);
            logger.log(Level.INFO, "merge successful");
            return result;
        }
        catch (RuntimeException re) {
            logger.log(Level.SEVERE, "merge failed", re);
            throw re;
        }
    }
    
    public OffreEmploi findById( int id) {
        logger.log(Level.INFO, "getting OffreEmploi instance with id: " + id);
        try {
            OffreEmploi instance = entityManager.find(OffreEmploi.class, id);
            logger.log(Level.INFO, "get successful");
            return instance;
        }
        catch (RuntimeException re) {
            logger.log(Level.SEVERE, "get failed", re);
            throw re;
        }
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public List<OffreEmploi> findAll() {
        Query query = entityManager.createQuery("select offreemploi from OffreEmploi offreemploi order by offreemploi.id desc");
        List l = query.getResultList();

        return (List<OffreEmploi>) l;
    }
}

