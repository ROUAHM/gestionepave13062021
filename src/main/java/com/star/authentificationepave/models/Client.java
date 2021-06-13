package com.star.authentificationepave.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity

public class Client extends User implements Serializable  {
	@Id
	@GeneratedValue( strategy = GenerationType.TABLE )
	private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	/*@OneToMany(mappedBy = "client")
	 private List<Epave> epaves ;

	public List<Epave> getEpaves() {
		return epaves;
	}

	public void setEpaves(List<Epave> epaves) {
		this.epaves = epaves;
	}

	public Client(Long id, List<Epave> epaves) {
		super();
		this.id = id;
		this.epaves = epaves;
	}*/

	@Override
	public String toString() {
		return "Client [id=" + id + ", getId()=" + getId() + ", getUsername()=" + getUsername() + ", getEmail()="
				+ getMail() + ", getPassword()=" + getPassword() + ", getRoles()=" + getRoles() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Client(String username, String email, String password) {
		super(username, email, password);
		// TODO Auto-generated constructor stub
	}

	public Client(Long id) {
		super();
		this.id = id;
	}

	
	
}
