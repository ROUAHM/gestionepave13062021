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

import com.star.authentificationepave.models.Epaviste;
import com.star.authentificationepave.models.User;
import com.star.authentificationepave.repository.EpavisteRepository;
import com.star.authentificationepave.service.EpavisteService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/epaviste")
public class EpavisteController {
	@Autowired EpavisteRepository epavisterepository ;
	@Autowired EpavisteService epavisteservice ;	
	
	@PostMapping ("/addepaviste")
	public User addepaviste(@RequestBody Epaviste epaviste ) {
		return epavisteservice.addepaviste(epaviste); 	
	}
	
	@GetMapping ("/getallepaviste")
	public List <Epaviste> getepavistes(){
		return epavisterepository.findAll();
	}
	@GetMapping ("/getepaviste/{id}")
		
		public Epaviste getOne (@PathVariable ("id") Long id ) {

		return 	epavisteservice.getepavistebyid(id);
	}
	@DeleteMapping("/deleteepaviste/{id}")
	public void deleteEpaviste(@PathVariable("id") long id ) {
		Epaviste c =epavisteservice.getepavistebyid(id);
		epavisteservice.deleteepaviste(c);
	}
@PutMapping ("/updateepaviste/{id}")
public @ResponseBody Epaviste updateOne(@RequestBody Epaviste epaviste,@PathVariable("id") long id ) {
	Epaviste a =epavisteservice.getepavistebyid(id);
	a.setCin(epaviste.getCin());
	a.setFirstname(epaviste.getFirstname());
	a.setLastname(epaviste.getLastname());
	a.setDate_naiss(epaviste.getDate_naiss());
	a.setGenre(epaviste.getGenre());
	a.setTel(epaviste.getTel());
	a.setEtatcivil(epaviste.getEtatcivil());
	a.setSociete(epaviste.getSociete());
	a.setLocalite(epaviste.getLocalite());
	a.setMail(epaviste.getMail());
	return epavisteservice.addepaviste(a);
}
}

