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
import com.star.authentificationepave.models.Epaviste;
import com.star.authentificationepave.models.Offre;
import com.star.authentificationepave.repository.OffreRepository;
import com.star.authentificationepave.service.EnchereService;
import com.star.authentificationepave.service.EpaveService;
import com.star.authentificationepave.service.EpavisteService;
import com.star.authentificationepave.service.OffreService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/offre")
public class OffreController {
	@Autowired OffreRepository offrerepository ;
	@Autowired OffreService offreservice ;	
	@Autowired EnchereService enchereservice ;
	@Autowired EpavisteService epavisteservice ;
	@Autowired EpaveService epaveservice ;	

	
	@PostMapping ("/addoffreenchere/{id}")
	public Offre addoffreenchere(@PathVariable("id") long id, @RequestBody Offre offre) {
		Enchere a = enchereservice.getencherebyid(id);
		offre.setEnchere(a);
		return offreservice.addoffre(offre);
	}
	@GetMapping ("/getoffreenchere/{id}")
	public Offre getoffreenchere(@PathVariable("id") long id, @RequestBody Offre offre) {
		offre.getEnchere();
		return offreservice.getOffrebyid(id);
	}
	
	@PostMapping ("/addoffreepaviste/{id}")
	public Offre addoffreepaviste(@PathVariable("id") long id,@RequestParam long idepav, @RequestBody Offre offre) {
		Epaviste a = epavisteservice.getepavistebyid(id);
		Epave ep = epaveservice.getEpaveById(idepav);
		offre.setEpave(ep);
		offre.setEpaviste(a);
		return offreservice.addoffre(offre);
	}
	@GetMapping ("/getoffreepaviste/{id}")
	public Offre getoffreepaviste(@PathVariable("id") long id, @RequestBody Offre offre) {
		offre.getEpaviste();
		return offreservice.getOffrebyid(id);
	}
	
	@PostMapping ("/addoffre")
	public Offre addoffre(@RequestBody Offre offre ) {
		return offreservice.addoffre(offre); 	
	}
	
	@GetMapping ("/getalloffre")
	public List <Offre> getoffres(){
		return offrerepository.findAll();
	}
	@GetMapping ("/getoffre/{id}")
		public Offre getOne (@PathVariable ("id") Long id ) {
		Offre o =offreservice.getOffrebyid(id);
		return o;
	}
	@DeleteMapping("/deleteoffre/{id}")
	public void deleteOffre (@PathVariable ("id") Long id ) {
		Offre c =offreservice.getOffrebyid(id);
		offreservice.deleteOffre(c);
}
@PutMapping ("/updateoffre/{id}")
public @ResponseBody Offre updateOne (@RequestBody Offre offre,@PathVariable ("id") Long id ) {
	Offre o =offreservice.getOffrebyid(id);
	o.setDate(offre.getDate());
	o.setValeur(offre.getValeur());
	return offreservice.addoffre(o);
}
}
