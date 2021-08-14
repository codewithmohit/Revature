package com.app.dao;

import java.util.List;

import com.app.businessException.BusinessException;
import com.app.model.Player;
public interface PlayerDAO {
	
	public List<Player> getAllPlayer() throws BusinessException;
	public int createPlayer(Player player) throws BusinessException;
	public int updatePlayer(int id,long contact) throws BusinessException;
	public int deletePlayer(int id) throws BusinessException;
}
