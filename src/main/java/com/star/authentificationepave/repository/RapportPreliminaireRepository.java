package com.star.authentificationepave.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.star.authentificationepave.models.RapportPreliminaire;

@Repository("rapportpreliminaireRepository")
public interface RapportPreliminaireRepository extends JpaRepository<RapportPreliminaire, Long> {
	


}
