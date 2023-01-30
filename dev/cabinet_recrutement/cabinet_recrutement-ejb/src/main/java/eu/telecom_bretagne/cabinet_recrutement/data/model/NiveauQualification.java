package eu.telecom_bretagne.cabinet_recrutement.data.model;
// Generated Jan 30, 2023, 1:34:02 PM by Hibernate Tools 5.4.20.Final


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * NiveauQualification generated by hbm2java
 */
@Entity
@Table(name="niveau_qualification"
    ,schema="public"
)
public class NiveauQualification  implements java.io.Serializable {


     private int idQualification;
     private String intitule;
     private Set<Candidature> candidatures = new HashSet<Candidature>(0);
     private Set<OffreEmploi> offreEmplois = new HashSet<OffreEmploi>(0);

    public NiveauQualification() {
    }

	
    public NiveauQualification(int idQualification, String intitule) {
        this.idQualification = idQualification;
        this.intitule = intitule;
    }
    public NiveauQualification(int idQualification, String intitule, Set<Candidature> candidatures, Set<OffreEmploi> offreEmplois) {
       this.idQualification = idQualification;
       this.intitule = intitule;
       this.candidatures = candidatures;
       this.offreEmplois = offreEmplois;
    }
   
     @Id 

    
    @Column(name="id_qualification", unique=true, nullable=false)
    public int getIdQualification() {
        return this.idQualification;
    }
    
    public void setIdQualification(int idQualification) {
        this.idQualification = idQualification;
    }

    
    @Column(name="intitule", nullable=false, length=50)
    public String getIntitule() {
        return this.intitule;
    }
    
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="niveauQualification")
    public Set<Candidature> getCandidatures() {
        return this.candidatures;
    }
    
    public void setCandidatures(Set<Candidature> candidatures) {
        this.candidatures = candidatures;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="niveauQualification")
    public Set<OffreEmploi> getOffreEmplois() {
        return this.offreEmplois;
    }
    
    public void setOffreEmplois(Set<OffreEmploi> offreEmplois) {
        this.offreEmplois = offreEmplois;
    }




}

