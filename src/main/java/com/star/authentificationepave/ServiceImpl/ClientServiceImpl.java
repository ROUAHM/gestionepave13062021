package com.star.authentificationepave.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.star.authentificationepave.models.Client;
import com.star.authentificationepave.repository.ClientRepository;
import com.star.authentificationepave.service.CLientService;

@Service("ClientService")

public class ClientServiceImpl implements CLientService{
	@Autowired ClientRepository clientrepository ;
	@Override
	
	public Client addclient(Client client) {
		// TODO Auto-generated method stub
		return clientrepository.save(client) ;
	}

	@Override
	public Client getclients(Client client) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteClient (Client client) {
		clientrepository.delete(client);
	}

	@Override
	public Client getClientbyid(Long id) {
		// TODO Auto-generated method stub
		return clientrepository.findById(id).get(); 
	}

}

