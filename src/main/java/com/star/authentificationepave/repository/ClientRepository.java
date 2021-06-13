package com.star.authentificationepave.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.star.authentificationepave.models.Client;

@Repository("clientrepository")
public interface ClientRepository extends JpaRepository<Client, Long>{
	Optional<Client> findByUsername(String username);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);
}
