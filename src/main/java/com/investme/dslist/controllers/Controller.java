package com.investme.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.investme.dslist.dto.GameMinDto;
import com.investme.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class Controller {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDto> findAll(){
		List<GameMinDto> result = gameService.FindAll();
		return result;
	}
	

}
