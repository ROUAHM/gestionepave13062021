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

import com.star.authentificationepave.models.Client;
import com.star.authentificationepave.models.User;
import com.star.authentificationepave.repository.ClientRepository;
import com.star.authentificationepave.service.CLientService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/client")
public class ClientController {	@Autowired ClientRepository clientrepository ;
@Autowired CLientService clientservice ;	

@PostMapping ("/addclient")
public User addclient(@RequestBody Client client ) {
	return clientservice.addclient(client); 	
}

@GetMapping ("/getallclient")
public List <Client> getclients(){
	return clientrepository.findAll();
}
@GetMapping ("/getclient/{id}")
	
	public Client getOne (@PathVariable ("id") Long id ) {
		return clientservice.getClientbyid(id);

}
@DeleteMapping("/deleteclient/{id}")
public void deleteClient(@PathVariable("id") long id ) {
	Client c =clientservice.getClientbyid(id);
	clientservice.deleteClient(c);
}
@PutMapping ("/updateclient/{id}")
public @ResponseBody Client updateOne(@RequestBody Client client,@PathVariable("id") long id ) {
	Client a =clientservice.getClientbyid(id);
a.setCin(client.getCin());
a.setFirstname(client.getFirstname());
a.setLastname(client.getLastname());
a.setDate_naiss(client.getDate_naiss());
a.setGenre(client.getGenre());
a.setTel(client.getTel());
a.setEtatcivil(client.getEtatcivil());
a.setSociete(client.getSociete());
a.setLocalite(client.getLocalite());
a.setMail(client.getMail());
return clientservice.addclient(a);
}
}
