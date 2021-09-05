package com.app.dao;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Player;

public interface PlayerDAO {
	
	public Player createPlayer(Player player) throws BusinessException;
	public Player updatePlayer(Player player) throws BusinessException;
	public Player getPlayerById(int id) throws BusinessException;
	public void deletePlayerById(int id) throws BusinessException;
	public List<Player> getAllPlayers() throws BusinessException;
	public List<Player> getAllPlayersByTeamName(String teamName) throws BusinessException;

}
