package com.star.authentificationepave.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.star.authentificationepave.models.Expert;
import com.star.authentificationepave.repository.ExpertRepository;
import com.star.authentificationepave.service.ExpertService;

@Service("ExpertService")
public class ExpertServiceImpl implements ExpertService{
	@Autowired ExpertRepository expertrepository ;
	@Override
	
	public Expert addexpert(Expert expert) {
		// TODO Auto-generated method stub
		return expertrepository.save(expert) ;
	}

	@Override
	public Expert getexperts(Expert expert) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteExpert (Expert expert) {
		expertrepository.delete(expert);
	}

	@Override
	public Expert getExpertbyid(Long id) {
		// TODO Auto-generated method stub
		return expertrepository.findById(id).get(); 
	}

}


