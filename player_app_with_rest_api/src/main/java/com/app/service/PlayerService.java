package com.app.service;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Player;

public interface PlayerService {
	
	public Player createPlayer(Player player) throws BusinessException;
	
	public Player updatePlayer(Player player) throws BusinessException;
	
	public Player getPlayerById(int id) throws BusinessException;
	
	public List<Player> getPlayerByTeamName(String teamName) throws BusinessException;
	
	public List<Player> getAllPlayer() throws BusinessException;
	
	public void deletePlayerById(int id) throws BusinessException;
	
	
	
}
