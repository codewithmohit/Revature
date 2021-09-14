package com.app.dao;

import java.util.List;

import com.app.model.Player;

public interface PlayerDAO {
	
	Player addPlayer(Player player);
	Player updatePlayer(Player player);
	Player getPlayerById(int id);
	void deletePlayer(int id);
	List<Player> getAllPlayers();
	List<Player> getPlayerByName(String name);
	List<Player> getPlayerByGender(String gender);
	

}
