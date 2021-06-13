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

import com.star.authentificationepave.models.Vehicule;
import com.star.authentificationepave.repository.VehiculeRepository;
import com.star.authentificationepave.service.VehiculeService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/vehicule")
public class VehiculeController {
	@Autowired VehiculeRepository vehiculerepository ;
	@Autowired VehiculeService vehiculeservice ;
	@PostMapping ("/addvehicule")
	public Vehicule addvehicule(@RequestBody Vehicule vehicule ) {
		return vehiculeservice.addvehicule(vehicule); 	
	}
	
	@GetMapping ("/getallvehicule")
	public List <Vehicule> getvehicules(){
		return vehiculerepository.findAll();
	}
	
	@GetMapping ("/getvehicule/{id}")
	public Vehicule getOne (@PathVariable ("id") Long id ) {
		return vehiculeservice.getvehiculebyid(id);
	}
	@DeleteMapping("/deletevehicule/{id}")
	public void deleteVehicule(@PathVariable("id") long id ) {
		Vehicule c =vehiculeservice.getvehiculebyid(id);
		vehiculeservice.deleteVehicule(c);
}
@PutMapping ("/updatevehicule/{id}")
public @ResponseBody Vehicule updateOne(@RequestBody Vehicule vehicule,@PathVariable("id") long id ) {
	Vehicule v =vehiculeservice.getvehiculebyid(id);
	v.setMatricule(vehicule.getMatricule());
	v.setChassis(vehicule.getChassis());
	v.setChevaux(vehicule.getChevaux());
	v.setNumdossierassurance(vehicule.getNumdossierassurance());
	v.setMarque(vehicule.getMarque());
	v.setModele(vehicule.getModele());
	v.setCarburant(vehicule.getCarburant());
	return vehiculeservice.addvehicule(v);
}

}
