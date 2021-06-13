package com.star.authentificationepave.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.star.authentificationepave.models.Epave;
import com.star.authentificationepave.repository.EpaveRepository;
import com.star.authentificationepave.service.EpaveService;

@Service("EpaveService")
public class EpaveserviceImpl implements EpaveService {
	@Autowired EpaveRepository epaverepository ;
	@Override
	public Epave addepave (Epave epave) {
		return epaverepository.save(epave) ;
	}
	public Epave getEpaveById(Long id) {
		return epaverepository.findById(id).get() ;
	}
	@Override
	public void deleteEpave (Epave epave) {
		epaverepository.delete(epave);
	}
}

