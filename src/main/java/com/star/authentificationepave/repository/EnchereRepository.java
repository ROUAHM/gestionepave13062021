package com.star.authentificationepave.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.star.authentificationepave.models.Enchere;

@Repository("enchereRepository")
public interface EnchereRepository extends JpaRepository<Enchere, Long>{

}
