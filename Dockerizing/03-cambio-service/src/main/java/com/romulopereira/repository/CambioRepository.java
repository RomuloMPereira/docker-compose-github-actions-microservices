package com.romulopereira.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.romulopereira.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long>{
	
	Cambio findByFromAndTo(String from, String to);
}
