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

import com.star.authentificationepave.models.Gestionnaire;
import com.star.authentificationepave.models.User;
import com.star.authentificationepave.repository.GestionnaireRepository;
import com.star.authentificationepave.service.GestionnaireService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/gestionnaire")
public class GestionnaireController {
	@Autowired GestionnaireRepository gestionnairerepository ;
	@Autowired GestionnaireService gestionnaireservice ;	
	
	@PostMapping ("/addgestionnaire")
	public User addgestionnaire(@RequestBody Gestionnaire gestionnaire ) {
		return gestionnaireservice.addgestionnaire(gestionnaire); 	
	}
	
	@GetMapping ("/getallgestionnaire")
	public List <Gestionnaire> getgestionnaires(){
		return gestionnairerepository.findAll();
	}
	
	
	@GetMapping ("/getgestionnaire/{id}")
		public Gestionnaire getOne(@PathVariable ("id") Long id ) {
		
		return gestionnaireservice.getGestionnairebyid(id);
	}
	
	@DeleteMapping("/deletegestionnaire/{id}")
	public void deleteExpert(@PathVariable("id") long id ) {
		Gestionnaire c =gestionnaireservice.getGestionnairebyid(id);
		gestionnaireservice.deleteGestionnaire(c);
	}
@PutMapping ("/updategestionnaire/{id}")
public @ResponseBody Gestionnaire updateOne(@RequestBody Gestionnaire gestionnaire,@PathVariable("id") long id ) {
	Gestionnaire a =gestionnaireservice.getGestionnairebyid(id);
	a.setCin(gestionnaire.getCin());
	a.setFirstname(gestionnaire.getFirstname());
	a.setLastname(gestionnaire.getLastname());
	a.setDate_naiss(gestionnaire.getDate_naiss());
	a.setGenre(gestionnaire.getGenre());
	a.setTel(gestionnaire.getTel());
	a.setEtatcivil(gestionnaire.getEtatcivil());
	a.setSociete(gestionnaire.getSociete());
	a.setLocalite(gestionnaire.getLocalite());
	a.setMail(gestionnaire.getMail());
	return gestionnaireservice.addgestionnaire(a);
}
}
