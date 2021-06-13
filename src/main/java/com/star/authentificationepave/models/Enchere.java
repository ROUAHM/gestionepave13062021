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

import com.star.authentificationepave.models.Epave;
import com.star.authentificationepave.models.Expert;
import com.star.authentificationepave.models.Offre;

@Entity
public class Enchere implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	private Date duree ;
	private String etat ;
	private float prix ;
	private String description ;
	
	@ManyToOne
	@JoinColumn(name = "epave") 
	private Epave epave; 
	@OneToMany(mappedBy = "enchere")
	 private List<Offre> offre ;
	@OneToOne Expert expert ;

	public Enchere() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDuree() {
		return duree;
	}
	public void setDuree(Date duree) {
		this.duree = duree;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Epave getEpave() {
		return epave;
	}
	public void setEpave(Epave epave) {
		this.epave = epave;
	}
	public List<Offre> getOffre() {
		return offre;
	}
	public void setOffre(List<Offre> offre) {
		this.offre = offre;
	}
	
	public Expert getExpert() {
		return expert;
	}
	public void setExpert(Expert expert) {
		this.expert = expert;
	}
	@Override
	public String toString() {
		return "Enchere [id=" + id + ", duree=" + duree + ", etat=" + etat + ", prix=" + prix + ", description="
				+ description + ", epave=" + epave + ", offre=" + offre + "]";
	}
	public Enchere(Long id, Date duree, String etat, float prix, String description, Epave epave, List<Offre> offre) {
		super();
		this.id = id;
		this.duree = duree;
		this.etat = etat;
		this.prix = prix;
		this.description = description;
		this.epave = epave;
		this.offre = offre;
	}
	
}
