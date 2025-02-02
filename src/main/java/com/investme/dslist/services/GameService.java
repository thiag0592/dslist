package com.investme.dslist.services;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.investme.dslist.dto.GameDto;
import com.investme.dslist.dto.GameMinDto;
import com.investme.dslist.entities.Game;
import com.investme.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDto findById(Long gameId) {
		Game result = gameRepository.findById(gameId).get();
		GameDto dto = new GameDto(result);
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDto> findAll(){ 
		List<Game> result = gameRepository.findAll();
		List<GameMinDto> dto = result.stream().map(x -> new GameMinDto(x)).toList();
		return dto;
	}
	
}
