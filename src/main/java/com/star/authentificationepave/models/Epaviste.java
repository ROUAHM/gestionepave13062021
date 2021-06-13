package com.star.authentificationepave.models;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Epaviste extends User implements Serializable  {
	@Id
	@GeneratedValue( strategy = GenerationType.TABLE )
	private Long id;	

	

	public void setId(Long id) {
		this.id = id;
	}

/*	
	@OneToOne
	public  Compte compte;
	public Long getId() {
		return id;
	}
	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
	*/

	@Override
	public String toString() {
		return "Epaviste [id=" + id + "]";
	}

	
	
	
	/*public Admin(Long id, Compte compte) {
		super();
		this.id = id;
		this.compte = compte;
	}*/

	public Epaviste() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Epaviste(Long id, Long cin, String firstname, String lastname, Date date_naiss, String genre, String tel,
			String etatcivil, String societe, String localite, String mail) {
		super();
		// TODO Auto-generated constructor stub
	}

	public Epaviste(String username, String email, String password) {
		super(username, email, password);
		// TODO Auto-generated constructor stub
	}	
}
