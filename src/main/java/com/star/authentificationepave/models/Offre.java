package com.star.authentificationepave.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.star.authentificationepave.models.Enchere;
import com.star.authentificationepave.models.Epave;
import com.star.authentificationepave.models.Epaviste;
@Entity 
public class Offre implements Serializable {
	@Id
	@GeneratedValue
	private long id ;
	private Date date ;
	private float valeur ;
	
	@ManyToOne
	@JoinColumn(name = "id_epave") 
	private Epave epave; 
	@ManyToOne
	@JoinColumn(name = "id_enchere") 
	private Enchere enchere; 
	@ManyToOne
	@JoinColumn(name = "id_epaviste") 
	private Epaviste epaviste; 
	
	
	
	public Epave getEpave() {
		return epave;
	}

	public void setEpave(Epave epave) {
		this.epave = epave;
	}

	public Epaviste getEpaviste() {
		return epaviste;
	}

	public void setEpaviste(Epaviste epaviste) {
		this.epaviste = epaviste;
	}

	public Enchere getEnchere() {
		return enchere;
	}

	public void setEnchere(Enchere enchere) {
		this.enchere = enchere;
	}

	public Offre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public float getValeur() {
		return valeur;
	}
	public void setValeur(float valeur) {
		this.valeur = valeur;
	}
	@Override
	public String toString() {
		return "Offre [id=" + id + ", date=" + date + ", valeur=" + valeur + ", epave=" + epave + ", enchere=" + enchere
				+ ", epaviste=" + epaviste + "]";
	}

	public Offre(long id, Date date, float valeur, Epave epave, Enchere enchere, Epaviste epaviste) {
		super();
		this.id = id;
		this.date = date;
		this.valeur = valeur;
		this.epave = epave;
		this.enchere = enchere;
		this.epaviste = epaviste;
	}
}
