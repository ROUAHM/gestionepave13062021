package com.star.authentificationepave.service;

import com.star.authentificationepave.models.Expert;

public interface ExpertService {

	public Expert addexpert (Expert expert);
	//GETBYID 
	public Expert getexperts (Expert expert);
	public Expert getExpertbyid(Long id);
	public void deleteExpert (Expert expert);

}
