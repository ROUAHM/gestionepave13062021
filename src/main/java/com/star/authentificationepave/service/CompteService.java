package com.star.authentificationepave.service;

import com.star.authentificationepave.models.Compte;

public interface CompteService {

	public Compte addcompte (Compte compte);
	public Compte getcomptebyid (long id);
	public void deleteCompte (Compte compte);

}

