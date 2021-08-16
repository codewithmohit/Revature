package com.app.search.service.Imp;

import java.util.List;

import com.app.businessException.BusinessException;
import com.app.dao.SearchServiceDAO;
import com.app.dao.Imp.SearchServiceDAOImp;
import com.app.model.Player;
import com.app.search.service.SearchService;

public class SearchServiceImp implements SearchService {

	SearchServiceDAO searchServiceDAO = new SearchServiceDAOImp();
	Player player = null;

	public Player getPlayerById(int id) throws BusinessException {
		if (id < 100 || id > 1000) {
			throw new BusinessException("Invalid Player Id : " + id);
		} else {
			player = searchServiceDAO.getPlayerById(id);
		}
		return player;
	}

	public Player getPlayerByContact(Long contact) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Player> getPlayerByName(String name) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Player> getPlayerByGender(String gender) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Player> getPlayerByCity(String city) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Player> getPlayerBySportsName(String sportsName) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Player> getPlayerByAge(int Age) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Player> getPlayerByTeamName(String teamName) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

}
