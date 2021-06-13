package com.star.authentificationepave.service;

import com.star.authentificationepave.models.Client;

public interface CLientService {
	public Client addclient (Client client);
	//GETBYID 
	public Client getclients (Client client);
	public Client getClientbyid(Long id);
	public void deleteClient (Client client);
	}
