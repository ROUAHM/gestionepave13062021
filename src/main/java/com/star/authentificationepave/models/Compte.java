package com.star.authentificationepave.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.star.authentificationepave.models.Admin;
import com.star.authentificationepave.models.Client;
import com.star.authentificationepave.models.Epaviste;
import com.star.authentificationepave.models.Expert;
import com.star.authentificationepave.models.Gestionnaire;
import com.star.authentificationepave.models.User;
@Entity 
public class Compte implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id ;
	private String password ;
	private String email ;
	@OneToOne
	public  Gestionnaire gestionnaire;
	@OneToOne
	public  Expert expert;
	@OneToOne
	public  Client client;
	@OneToOne
	public  Epaviste epaviste ;
	@OneToOne
	public  User users;
	@ManyToOne
	@JoinColumn(name = "id_useradmin") 
	private Admin admin; 

	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Gestionnaire getGestionnaire() {
		return gestionnaire;
	}


	public void setGestionnaire(Gestionnaire gestionnaire) {
		this.gestionnaire = gestionnaire;
	}


	public User getUsers() {
		return users;
	}


	public void setUsers(User users) {
		this.users = users;
	}


	public Admin getAdmin() {
		return admin;
	}


	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Expert getExpert() {
		return expert;
	}


	public void setExpert(Expert expert) {
		this.expert = expert;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public Epaviste getEpaviste() {
		return epaviste;
	}


	public void setEpaviste(Epaviste epaviste) {
		this.epaviste = epaviste;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	

	@Override
	public String toString() {
		return "Compte [id=" + id + ", password=" + password + ", email=" + email + ", gestionnaire=" + gestionnaire
				+ ", expert=" + expert + ", client=" + client + ", epaviste=" + epaviste + ", users=" + users
				+ ", admin=" + admin + "]";
	}


	public Compte(Long id, String password, String email, Gestionnaire gestionnaire, Expert expert, Client client,
			Epaviste epaviste, User users, Admin admin) {
		super();
		this.id = id;
		this.password = password;
		this.email = email;
		this.gestionnaire = gestionnaire;
		this.expert = expert;
		this.client = client;
		this.epaviste = epaviste;
		this.users = users;
		this.admin = admin;
	}


}
