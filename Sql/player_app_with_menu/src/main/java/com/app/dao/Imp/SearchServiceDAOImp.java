package com.app.dao.Imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.app.businessException.BusinessException;
import com.app.dao.SearchServiceDAO;
import com.app.dao.dbutils.MyDbConnection;
import com.app.model.Player;
import com.app.model.Team;

public class SearchServiceDAOImp implements SearchServiceDAO {

	private static Logger log = Logger.getLogger(SearchServiceDAOImp.class);

	public List<Player> getPlayerList(String sql, String var, String message) throws BusinessException {
		List<Player> playerList = new ArrayList<>();

		try (Connection connection = MyDbConnection.getConnection()) {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, var);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				Player player = new Player();
				Team team = new Team();
				player.setId(resultSet.getInt("p.id"));
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setCity(resultSet.getString("city"));
				player.setGender(resultSet.getString("gender"));
				player.setSportsName(resultSet.getString("sportsName"));
				player.setContact(resultSet.getLong("contact"));
				team.setId(resultSet.getInt("teamId"));
				team.setTeamName(resultSet.getString("teamName"));
				player.setTeam(team);
				playerList.add(player);
			}
			if (playerList.size() == 0) {
				throw new BusinessException(message);
			}
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal Problem Occured Please Contact System Admin!");
		}
		return playerList;
	}

	public Player getPlayerById(int id) throws BusinessException {
		Player player = null;
		Team team = new Team();
		try (Connection connection = MyDbConnection.getConnection()) {
			String sql = "select p.id,name,gender,city,age,sportsName,contact,teamId,teamName from player p JOIN team t on p.teamid = t.id where p.id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				player = new Player();
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
				throw new BusinessException("Enter Player Id " + id + " is not exist in Our Database");
			}
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal Problem Occured Please Contact System Admin!");
		}
		return player;
	}

	public List<Player> getPlayerByAge(int age) throws BusinessException {
		List<Player> playerList = new ArrayList<>();
		Team team = new Team();
		try (Connection connection = MyDbConnection.getConnection()) {
			String sql = "select p.id,name,gender,city,age,sportsName,contact,teamId,teamName from player p JOIN team t on p.teamid = t.id where age=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, age);
			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				Player player = new Player();
				player.setId(resultSet.getInt("p.id"));
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setCity(resultSet.getString("city"));
				player.setGender(resultSet.getString("gender"));
				player.setSportsName(resultSet.getString("sportsName"));
				player.setContact(resultSet.getLong("contact"));
				team.setId(resultSet.getInt("teamId"));
				team.setTeamName(resultSet.getString("teamName"));
				player.setTeam(team);
				playerList.add(player);
			} else {
				throw new BusinessException("Enter Player Age " + age + " is not exist in Our Database");
			}
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal Problem Occured Please Contact System Admin!");
		}
		return playerList;
	}

	public Player getPlayerByContact(Long contact) throws BusinessException {
		Player player = null;
		Team team = new Team();
		try (Connection connection = MyDbConnection.getConnection()) {
			String sql = "select p.id,name,gender,city,age,sportsName,contact,teamId,teamName from player p JOIN team t on p.teamid = t.id where contact=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setLong(1, contact);
			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				player = new Player();
				player.setId(resultSet.getInt("p.id"));
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
				throw new BusinessException("Enter Contact no. " + contact + " is not exist in Our Database");
			}
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal Problem Occured Please Contact System Admin!");
		}
		return player;
	}

	public List<Player> getPlayerByName(String name) throws BusinessException {
		String sql = "select p.id,name,gender,city,age,sportsName,contact,teamId,teamName from player p JOIN team t on p.teamid =t.id where name = ? ";
		String message = "Player Name is not exist in Our Database";
		return getPlayerList(sql, name, message);
	}

	public List<Player> getPlayerByGender(String gender) throws BusinessException {
		String sql = "select p.id,name,gender,city,age,sportsName,contact,teamId,teamName from player p JOIN team t on p.teamid =t.id where gender = ? ";
		String message = "This Gender is not exist in Our Database";
		return getPlayerList(sql, gender, message);
	}

	public List<Player> getPlayerByCity(String city) throws BusinessException {
		String sql = "select p.id,name,gender,city,age,sportsName,contact,teamId,teamName from player p JOIN team t on p.teamid =t.id where city = ? ";
		String message = "City Name is not exist in Our Database";
		return getPlayerList(sql, city, message);
	}

	public List<Player> getPlayerBySportsName(String sportsName) throws BusinessException {
		String sql = "select p.id,name,gender,city,age,sportsName,contact,teamId,teamName from player p JOIN team t on p.teamid =t.id where sportsName = ? ";
		String message = "Sports Name is not exist in Our Database";
		return getPlayerList(sql, sportsName, message);

	}

	public List<Player> getPlayerByTeamName(String teamName) throws BusinessException {
		String sql = "select p.id,name,gender,city,age,sportsName,contact,teamId,teamName from player p JOIN team t on p.teamid =t.id where teamName = ? ";
		String message = "Team Name is not exist in Our Database";
		return getPlayerList(sql, teamName, message);
	}

}
