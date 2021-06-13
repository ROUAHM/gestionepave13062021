package com.star.authentificationepave.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

	@Entity
	public class Vehicule implements Serializable  {
		@Id
		@GeneratedValue( strategy = GenerationType.TABLE )
		private Long id;
		private String matricule ;
		private Long chassis;
		private Long chevaux;
		private String  numdossierassurance;
		private String marque;
		private String modele;
		private String carburant ;
		
		public Vehicule() {
			super();
			
		}
		
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getMatricule() {
			return matricule;
		}
		public void setMatricule(String matricule) {
			this.matricule = matricule;
		}
		
		public Long getChassis() {
			return chassis;
		}
		public void setChassis(Long chassis) {
			this.chassis = chassis;
		}
		
		public Long getChevaux() {
			return chevaux;
		}


		public void setChevaux(Long chevaux) {
			this.chevaux = chevaux;
		}


		public String getNumdossierassurance() {
			return numdossierassurance;
		}


		public void setNumdossierassurance(String numdossierassurance) {
			this.numdossierassurance = numdossierassurance;
		}


		public String getMarque() {
			return marque;
		}
		public void setMarque(String marque) {
			this.marque = marque;
		}
		public String getModele() {
			return modele;
		}
		public void setModele(String modele) {
			this.modele = modele;
		}
		public String getCarburant() {
			return carburant;
		}
		public void setCarburant(String carburant) {
			this.carburant = carburant;
		}


		@Override
		public String toString() {
			return "Vehicule [id=" + id + ", matricule=" + matricule + ", chassis=" + chassis + ", chevaux=" + chevaux
					+ ", numdossierassurance=" + numdossierassurance + ", marque=" + marque + ", modele=" + modele
					+ ", carburant=" + carburant + "]";
		}

		public Vehicule(Long id, String matricule, Long chassis, Long chevaux, String numdossierassurance, String marque,
				String modele, String carburant) {
			super();
			this.id = id;
			this.matricule = matricule;
			this.chassis = chassis;
			this.chevaux = chevaux;
			this.numdossierassurance = numdossierassurance;
			this.marque = marque;
			this.modele = modele;
			this.carburant = carburant;
		}
		
}
