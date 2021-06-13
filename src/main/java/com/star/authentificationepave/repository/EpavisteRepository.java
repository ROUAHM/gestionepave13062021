package com.star.authentificationepave.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.star.authentificationepave.models.Epaviste;

@Repository
public interface EpavisteRepository extends JpaRepository<Epaviste, Long> {
	Optional<Epaviste> findByUsername(String username);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);
}

