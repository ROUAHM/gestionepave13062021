package com.star.authentificationepave.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.star.authentificationepave.models.Compte;
@Repository("compterepository")
public interface CompteRepository extends JpaRepository<Compte, Long>{

}
