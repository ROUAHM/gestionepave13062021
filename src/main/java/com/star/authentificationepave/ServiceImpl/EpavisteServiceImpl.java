package com.star.authentificationepave.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.star.authentificationepave.models.Epaviste;
import com.star.authentificationepave.repository.EpavisteRepository;
import com.star.authentificationepave.service.EpavisteService;

public class EpavisteServiceImpl implements EpavisteService{
	@Autowired EpavisteRepository epavisterepository ;
	@Override
	
	public Epaviste addepaviste(Epaviste epaviste) {
		// TODO Auto-generated method stub
		return epavisterepository.save(epaviste) ;
	}

	@Override
	public Epaviste getepaviste (Epaviste epaviste) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteepaviste (Epaviste epaviste) {
		epavisterepository.delete(epaviste);
	}

	@Override
	public Epaviste getepavistebyid(Long id) {
		// TODO Auto-generated method stub
		return epavisterepository.findById(id).get(); 
	}

}



