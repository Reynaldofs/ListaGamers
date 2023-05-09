package com.reynaldo.DsListGamer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reynaldo.DsListGamer.dto.GameMinDTO;
import com.reynaldo.DsListGamer.entities.Game;
import com.reynaldo.DsListGamer.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> finDall(){
	List<Game> result = gameRepository.findAll();
	List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
	 return dto;
	}
	
}
