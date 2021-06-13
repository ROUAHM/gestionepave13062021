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

import com.star.authentificationepave.models.Expert;
import com.star.authentificationepave.models.RapportPreliminaire;
import com.star.authentificationepave.models.Vehicule;
import com.star.authentificationepave.repository.RapportPreliminaireRepository;
import com.star.authentificationepave.service.ExpertService;
import com.star.authentificationepave.service.RapportPreliminaireService;
import com.star.authentificationepave.service.VehiculeService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/rapportPreliminaire")
public class RapportPreliminaireController {
	@Autowired RapportPreliminaireRepository rapportpreliminairerepository ;
	@Autowired RapportPreliminaireService rapportpreliminaireservice ;
	@Autowired ExpertService expertservice ;
	@Autowired VehiculeService vehiculeservice ;

	@PostMapping ("/addrapportexpert/{id}")
	public RapportPreliminaire addrapportexpert(@PathVariable("id") long id,@RequestParam long idv ,@RequestBody RapportPreliminaire rapportpreliminaire ) {
		Expert ep =expertservice.getExpertbyid(id);
		Vehicule v = vehiculeservice.getvehiculebyid(idv);
		rapportpreliminaire.setVehicule(v);
		rapportpreliminaire.setExpert(ep);
		return rapportpreliminaireservice.addrapportpreliminaire(rapportpreliminaire);
	}
	@GetMapping ("/getrapportexpert/{id}")
	public RapportPreliminaire getrapportexpert(@PathVariable("id") long id, @RequestBody RapportPreliminaire rapportpreliminaire ) {
		rapportpreliminaire.getExpert();
		return rapportpreliminaireservice.getrapportpreliminairebyid(id);
	}
	
	@PostMapping ("/addrapportPreliminaire")
	public RapportPreliminaire addrapportpreliminaire(@RequestBody RapportPreliminaire rapportpreliminaire ) {
		return rapportpreliminaireservice.addrapportpreliminaire(rapportpreliminaire); 	
	}
	
	
	@GetMapping("/getallrapportPreliminaire")
	public List<RapportPreliminaire> getallrapportPreliminaire(){
	return rapportpreliminairerepository.findAll();
	}
	
	

	@GetMapping ("/getrapportpreliminairebyid{id}")
	
	public RapportPreliminaire getOne (@PathVariable ("id") Long id ) {
		RapportPreliminaire c =rapportpreliminaireservice.getrapportpreliminairebyid(id);
	return c;
}
	@DeleteMapping("/deleterapportpreliminaire/{id}")
	public void deleteRapportPreliminaire (@PathVariable ("id") Long id ) {
		RapportPreliminaire rp =rapportpreliminaireservice.getrapportpreliminairebyid(id);
		rapportpreliminaireservice.deleteRapportPreliminaire(rp);
}
@PutMapping ("/updaterapportpreliminaire/{id}")
public @ResponseBody RapportPreliminaire updateOne (@RequestBody RapportPreliminaire rapportpreliminaire,@PathVariable ("id") Long id ) {
	RapportPreliminaire rp =rapportpreliminaireservice.getrapportpreliminairebyid(id);
	rp.setId(rapportpreliminaire.getId());
	rp.setDegat_constate(rapportpreliminaire.getDegat_constate());
	rp.setLieu_vehicule(rapportpreliminaire.toString());
	rp.setValeur(rapportpreliminaire.getValeur());
	rp.setValeur_epaves(rapportpreliminaire.getValeur_epaves());
	rp.setImage(rapportpreliminaire.getImage());
	return rapportpreliminaireservice.addrapportpreliminaire(rp);

}
}
