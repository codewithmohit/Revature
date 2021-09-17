package com.app.service;

import java.util.List;

import com.app.model.Player;

public interface PlayerSearchService {
	
	public List<Player> getAllPlayer();
	public List<Player> getPlayerByName(String name);
	public List<Player> getPlayerByTeamName(String teamName);

}
