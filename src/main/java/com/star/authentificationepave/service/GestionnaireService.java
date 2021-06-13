package com.star.authentificationepave.service;

import com.star.authentificationepave.models.Gestionnaire;

public interface GestionnaireService {
	public Gestionnaire addgestionnaire (Gestionnaire gestionnaire);
	//GETBYID 
		public Gestionnaire getGestionnaire (Gestionnaire gestionnaire);
		public Gestionnaire getGestionnairebyid(Long id);
		public void deleteGestionnaire (Gestionnaire gestionnaire);

}
