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
import com.star.authentificationepave.models.Admin;
import com.star.authentificationepave.models.User;
import com.star.authentificationepave.repository.AdminRepository;
import com.star.authentificationepave.service.AdminService;
import com.star.authentificationepave.service.CompteService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired AdminRepository adminrepository ;
	@Autowired AdminService adminservice ;	
	@Autowired CompteService compteService ;	
	
	@PostMapping ("/addadmin")
	public User addadmin(@RequestBody Admin admin ) {
		/*Admin A = new Admin ();
		A.setTest(true);*/
		return adminservice.addadmin(admin); 	
	}
	
	@GetMapping ("/getalladmin")
	public List <Admin> getadmins(){
		return adminrepository.findAll();
	}
	@GetMapping ("/getadmin/{id}")
		
		public Admin getOne (@PathVariable ("id") Long id ) {
				return adminservice.getAdminbyid(id);

	}
	@DeleteMapping("/deleteadmin/{id}")
	public void deleteAdmin(@PathVariable("id") long id ) {
		Admin c =adminservice.getAdminbyid(id);
		adminservice.deleteAdmin(c);
}
@PutMapping ("/updateadmin/{id}")
public @ResponseBody Admin updateOne(@RequestBody Admin admin,@PathVariable("id") long id ) {
	Admin a =adminservice.getAdminbyid(id);
	a.setCin(admin.getCin());
	a.setFirstname(admin.getFirstname());
	a.setLastname(admin.getLastname());
	a.setDate_naiss(admin.getDate_naiss());
	a.setGenre(admin.getGenre());
	a.setTel(admin.getTel());
	a.setEtatcivil(admin.getEtatcivil());
	a.setSociete(admin.getSociete());
	a.setLocalite(admin.getLocalite());
	a.setMail(admin.getMail());
	return adminservice.addadmin(a);
}
}