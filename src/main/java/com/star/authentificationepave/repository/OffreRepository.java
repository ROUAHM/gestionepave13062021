package com.star.authentificationepave.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.star.authentificationepave.models.Offre;
@Repository("offrerepository")

public interface OffreRepository extends JpaRepository<Offre,Long> {

}
