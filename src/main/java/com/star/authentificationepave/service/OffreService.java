package com.star.authentificationepave.service;

import com.star.authentificationepave.models.Offre;

public interface OffreService {
	public Offre addoffre (Offre offre);
	public Offre getOffrebyid (long id);
	public void deleteOffre (Offre offre);
	
}