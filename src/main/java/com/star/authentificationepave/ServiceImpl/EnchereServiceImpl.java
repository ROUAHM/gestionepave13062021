package com.star.authentificationepave.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.star.authentificationepave.models.Enchere;
import com.star.authentificationepave.repository.EnchereRepository;
import com.star.authentificationepave.service.EnchereService;

@Service("EnchereService")
public class EnchereServiceImpl implements EnchereService {
	
		@Autowired EnchereRepository enchererepository ;
		@Override
		public Enchere addenchere (Enchere enchere) {
			return enchererepository.save(enchere) ;
		}
		public Enchere getencherebyid (Long id) {
			return enchererepository.findById(id).get(); 
		}
		@Override
		public void deleteEnchere (Enchere enchere) {
			enchererepository.delete(enchere);
		}

}
