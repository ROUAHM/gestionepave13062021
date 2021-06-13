package com.star.authentificationepave.models.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.star.authentificationepave.models.User;
import com.star.authentificationepave.service.UserService;
import com.star.authentificationepave.service.UserService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired UserService userservice ;
	@PostMapping ("/adduser")
	public User adduser(@RequestBody User user ) {
		return userservice.adduser(user); 	
	}
	
	
	@GetMapping ("/getuser{id}")
	
	public User getOne (@PathVariable ("id") Long id ) {
		
	return userservice.getUser(id);
}
	/*@PostMapping("/addepaviste")
	public User addepaviste(@RequestBody Epaviste epaviste) {
		return userservice.addepaviste(epaviste) ;
	}
	@GetMapping("/getallepaviste")
	public List<Epaviste> getepavistes(){
	return epavisterepository.findAll();
	}
@PostMapping ("/addexpert")
public User addexpert(@RequestBody Expert expert ) {
	return userservice.addexpert(expert); 	
}

@GetMapping ("/getallexpert")
public List<Expert> getexperts(){
	return expertrepository.findAll();
}

@PostMapping ("/addclient")
public User addclient (@RequestBody Client client ) {
	return userservice.addclient(client); 	
}

@GetMapping ("/getallclient")
public List<Client> getclients(){
	return clientrepository.findAll();
}
@PostMapping ("/addgestionnaire")
public User addgestionnaire (@RequestBody Gestionnaire gestionnaire ) {
	return userservice.addgestionnaire(gestionnaire); 	
}

@GetMapping ("/getallgestionnaire")
public List<Gestionnaire> getallgestionnaires(){
	return gestionnairerepository.findAll();
}
	

	@GetMapping ("/getallcompte")
	public List<Compte> getallcompte(){
		return compterepository.findAll();
	}
	@PostMapping ("/addenchere")
	public Enchere addenchere (@RequestBody Enchere enchere ) {
		return userservice.addenchere(enchere); 	
	}
	
	@GetMapping ("/getallenchere")
	public List<Enchere> getallenchere(){
		return enchererepository.findAll();
	}
	@PostMapping ("/addepave")
	public Epave addepave (@RequestBody Epave epave ) {
		return userservice.addepave(epave); 	
	}
	
	@GetMapping ("/getallepave")
	public List<Epave> getallepave(){
		return epaverepository.findAll();
	}
	
	@PostMapping ("/addoffre")
	public Offre addoffre (@RequestBody Offre offre ) {
		return userservice.addoffre(offre); 	
	}
	
	@GetMapping ("/getalloffre")
	public List<Offre> getalloffre(){
		return offrerepository.findAll();
	}

	@PostMapping ("/addrapportpreliminaire")
	public RapportPreliminaire addrapportpreliminaire (@RequestBody RapportPreliminaire rapportpreliminaire ) {
		return userservice.addrapportpreliminaire(rapportpreliminaire); 	
	}
	
	/*@GetMapping ("/getallrapportpreliminaire")
	public List<RapportPreliminaire> getallrapportpreliminaire(){
		return rapportpreliminairerepository.findAll();
	}*/
	
	
}
