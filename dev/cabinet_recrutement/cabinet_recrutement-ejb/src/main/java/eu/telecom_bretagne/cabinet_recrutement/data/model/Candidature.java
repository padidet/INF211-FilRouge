package eu.telecom_bretagne.cabinet_recrutement.data.model;
// Generated Jan 30, 2023, 1:34:02 PM by Hibernate Tools 5.4.20.Final


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.*;

/**
 * Candidature generated by hbm2java
 */
@Entity
@NamedQuery(name="Candidature.findAll", query="SELECT c FROM Candidature c")
@Table(name="candidature"
    ,schema="public"
)
public class Candidature  implements java.io.Serializable {


     private int idCandidature;
     private NiveauQualification niveauQualification;
     private String nom;
     private String prenom;
     private Date dateNaissance;
     private String adressePostale;
     private String adresseEmail;
     private String cv;
     private Date dateDepot;
     private Set<SecteurActivite> secteurActivites = new HashSet<SecteurActivite>(0);
     private Set<MessageCandidature> messageCandidatures = new HashSet<MessageCandidature>(0);
     private Set<MessageOffreEmploi> messageOffreEmplois = new HashSet<MessageOffreEmploi>(0);

    public Candidature() {
    }

	
    public Candidature(int idCandidature, NiveauQualification niveauQualification, String nom, String prenom, Date dateNaissance, Date dateDepot) {
        this.idCandidature = idCandidature;
        this.niveauQualification = niveauQualification;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.dateDepot = dateDepot;
    }
    public Candidature(int idCandidature, NiveauQualification niveauQualification, String nom, String prenom, Date dateNaissance, String adressePostale, String adresseEmail, String cv, Date dateDepot, Set<SecteurActivite> secteurActivites, Set<MessageCandidature> messageCandidatures, Set<MessageOffreEmploi> messageOffreEmplois) {
       this.idCandidature = idCandidature;
       this.niveauQualification = niveauQualification;
       this.nom = nom;
       this.prenom = prenom;
       this.dateNaissance = dateNaissance;
       this.adressePostale = adressePostale;
       this.adresseEmail = adresseEmail;
       this.cv = cv;
       this.dateDepot = dateDepot;
       this.secteurActivites = secteurActivites;
       this.messageCandidatures = messageCandidatures;
       this.messageOffreEmplois = messageOffreEmplois;
    }
   
     @Id
     @SequenceGenerator(name="CANDIDATURE_ID_GENERATOR", sequenceName="CANDIDATURE_ID_SEQ", allocationSize=1)
     @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CANDIDATURE_ID_GENERATOR") private Integer id;

    
    @Column(name="id_candidature", unique=true, nullable=false)
    public int getIdCandidature() {
        return this.idCandidature;
    }
    
    public void setIdCandidature(int idCandidature) {
        this.idCandidature = idCandidature;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_qualification", nullable=false)
    public NiveauQualification getNiveauQualification() {
        return this.niveauQualification;
    }
    
    public void setNiveauQualification(NiveauQualification niveauQualification) {
        this.niveauQualification = niveauQualification;
    }

    
    @Column(name="nom", nullable=false, length=50)
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    
    @Column(name="prenom", nullable=false, length=50)
    public String getPrenom() {
        return this.prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="date_naissance", nullable=false, length=13)
    public Date getDateNaissance() {
        return this.dateNaissance;
    }
    
    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    
    @Column(name="adresse_postale", length=30)
    public String getAdressePostale() {
        return this.adressePostale;
    }
    
    public void setAdressePostale(String adressePostale) {
        this.adressePostale = adressePostale;
    }

    
    @Column(name="adresse_email", length=50)
    public String getAdresseEmail() {
        return this.adresseEmail;
    }
    
    public void setAdresseEmail(String adresseEmail) {
        this.adresseEmail = adresseEmail;
    }

    
    @Column(name="cv")
    public String getCv() {
        return this.cv;
    }
    
    public void setCv(String cv) {
        this.cv = cv;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="date_depot", nullable=false, length=13)
    public Date getDateDepot() {
        return this.dateDepot;
    }
    
    public void setDateDepot(Date dateDepot) {
        this.dateDepot = dateDepot;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="index_candidature_secteur", schema="public", joinColumns = { 
        @JoinColumn(name="id_candidature", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="id_secteur", nullable=false, updatable=false) })
    public Set<SecteurActivite> getSecteurActivites() {
        return this.secteurActivites;
    }
    
    public void setSecteurActivites(Set<SecteurActivite> secteurActivites) {
        this.secteurActivites = secteurActivites;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="candidature")
    public Set<MessageCandidature> getMessageCandidatures() {
        return this.messageCandidatures;
    }
    
    public void setMessageCandidatures(Set<MessageCandidature> messageCandidatures) {
        this.messageCandidatures = messageCandidatures;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="candidature")
    public Set<MessageOffreEmploi> getMessageOffreEmplois() {
        return this.messageOffreEmplois;
    }
    
    public void setMessageOffreEmplois(Set<MessageOffreEmploi> messageOffreEmplois) {
        this.messageOffreEmplois = messageOffreEmplois;
    }




}


