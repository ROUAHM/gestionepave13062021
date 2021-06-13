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

import com.star.authentificationepave.models.Epave;
import com.star.authentificationepave.models.Expert;
import com.star.authentificationepave.models.RapportPreliminaire;
import com.star.authentificationepave.models.Vehicule;
import com.star.authentificationepave.repository.EpaveRepository;
import com.star.authentificationepave.service.EpaveService;
import com.star.authentificationepave.service.EpavisteService;
import com.star.authentificationepave.service.ExpertService;
import com.star.authentificationepave.service.RapportPreliminaireService;
import com.star.authentificationepave.service.VehiculeService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/epave")
public class EpaveController {
	@Autowired EpaveRepository epaverepository ;
	@Autowired EpaveService epaveservice ;	
	@Autowired RapportPreliminaireService rapportpreliminaireservice ;
	@Autowired EpavisteService epavisteservice ;
	@Autowired ExpertService expertservice ;
	@Autowired VehiculeService vehiculeservice ;
	
	
	@PostMapping ("/addepaveexpert/{id}")
	public Epave addepaveexpert(@PathVariable("id") long id,@RequestParam long idv, @RequestBody Epave epave ) {
		Expert a = expertservice.getExpertbyid(id);
		Vehicule v = vehiculeservice.getvehiculebyid(idv);
		epave.setVehicule(v);
		epave.setExpert(a);
		return epaveservice.addepave(epave); 
	}
	
	@GetMapping("/getepaveexpert/{id}")
	public Epave getepaveexpert(@PathVariable("id") long id ) {
		return epaveservice.getEpaveById(id);
	}	

	

	@PostMapping ("/addepaverapport/{id}")
	public Epave addepaverapport(@PathVariable("id") long id,@RequestParam long idv ,@RequestBody Epave epave) {
		RapportPreliminaire a = rapportpreliminaireservice.getrapportpreliminairebyid(id);
		Vehicule v = vehiculeservice.getvehiculebyid(idv);
		epave.setVehicule(v);
		epave.setRapportpreliminaires(a);
		return epaveservice.addepave(epave); 
	}
	@GetMapping ("/getepaverapport/{id}")
	public Epave getepaverapport(@PathVariable("id") long id, @RequestBody Epave epave) {
		epave.getVehicule();
		epave.getRapportpreliminaires();
		return epaveservice.getEpaveById(id);
	}
	
	@PostMapping ("/addepave")
	public Epave addepave(@RequestBody Epave epave ) {
		return epaveservice.addepave(epave); 	
	}
	
	@GetMapping ("/getallepave")
	public List <Epave> getepaves(){
		return epaverepository.findAll();
	}
	@GetMapping ("/getepave{id}")
		
		public Epave getOne (@PathVariable ("id") Long id ) {
		Epave ep =epaveservice.getEpaveById(id);
		return ep;
	}
	@DeleteMapping("/deleteepave/{id}")
	public void deleteEpave (@PathVariable ("id") Long id ) {
		Epave c =epaveservice.getEpaveById(id);
		epaveservice.deleteEpave(c);
}
@PutMapping ("/updateepave/{id}")
public @ResponseBody Epave updateOne (@RequestBody Epave epave,@PathVariable ("id") Long id ) {
	Epave ep =epaveservice.getEpaveById(id);
	ep.setId_epave(epave.getId());
	ep.setPrix(epave.getPrix());
	ep.setDate_daccident(epave.getDate_daccident());
	return epaveservice.addepave(ep);
}
}
