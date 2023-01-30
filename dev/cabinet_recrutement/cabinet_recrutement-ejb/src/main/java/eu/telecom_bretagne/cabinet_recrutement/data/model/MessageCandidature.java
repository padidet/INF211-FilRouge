package eu.telecom_bretagne.cabinet_recrutement.data.model;
// Generated Jan 30, 2023, 1:34:02 PM by Hibernate Tools 5.4.20.Final


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * MessageCandidature generated by hbm2java
 */
@Entity
@Table(name="message_candidature"
    ,schema="public"
)
public class MessageCandidature  implements java.io.Serializable {


     private int idMessageCandidature;
     private Candidature candidature;
     private OffreEmploi offreEmploi;
     private Date dateEnvoi;
     private String corpsMessage;

    public MessageCandidature() {
    }

	
    public MessageCandidature(int idMessageCandidature, Candidature candidature, OffreEmploi offreEmploi, Date dateEnvoi) {
        this.idMessageCandidature = idMessageCandidature;
        this.candidature = candidature;
        this.offreEmploi = offreEmploi;
        this.dateEnvoi = dateEnvoi;
    }
    public MessageCandidature(int idMessageCandidature, Candidature candidature, OffreEmploi offreEmploi, Date dateEnvoi, String corpsMessage) {
       this.idMessageCandidature = idMessageCandidature;
       this.candidature = candidature;
       this.offreEmploi = offreEmploi;
       this.dateEnvoi = dateEnvoi;
       this.corpsMessage = corpsMessage;
    }
   
     @Id 

    
    @Column(name="id_message_candidature", unique=true, nullable=false)
    public int getIdMessageCandidature() {
        return this.idMessageCandidature;
    }
    
    public void setIdMessageCandidature(int idMessageCandidature) {
        this.idMessageCandidature = idMessageCandidature;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_candidature", nullable=false)
    public Candidature getCandidature() {
        return this.candidature;
    }
    
    public void setCandidature(Candidature candidature) {
        this.candidature = candidature;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_offre_emploi", nullable=false)
    public OffreEmploi getOffreEmploi() {
        return this.offreEmploi;
    }
    
    public void setOffreEmploi(OffreEmploi offreEmploi) {
        this.offreEmploi = offreEmploi;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="date_envoi", nullable=false, length=13)
    public Date getDateEnvoi() {
        return this.dateEnvoi;
    }
    
    public void setDateEnvoi(Date dateEnvoi) {
        this.dateEnvoi = dateEnvoi;
    }

    
    @Column(name="corps_message")
    public String getCorpsMessage() {
        return this.corpsMessage;
    }
    
    public void setCorpsMessage(String corpsMessage) {
        this.corpsMessage = corpsMessage;
    }




}

