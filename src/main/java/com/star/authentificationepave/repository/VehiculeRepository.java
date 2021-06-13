package com.star.authentificationepave.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.star.authentificationepave.models.Vehicule;

@Repository("vehiculeRepository")

public interface VehiculeRepository extends JpaRepository<Vehicule, Long>{

}
