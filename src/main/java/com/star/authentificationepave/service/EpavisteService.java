package com.star.authentificationepave.service;

import com.star.authentificationepave.models.Epaviste;

public interface EpavisteService {
	public Epaviste addepaviste (Epaviste epaviste);
	//GETBYID 
		public Epaviste getepaviste (Epaviste epaviste);
		public Epaviste getepavistebyid(Long id);
		public void deleteepaviste (Epaviste epaviste);

}