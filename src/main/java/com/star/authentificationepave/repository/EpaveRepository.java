package com.star.authentificationepave.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.star.authentificationepave.models.Epave;

@Repository("epaverepository")
public interface EpaveRepository  extends JpaRepository<Epave, Long>{

}
