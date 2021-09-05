package com.app.serviceImpl;

import java.util.List;

import com.app.dao.PlayerDAO;
import com.app.daoImpl.PlayerDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.service.PlayerService;

public class PlayerServiceImpl implements PlayerService {

	PlayerDAO playerDAO = new PlayerDAOImpl();

	public Player createPlayer(Player player) throws BusinessException {
		Player addPlayer = null;
		if (player != null) {
			addPlayer = playerDAO.createPlayer(player);
		}else {
			throw new BusinessException("Please Enter Valid Player Details!!");
		}
		return addPlayer;
	}

	public Player updatePlayer(Player player) throws BusinessException {
		Player updatePlayer = null;
		if (player != null) {
			updatePlayer = playerDAO.updatePlayer(player);
		}else {
			throw new BusinessException("Please Enter Valid Player Details!!");
		}

		return updatePlayer;
	}

	public Player getPlayerById(int id) throws BusinessException {
		Player getPlayer = null;
		if (id > 0) {
			getPlayer = playerDAO.getPlayerById(id);
		}else {
			throw new BusinessException("Please Enter Valid Player Id!!");
		}
		return getPlayer;
	}

	public List<Player> getPlayerByTeamName(String teamName) throws BusinessException {
		List<Player> playerList = null;

		if (teamName != null) {
			playerList = playerDAO.getAllPlayersByTeamName(teamName);
		}else {
			throw new BusinessException("Please Enter Valid Team Name");
		}
		return playerList;
	}

	public List<Player> getAllPlayer() throws BusinessException {
		List<Player> playerList = playerDAO.getAllPlayers();
		return playerList;
	}

	public void deletePlayerById(int id) throws BusinessException {
		if (id > 0) {
			playerDAO.deletePlayerById(id);
		}else {
			throw new BusinessException("Please Enter Valid Player Id!!");
		}
	}

}
