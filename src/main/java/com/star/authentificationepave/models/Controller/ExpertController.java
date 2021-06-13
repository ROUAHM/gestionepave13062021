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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.star.authentificationepave.models.Expert;
import com.star.authentificationepave.models.User;
import com.star.authentificationepave.repository.ExpertRepository;
import com.star.authentificationepave.service.ExpertService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/expert")
public class ExpertController {
	@Autowired ExpertRepository expertrepository ;
	@Autowired ExpertService expertservice ;	
	
	@PostMapping ("/addexpert")
	public User addexpert(@RequestBody Expert expert ) {
		return expertservice.addexpert(expert); 	
	}
	
	@GetMapping ("/getallexpert")
	public List <Expert> getexperts(){
		return expertrepository.findAll();
	}
	@GetMapping ("/getexpert/{id}")
		
		public Expert getOne (@PathVariable ("id") Long id ) {
		
		return expertservice.getExpertbyid(id);
	}
	@DeleteMapping("/deleteexpert/{id}")
	public void deleteExpert(@PathVariable("id") long id ) {
		Expert c =expertservice.getExpertbyid(id);
		expertservice.deleteExpert(c);
	}
@PutMapping ("/updateexpert/{id}")
public @ResponseBody Expert updateOne(@RequestBody Expert expert,@PathVariable("id") long id ) {
	Expert a =expertservice.getExpertbyid(id);
	a.setCin(expert.getCin());
	a.setFirstname(expert.getFirstname());
	a.setLastname(expert.getLastname());
	a.setDate_naiss(expert.getDate_naiss());
	a.setGenre(expert.getGenre());
	a.setTel(expert.getTel());
	a.setEtatcivil(expert.getEtatcivil());
	a.setSociete(expert.getSociete());
	a.setLocalite(expert.getLocalite());
	a.setMail(expert.getMail());
	return expertservice.addexpert(a);
}
}
