package com.star.authentificationepave.service;

import com.star.authentificationepave.models.Admin;

public interface AdminService {
	public Admin addadmin (Admin admin);
	//GETBYID 
		public Admin getAdmin (Admin admin);
		public Admin getAdminbyid(Long id);
		public void deleteAdmin (Admin admin);

}
