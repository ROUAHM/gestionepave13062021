package com.star.authentificationepave.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.star.authentificationepave.models.Client;
import com.star.authentificationepave.models.Enchere;
import com.star.authentificationepave.models.Epaviste;
import com.star.authentificationepave.models.Expert;
import com.star.authentificationepave.models.Gestionnaire;
import com.star.authentificationepave.models.RapportPreliminaire;
import com.star.authentificationepave.models.Vehicule;

@Entity 

public class Epave implements Serializable {
	@Id
	@GeneratedValue
	private long id;
	private float prix ;
	private Date date_daccident ;
	@OneToOne
	public  Vehicule vehicule;
	@ManyToOne
	@JoinColumn(name = "id_expert") 
	private Expert expert;
	@ManyToOne
	@JoinColumn(name = "id_epaviste") 
	private Epaviste epaviste;
	@ManyToOne
	@JoinColumn(name = "id_client") 
	private Client client; 
	@ManyToOne
	@JoinColumn(name = "id_gestionnaire") 
	private Gestionnaire gestionnaire; 
	@OneToOne
	public  RapportPreliminaire rapportpreliminaires;
	@OneToMany(mappedBy = "epave")
	 private List<Enchere> encheres ;
	public Epave() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setId(long id) {
		this.id = id;
	}


	public long getId() {
		return id;
	}


	public void setId_epave(long id) {
		this.id = id;
	}

	public float getPrix() {
		return prix;
	}


	public void setPrix(float prix) {
		this.prix = prix;
	}


	
	public Date getDate_daccident() {
		return date_daccident;
	}


	public void setDate_daccident(Date date_daccident) {
		this.date_daccident = date_daccident;
	}
	public Vehicule getVehicule() {
		return vehicule;
	}


	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}


	public Expert getExpert() {
		return expert;
	}


	public void setExpert(Expert expert) {
		this.expert = expert;
	}


	public Epaviste getEpaviste() {
		return epaviste;
	}


	public void setEpaviste(Epaviste epaviste) {
		this.epaviste = epaviste;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public Gestionnaire getGestionnaire() {
		return gestionnaire;
	}


	public void setGestionnaire(Gestionnaire gestionnaire) {
		this.gestionnaire = gestionnaire;
	}


	public RapportPreliminaire getRapportpreliminaires() {
		return rapportpreliminaires;
	}


	public void setRapportpreliminaires(RapportPreliminaire rapportpreliminaires) {
		this.rapportpreliminaires = rapportpreliminaires;
	}


	public List<Enchere> getEncheres() {
		return encheres;
	}


	public void setEncheres(List<Enchere> encheres) {
		this.encheres = encheres;
	}


	


	

	@Override
	public String toString() {
		return "Epave [id=" + id + ", prix=" + prix + ", date_daccident=" + date_daccident + ", vehicule=" + vehicule
				+ ", expert=" + expert + ", epaviste=" + epaviste + ", client=" + client + ", gestionnaire="
				+ gestionnaire + ", rapportpreliminaires=" + rapportpreliminaires + ", encheres=" + encheres + "]";
	}


	public Epave(long id, float prix, Date date_daccident, Vehicule vehicule, Expert expert, Epaviste epaviste,
			Client client, Gestionnaire gestionnaire, RapportPreliminaire rapportpreliminaires,
			List<Enchere> encheres) {
		super();
		this.id = id;
		this.prix = prix;
		this.date_daccident = date_daccident;
		this.vehicule = vehicule;
		this.expert = expert;
		this.epaviste = epaviste;
		this.client = client;
		this.gestionnaire = gestionnaire;
		this.rapportpreliminaires = rapportpreliminaires;
		this.encheres = encheres;
	}

}
