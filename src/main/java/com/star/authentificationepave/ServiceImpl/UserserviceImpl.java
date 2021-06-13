package com.star.authentificationepave.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.star.authentificationepave.models.User;
import com.star.authentificationepave.repository.UserRepository;
import com.star.authentificationepave.service.UserService;

@Service("UserService")

public class UserserviceImpl implements UserService {
	@Autowired UserRepository userrepository ;
	
	@Override
	public User adduser(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public User getUser(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
