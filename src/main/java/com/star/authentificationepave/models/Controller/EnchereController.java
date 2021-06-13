package com.star.authentificationepave.models.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.star.authentificationepave.models.Enchere;
import com.star.authentificationepave.models.Epave;
import com.star.authentificationepave.models.Expert;
import com.star.authentificationepave.repository.EnchereRepository;
import com.star.authentificationepave.service.EnchereService;
import com.star.authentificationepave.service.EpaveService;
import com.star.authentificationepave.service.ExpertService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/enchere")
public class EnchereController {	
	@Autowired EnchereRepository enchererepository ;
	@Autowired EnchereService enchereservice ;
	@Autowired EpaveService epaveservice ;	
	@Autowired ExpertService expertservice ;
	@PostMapping ("/addencherepave/{id}")
	public Enchere addencherepave(@PathVariable("id") long id,@RequestParam long epav, @RequestBody Enchere enchere  ) {
		Expert e = expertservice.getExpertbyid(id);
		Epave ep =epaveservice.getEpaveById(epav);
		enchere.setExpert(e);
		enchere.setEpave(ep);
		return enchereservice.addenchere(enchere); 	
	}
	@GetMapping ("/getencherepave/{id}")
	public Enchere getencherepave(@PathVariable("id") long id, @RequestBody Enchere enchere  ) {
		enchere.getEpave();
		return enchereservice.getencherebyid(id); 	
	}
	@PostMapping ("/addenchere")
	public Enchere addenchere(@RequestBody Enchere enchere ) {
		return enchereservice.addenchere(enchere); 	
	}
	
	@GetMapping ("/getallenchere")
	public List <Enchere> getEncheres(){
		return  enchererepository.findAll();
	}
	@GetMapping ("/getenchere/{id}")
		
		public Enchere getOne (@PathVariable ("id") Long id ) {
		Enchere e =enchereservice.getencherebyid(id);
		return e;
	}
	@DeleteMapping("/deleteenchere/{id}")
	public void deleteEnchere (@PathVariable ("id") Long id ) {
		Enchere c =enchereservice.getencherebyid(id);
		enchereservice.deleteEnchere(c);
	}
	@PutMapping ("/updateenchere/{id}")
	public @ResponseBody Enchere updateOne (@RequestBody Enchere enchere,@PathVariable ("id") Long id ) {
	Enchere e =enchereservice.getencherebyid(id);
	e.setId(enchere.getId());
	e.setDuree(enchere.getDuree());
	e.setEtat(enchere.getEtat());
	e.setPrix(enchere.getPrix());
	e.setDescription(enchere.getDescription());
	return  enchereservice.addenchere(e);
	
	
	}

}

