package com.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Player;
import com.app.repository.PlayerRepository;
import com.app.service.PlayerSearchService;

@Service
public class PlayerSearchServiceImpl implements PlayerSearchService{
	
	@Autowired
	private PlayerRepository repository;
	
	@Override
	public List<Player> getAllPlayer() {
		return repository.findAll();
	}

	@Override
	public List<Player> getPlayerByName(String name) {
		return repository.findByName(name);
	}

	@Override
	public List<Player> getPlayerByTeamName(String teamName) {
		return repository.findByTeamName(teamName);
	}

}
