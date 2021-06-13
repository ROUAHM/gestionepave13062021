package com.star.authentificationepave.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.star.authentificationepave.models.Compte;
import com.star.authentificationepave.repository.CompteRepository;
import com.star.authentificationepave.service.CompteService;
@Service("CompteService")
public class CompteServiceImpl implements CompteService{
	@Autowired CompteRepository compterepository ;
	@Override
	public Compte addcompte(Compte compte) {
		// TODO Auto-generated method stub
		return compterepository.save(compte) ;
	}
	@Override
	public void deleteCompte (Compte compte) {
		compterepository.delete(compte);
	}
	@Override
	public Compte getcomptebyid(long id) {
		// TODO Auto-generated method stub
		return compterepository.findById(id).get();
	}

}

