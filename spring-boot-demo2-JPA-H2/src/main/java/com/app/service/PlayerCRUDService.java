package com.app.service;

import com.app.model.Player;

public interface PlayerCRUDService {
	
	public Player addPlayer(Player player);
	public Player updatePlayer(Player player);
	public void deletePlayer(int id);
	public Player getPlayerById(int id);
	
}
