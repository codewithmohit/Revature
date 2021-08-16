package com.app.dao.Imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import com.app.businessException.BusinessException;
import com.app.dao.SearchServiceDAO;
import com.app.dao.dbutils.MyDbConnection;
import com.app.model.Player;
import com.app.model.Team;

public class SearchServiceDAOImp implements SearchServiceDAO {

	Player player = null;
	Team team = new Team();

	private static Logger log = Logger.getLogger(SearchServiceDAOImp.class);

	public Player getPlayerById(int id) throws BusinessException {

		try (Connection connection = MyDbConnection.getConnection()) {

			String sql = "select p.id,name,gender,city,age,sportsName,contact,teamName from player p JOIN team t on p.teamId = t.id where p.id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				player.setId(id);
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setCity(resultSet.getString("city"));
				player.setGender(resultSet.getString("gender"));
				player.setSportsName(resultSet.getString("sportsName"));
				player.setContact(resultSet.getLong("contact"));
				team.setId(resultSet.getInt("teamId"));
				team.setTeamName(resultSet.getString("teamName"));
				player.setTeam(team);
			} else {
				throw new BusinessException("Enter Player Id " + id + " is not exist in Database");
			}
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal Problem Occured Please Contact System Admin!");
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
