package com.app.search.service.Imp;

import java.util.List;

import com.app.businessException.BusinessException;
import com.app.dao.SearchServiceDAO;
import com.app.dao.Imp.SearchServiceDAOImp;
import com.app.model.Player;
import com.app.search.service.SearchService;

public class SearchServiceImp implements SearchService {

	SearchServiceDAO searchServiceDAO = new SearchServiceDAOImp();

	public Player getPlayerById(int id) throws BusinessException {
		Player player = null;
		if (id < 100 || id > 1000) {
			throw new BusinessException("Invalid Player Id : " + id);
		} else {
			player = searchServiceDAO.getPlayerById(id);
		}
		return player;
	}

	public Player getPlayerByContact(Long contact) throws BusinessException {
		Player playerList = null;
		String strContact = Long.toString(contact);
		if (!strContact.matches("[0-9]{10}")) {
			throw new BusinessException("Please Enter Valid Contact no.");
		} else {

			playerList = searchServiceDAO.getPlayerByContact(contact);
		}
		return playerList;
	}

	public List<Player> getPlayerByName(String name) throws BusinessException {
		List<Player> playerList = null;
		if (!name.matches("[a-z A-Z]{3,}")) {
			throw new BusinessException("Please Enter Valid Player name");
		} else {
			playerList = searchServiceDAO.getPlayerByName(name);
		}
		return playerList;

	}

	public List<Player> getPlayerByGender(String gender) throws BusinessException {
		List<Player> playerList = null;
		if (gender.length() < 0 || gender.length() > 1) {
			throw new BusinessException("Please Enter Valid Gender");
		} else {
			playerList = searchServiceDAO.getPlayerByGender(gender);
		}
		return playerList;
	}

	public List<Player> getPlayerByCity(String city) throws BusinessException {
		List<Player> playerList = null;
		if (!city.matches("[a-z A-Z]{3,}")) {
			throw new BusinessException("Please Enter Valid City name");
		} else {
			playerList = searchServiceDAO.getPlayerByCity(city);
		}
		return playerList;
	}

	public List<Player> getPlayerBySportsName(String sportsName) throws BusinessException {
		List<Player> playerList = null;
		if (!sportsName.matches("[a-z A-Z]{3,}")) {
			throw new BusinessException("Please Enter Valid Sports name");
		} else {
			playerList = searchServiceDAO.getPlayerBySportsName(sportsName);
		}
		return playerList;

	}

	public List<Player> getPlayerByAge(int age) throws BusinessException {
		List<Player> playerList = null;
		if (age < 0 || age > 150) {
			throw new BusinessException("Please Enter Valid Age");
		} else {
			playerList = searchServiceDAO.getPlayerByAge(age);
		}
		return playerList;
	}

	public List<Player> getPlayerByTeamName(String teamName) throws BusinessException {
		List<Player> playerList = null;
		if (!teamName.matches("[a-z A-Z]{3,}")) {
			throw new BusinessException("Please Enter Valid Team name");
		} else {
			playerList = searchServiceDAO.getPlayerByTeamName(teamName);
		}
		return playerList;
	}

}
