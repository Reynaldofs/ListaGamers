package com.reynaldo.DsListGamer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reynaldo.DsListGamer.entities.Game;

public interface GameRepository extends JpaRepository<Game,Long> {

	
	
}
