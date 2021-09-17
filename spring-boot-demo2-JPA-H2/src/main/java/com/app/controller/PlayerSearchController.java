package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Player;
import com.app.service.PlayerSearchService;

@RestController
public class PlayerSearchController{
	
	@Autowired
	private PlayerSearchService service;
	
	@GetMapping("/players")
	public List<Player> getAllPlayer() {
		// TODO Auto-generated method stub
		return service.getAllPlayer();
	}

	@GetMapping("/players/name/{name}")
	public List<Player> getPlayerByName(@PathVariable String name) {
		// TODO Auto-generated method stub
		return service.getPlayerByName(name);
	}

	@GetMapping("/players/teamName/{teamName}")
	public List<Player> getPlayerByTeamName(@PathVariable String teamName) {
		// TODO Auto-generated method stub
		return service.getPlayerByTeamName(teamName);
	}


}
