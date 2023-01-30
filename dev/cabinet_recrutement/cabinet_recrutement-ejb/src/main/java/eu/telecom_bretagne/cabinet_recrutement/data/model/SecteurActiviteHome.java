package eu.telecom_bretagne.cabinet_recrutement.data.model;
// Generated Jan 30, 2023, 1:37:36 PM by Hibernate Tools 5.4.20.Final


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class SecteurActivite.
 * @see eu.telecom_bretagne.cabinet_recrutement.data.model.SecteurActivite
 * @author Hibernate Tools
 */
@Stateless
public class SecteurActiviteHome {

    private static final Logger logger = Logger.getLogger(SecteurActiviteHome.class.getName());

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(SecteurActivite transientInstance) {
        logger.log(Level.INFO, "persisting SecteurActivite instance");
        try {
            entityManager.persist(transientInstance);
            logger.log(Level.INFO, "persist successful");
        }
        catch (RuntimeException re) {
            logger.log(Level.SEVERE, "persist failed", re);
            throw re;
        }
    }
    
    public void remove(SecteurActivite persistentInstance) {
        logger.log(Level.INFO, "removing SecteurActivite instance");
        try {
            entityManager.remove(persistentInstance);
            logger.log(Level.INFO, "remove successful");
        }
        catch (RuntimeException re) {
            logger.log(Level.SEVERE, "remove failed", re);
            throw re;
        }
    }
    
    public SecteurActivite merge(SecteurActivite detachedInstance) {
        logger.log(Level.INFO, "merging SecteurActivite instance");
        try {
            SecteurActivite result = entityManager.merge(detachedInstance);
            logger.log(Level.INFO, "merge successful");
            return result;
        }
        catch (RuntimeException re) {
            logger.log(Level.SEVERE, "merge failed", re);
            throw re;
        }
    }
    
    public SecteurActivite findById( int id) {
        logger.log(Level.INFO, "getting SecteurActivite instance with id: " + id);
        try {
            SecteurActivite instance = entityManager.find(SecteurActivite.class, id);
            logger.log(Level.INFO, "get successful");
            return instance;
        }
        catch (RuntimeException re) {
            logger.log(Level.SEVERE, "get failed", re);
            throw re;
        }
    }
}

