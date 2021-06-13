package com.star.authentificationepave.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.star.authentificationepave.models.Offre;
import com.star.authentificationepave.repository.OffreRepository;
import com.star.authentificationepave.service.OffreService;
@Service("OffreService")

public class OffreServiceImpl implements OffreService{
	@Autowired OffreRepository offrerepository ;

	@Override
	public Offre addoffre(Offre offre) {
		return offrerepository.save(offre) ;
	}
	@Override
	public Offre getOffrebyid(long id) {
		return offrerepository.findById(id).get();
	}
	@Override
	public void deleteOffre (Offre offre) {
		offrerepository.delete(offre);
	}
	
}