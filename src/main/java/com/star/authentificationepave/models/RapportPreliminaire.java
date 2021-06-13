package com.star.authentificationepave.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.star.authentificationepave.models.Expert;
import com.star.authentificationepave.models.RapportPreliminaire;
import com.star.authentificationepave.models.Vehicule;

@Entity
public class RapportPreliminaire implements Serializable {
	@Id
	@GeneratedValue
	private long id ;
	private String degat_constate ;
	private String lieu_vehicule ;
	private float valeur ;
	private float valeur_epaves ;
	private String image ;
	@OneToOne Vehicule vehicule ;
	@ManyToOne
	@JoinColumn(name = "id_expert") 
	private Expert expert; 

	
	public RapportPreliminaire() {
		super();
		// TODO Auto-generated constructor stub
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
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDegat_constate() {
		return degat_constate;
	}
	public void setDegat_constate(String degat_constate) {
		this.degat_constate = degat_constate;
	}
	public String getLieu_vehicule() {
		return lieu_vehicule;
	}
	public void setLieu_vehicule(String lieu_vehicule) {
		this.lieu_vehicule = lieu_vehicule;
	}
	public float getValeur() {
		return valeur;
	}
	public void setValeur(float valeur) {
		this.valeur = valeur;
	}
	public float getValeur_epaves() {
		return valeur_epaves;
	}
	public void setValeur_epaves(float valeur_epaves) {
		this.valeur_epaves = valeur_epaves;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	

	public RapportPreliminaire(long id, String degat_constate, String lieu_vehicule, float valeur, float valeur_epaves,
			String image, Vehicule vehicule, Expert expert) {
		super();
		this.id = id;
		this.degat_constate = degat_constate;
		this.lieu_vehicule = lieu_vehicule;
		this.valeur = valeur;
		this.valeur_epaves = valeur_epaves;
		this.image = image;
		this.vehicule = vehicule;
		this.expert = expert;
	}





	@Override
	public String toString() {
		return "RapportPreliminaire [id=" + id + ", degat_constate=" + degat_constate + ", lieu_vehicule="
				+ lieu_vehicule + ", valeur=" + valeur + ", valeur_epaves=" + valeur_epaves + ", image=" + image
				+ ", vehicule=" + vehicule + ", expert=" + expert + "]";
	}




	public static List<RapportPreliminaire> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
