package com.investme.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.investme.dslist.dto.GameListDto;
import com.investme.dslist.entities.GameList;
import com.investme.dslist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDto> findAll(){
		List<GameList> result = gameListRepository.findAll();
		List<GameListDto> dto = result.stream().map(x -> new GameListDto(x)).toList();
		return dto;
	}
	
	
	
}
