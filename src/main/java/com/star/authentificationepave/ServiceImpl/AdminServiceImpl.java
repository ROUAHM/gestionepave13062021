package com.star.authentificationepave.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.star.authentificationepave.models.Admin;
import com.star.authentificationepave.repository.AdminRepository;
import com.star.authentificationepave.service.AdminService;

public class AdminServiceImpl implements AdminService{
	@Autowired AdminRepository adminRepository ;
	@Override
	
	public Admin addadmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepository.save(admin) ;
	}

	@Override
	public Admin getAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin getAdminbyid(Long id) {
		// TODO Auto-generated method stub
		return adminRepository.findById(id).get(); 
	}
	@Override
	public void deleteAdmin (Admin admin) {
		adminRepository.delete(admin);
	}


}
