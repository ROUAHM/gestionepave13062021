package com.star.authentificationepave.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
	@GetMapping("/all")
	public String allAccess() {
		return "Public Content.";
	}
	
	@GetMapping("/user")
	@PreAuthorize("hasRole('USER') or hasRole('EPAVISTE') or hasRole('ADMIN') or hasRole('GESTIONNAIRE') or hasRole('EXPERT')or hasRole('CLIENT')")
	public String userAccess() {
		return "User Content.";
	}

	@GetMapping("/epaviste")
	@PreAuthorize("hasRole('EPAVISTE')")
	public String epavisteAccess() {
		return "Epaviste Board.";
	}
	
	@GetMapping("/client")
	@PreAuthorize("hasRole('CLIENT')")
	public String clientAccess() {
		return "Client Board.";
	}
	
	@GetMapping("/gestionnaire")
	@PreAuthorize("hasRole('GESTIONNAIRE')")
	public String gestionnaireAccess() {
		return "Gestionnaire Board.";
	}
	
	@GetMapping("/expert")
	@PreAuthorize("hasRole('EXPERT')")
	public String expertAccess() {
		return "Expert Board.";
	}

	@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminAccess() {
		return "Admin Board.";
	}
}
