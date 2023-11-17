package com.TechVini.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TechVini.dslist.DTO.GameMinDTO;
import com.TechVini.dslist.entities.Game;
import com.TechVini.dslist.repositories.GameRepository;

@Service // @Service ou Component registra a classe como parte do sistema
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
}
