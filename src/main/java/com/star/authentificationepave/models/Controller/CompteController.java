package com.star.authentificationepave.models.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.star.authentificationepave.models.Client;
import com.star.authentificationepave.models.Compte;
import com.star.authentificationepave.models.Epaviste;
import com.star.authentificationepave.models.Expert;
import com.star.authentificationepave.models.Gestionnaire;
import com.star.authentificationepave.repository.CompteRepository;
import com.star.authentificationepave.service.AdminService;
import com.star.authentificationepave.service.CLientService;
import com.star.authentificationepave.service.CompteService;
import com.star.authentificationepave.service.EpavisteService;
import com.star.authentificationepave.service.ExpertService;
import com.star.authentificationepave.service.GestionnaireService;

public class CompteController {

	@Autowired CompteRepository compterepository ;
	@Autowired CompteService compteservice ;
	@Autowired GestionnaireService gestionnaireservice ;
	@Autowired AdminService adminservice ;
	@Autowired ExpertService expertservice ;
	@Autowired CLientService clientservice ;
	@Autowired EpavisteService epavisteservice;
	
	/*@PostMapping ("/addcompteadmin/{id}")
	public Compte addcompteadmin(@PathVariable("id") long id, @RequestBody Compte compte ) {
		Admin a = adminservice.getAdminbyid(id);
		compte.setAdmin(a);
		return compteservice.addcompte(compte);
	}
	@GetMapping ("/getcompteadmin/{id}")
	public Compte getcompteadmin(@PathVariable("id") long id, @RequestBody Compte compte ) {
		compte.getAdmin();
		return compteservice.getcomptebyid(id);	
		}	*/
	@PostMapping ("/addcompteexpert/{id}")
	public Compte addcompteexpert(@PathVariable("id") long id, @RequestBody Compte compte ) {
		Expert e =expertservice.getExpertbyid(id);
		compte.setExpert(e);
		return compteservice.addcompte(compte);
	}
	@GetMapping ("/getcompteexpert/{id}")
	public Compte getcompteexpert(@PathVariable("id") long id, @RequestBody Compte compte ) {
		compte.getExpert();
		return compteservice.getcomptebyid(id);	
	}
	@PostMapping ("/addcompteclient/{id}")
	public Compte addcompteclient(@PathVariable("id") long id, @RequestBody Compte compte ) {
		Client c =clientservice.getClientbyid(id);
		compte.setClient(c);
		return compteservice.addcompte(compte);
	}
	@GetMapping ("/getcompteclient/{id}")
	public Compte getcompteclient(@PathVariable("id") long id, @RequestBody Compte compte ) {
		compte.getClient();
		return compteservice.getcomptebyid(id);	
	}
	@PostMapping ("/addcomptegestionnaire/{id}")
	public Compte addcomptegestionnaire(@PathVariable("id") long id, @RequestBody Compte compte ) {
		Gestionnaire g =gestionnaireservice.getGestionnairebyid(id);
		compte.setGestionnaire(g);
		return compteservice.addcompte(compte);
	}
	@GetMapping ("/getcomptegestionnaire/{id}")
	public Compte getcomptegestionnaire(@PathVariable("id") long id, @RequestBody Compte compte ) {
		compte.getGestionnaire();
		return compteservice.getcomptebyid(id);	
	}
	@PostMapping ("/addcompteepaviste/{id}")
	public Compte addcompteepaviste(@PathVariable("id") long id, @RequestBody Compte compte ) {
		Epaviste ep =epavisteservice.getepavistebyid(id);
		compte.setEpaviste(ep);
		return compteservice.addcompte(compte);
	}
	@GetMapping ("/getcompteepaviste/{id}")
	public Compte getcompteepaviste(@PathVariable("id") long id, @RequestBody Compte compte ) {
		compte.getEpaviste();
		return compteservice.getcomptebyid(id);	
	}
	
	@PostMapping ("/addcompte")
	public Compte addcompte(@RequestBody Compte compte ) {
		return compteservice.addcompte(compte); 	
	}
	@GetMapping ("/getallcompte")
	public List<Compte> getcomptes(){
		return compterepository.findAll();
	}
	@GetMapping ("/getcompte/{id}")
		public Compte getOne(@PathVariable("id") long id ) {
		return compteservice.getcomptebyid(id);
	}
	@DeleteMapping("/deletecompte/{id}")
		public void deleteCompte(@PathVariable("id") long id ) {
			Compte c =compteservice.getcomptebyid(id);
			compteservice.deleteCompte(c);
	}
	@PutMapping ("/updatecompte/{id}")
	public @ResponseBody Compte updateOne(@RequestBody Compte compte,@PathVariable("id") long id ) {
		Compte c =compteservice.getcomptebyid(id);
		c.setEmail(compte.getEmail());
		c.setPassword(compte.getPassword());
		return compteservice.addcompte(c);
	}
}
