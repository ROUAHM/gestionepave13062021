package com.star.authentificationepave.models;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(	name = "users", 
		uniqueConstraints = { 
			@UniqueConstraint(columnNames = "username"),
			@UniqueConstraint(columnNames = "mail") 
		})
public class User implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Size(max = 20)
	private String username;
	
	@NotBlank
	@Size(max = 20)
	private Date Cin;
	
	@NotBlank
	@Size(max = 20)
	private String Firstname;
	
	@NotBlank
	@Size(max = 20)
	private String Lastname;
	
	@NotBlank
	@Size(max = 20)
	private Date Date_naiss;
	
	@NotBlank
	@Size(max = 20)
	private String Genre;
	
	@NotBlank
	@Size(max = 20)
	private Number Tel;
	
	@NotBlank
	@Size(max = 20)
	private String Etatcivil;
	
	@NotBlank
	@Size(max = 20)
	private String Societe;
	
	@NotBlank
	@Size(max = 20)
	private String Localite;
	
	@NotBlank
	@Size(max = 50)
	@Email
	private String mail;

	@NotBlank
	@Size(max = 120)
	private String password;
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(	name = "user_roles", 
				joinColumns = @JoinColumn(name = "user_id"), 
				inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>();

	public User() {
	}

	public User(String username, String mail, String password) {
		this.username = username;
		this.mail = mail;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	
	public Date getCin() {
		return Cin;
	}

	public void setCin(Date cin) {
		Cin = cin;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	
	
	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public Date getDate_naiss() {
		return Date_naiss;
	}

	public void setDate_naiss(Date date_naiss) {
		Date_naiss = date_naiss;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	public Number getTel() {
		return Tel;
	}

	public void setTel(Number tel) {
		Tel = tel;
	}

	public String getEtatcivil() {
		return Etatcivil;
	}

	public void setEtatcivil(String etatcivil) {
		Etatcivil = etatcivil;
	}

	public String getSociete() {
		return Societe;
	}

	public void setSociete(String societe) {
		Societe = societe;
	}

	public String getLocalite() {
		return Localite;
	}

	public void setLocalite(String localite) {
		Localite = localite;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
}
