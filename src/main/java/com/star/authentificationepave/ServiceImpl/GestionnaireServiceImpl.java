package com.star.authentificationepave.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.star.authentificationepave.models.Client;
import com.star.authentificationepave.models.Gestionnaire;
import com.star.authentificationepave.repository.GestionnaireRepository;
import com.star.authentificationepave.service.GestionnaireService;
@Service("GestionnaireService")
public class GestionnaireServiceImpl implements GestionnaireService{
	@Autowired GestionnaireRepository gestionnairerepository ;
	@Override
	
	public Gestionnaire addgestionnaire(Gestionnaire gestionnaire) {
		// TODO Auto-generated method stub
		return gestionnairerepository.save(gestionnaire) ;
	}

	@Override
	public Gestionnaire getGestionnaire (Gestionnaire gestionnaire) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteGestionnaire (Gestionnaire gestionnaire) {
		gestionnairerepository.delete(gestionnaire);
	}

	@Override
	public Gestionnaire getGestionnairebyid(Long id) {
		// TODO Auto-generated method stub
		return gestionnairerepository.findById(id).get(); 
	}

}


