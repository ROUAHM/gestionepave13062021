package com.star.authentificationepave.service;

import java.util.List;

import com.star.authentificationepave.models.RapportPreliminaire;

public interface RapportPreliminaireService {
	public RapportPreliminaire addrapportpreliminaire( RapportPreliminaire rapportpreliminaire ) ;
	public RapportPreliminaire getrapportpreliminairebyid (Long id);
	public void deleteRapportPreliminaire( RapportPreliminaire rapportpreliminaire ) ;
	public List<RapportPreliminaire>  getallrapportPreliminaire(RapportPreliminaire rapportpreliminaire);

}
