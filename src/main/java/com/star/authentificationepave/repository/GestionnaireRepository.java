package com.star.authentificationepave.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.star.authentificationepave.models.Gestionnaire;

@Repository

public interface GestionnaireRepository extends JpaRepository<Gestionnaire, Long> {
	Optional<Gestionnaire> findByUsername(String username);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);
}

