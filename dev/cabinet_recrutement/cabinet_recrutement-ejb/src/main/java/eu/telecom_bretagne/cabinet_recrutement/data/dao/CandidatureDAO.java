package eu.telecom_bretagne.cabinet_recrutement.data.dao;
// Generated Jan 30, 2023, 1:37:36 PM by Hibernate Tools 5.4.20.Final


import eu.telecom_bretagne.cabinet_recrutement.data.model.Candidature;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jakarta.ejb.Stateless;
import jakarta.persistence.*;

/**
 * Home object for domain model class Candidature.
 * @see eu.telecom_bretagne.cabinet_recrutement.data.model.Candidature
 * @author Hibernate Tools
 */
@Stateless
public class CandidatureDAO {

    private static final Logger logger = Logger.getLogger(CandidatureDAO.class.getName());

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Candidature transientInstance) {
        logger.log(Level.INFO, "persisting Candidature instance");
        try {
            entityManager.persist(transientInstance);
            logger.log(Level.INFO, "persist successful");
        }
        catch (RuntimeException re) {
            logger.log(Level.SEVERE, "persist failed", re);
            throw re;
        }
    }
    
    public void remove(Candidature persistentInstance) {
        logger.log(Level.INFO, "removing Candidature instance");
        try {
            entityManager.remove(persistentInstance);
            logger.log(Level.INFO, "remove successful");
        }
        catch (RuntimeException re) {
            logger.log(Level.SEVERE, "remove failed", re);
            throw re;
        }
    }
    
    public Candidature merge(Candidature detachedInstance) {
        logger.log(Level.INFO, "merging Candidature instance");
        try {
            Candidature result = entityManager.merge(detachedInstance);
            logger.log(Level.INFO, "merge successful");
            return result;
        }
        catch (RuntimeException re) {
            logger.log(Level.SEVERE, "merge failed", re);
            throw re;
        }
    }
    
    public Candidature findById( int id) {
        logger.log(Level.INFO, "getting Candidature instance with id: " + id);
        try {
            Candidature instance = entityManager.find(Candidature.class, id);
            logger.log(Level.INFO, "get successful");
            return instance;
        }
        catch (RuntimeException re) {
            logger.log(Level.SEVERE, "get failed", re);
            throw re;
        }
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public List<Candidature> findAll()
    {
        Query query = entityManager.createQuery("select candidature from Candidature candidature order by candidature.id");
        List l = query.getResultList();

        return (List<Candidature>)l;
    }
}

