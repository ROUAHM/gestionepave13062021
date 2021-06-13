package com.star.authentificationepave.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.star.authentificationepave.models.RapportPreliminaire;
import com.star.authentificationepave.repository.RapportPreliminaireRepository;
import com.star.authentificationepave.service.RapportPreliminaireService;

@Service("RapportPreliminaireService")
public class RapportPreliminaireServiceImpl implements RapportPreliminaireService  {
	@Autowired RapportPreliminaireRepository rapportpreliminairerepository ;
	
	@Override
	public RapportPreliminaire addrapportpreliminaire(RapportPreliminaire rapportpreliminaire) {
		return rapportpreliminairerepository.save(rapportpreliminaire) ;
	}
	
	@Override
	public List<RapportPreliminaire> getallrapportPreliminaire (RapportPreliminaire rapportpreliminaire) {

		return rapportpreliminairerepository.findAll();
	}
	@Override
	public RapportPreliminaire getrapportpreliminairebyid(Long id) {
		return rapportpreliminairerepository.findById(id).get();
	}
	@Override
	public void deleteRapportPreliminaire (RapportPreliminaire rapportpreliminaire) {
		rapportpreliminairerepository.delete(rapportpreliminaire);
	}

}