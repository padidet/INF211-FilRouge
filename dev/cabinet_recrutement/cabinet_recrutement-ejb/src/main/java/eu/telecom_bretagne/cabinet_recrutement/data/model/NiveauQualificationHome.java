package eu.telecom_bretagne.cabinet_recrutement.data.model;
// Generated Jan 30, 2023, 1:37:36 PM by Hibernate Tools 5.4.20.Final


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class NiveauQualification.
 * @see eu.telecom_bretagne.cabinet_recrutement.data.model.NiveauQualification
 * @author Hibernate Tools
 */
@Stateless
public class NiveauQualificationHome {

    private static final Logger logger = Logger.getLogger(NiveauQualificationHome.class.getName());

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(NiveauQualification transientInstance) {
        logger.log(Level.INFO, "persisting NiveauQualification instance");
        try {
            entityManager.persist(transientInstance);
            logger.log(Level.INFO, "persist successful");
        }
        catch (RuntimeException re) {
            logger.log(Level.SEVERE, "persist failed", re);
            throw re;
        }
    }
    
    public void remove(NiveauQualification persistentInstance) {
        logger.log(Level.INFO, "removing NiveauQualification instance");
        try {
            entityManager.remove(persistentInstance);
            logger.log(Level.INFO, "remove successful");
        }
        catch (RuntimeException re) {
            logger.log(Level.SEVERE, "remove failed", re);
            throw re;
        }
    }
    
    public NiveauQualification merge(NiveauQualification detachedInstance) {
        logger.log(Level.INFO, "merging NiveauQualification instance");
        try {
            NiveauQualification result = entityManager.merge(detachedInstance);
            logger.log(Level.INFO, "merge successful");
            return result;
        }
        catch (RuntimeException re) {
            logger.log(Level.SEVERE, "merge failed", re);
            throw re;
        }
    }
    
    public NiveauQualification findById( int id) {
        logger.log(Level.INFO, "getting NiveauQualification instance with id: " + id);
        try {
            NiveauQualification instance = entityManager.find(NiveauQualification.class, id);
            logger.log(Level.INFO, "get successful");
            return instance;
        }
        catch (RuntimeException re) {
            logger.log(Level.SEVERE, "get failed", re);
            throw re;
        }
    }
}

