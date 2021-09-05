package com.app.daoImpl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.app.exception.BusinessException;

import com.app.dao.PlayerDAO;
import com.app.dao.dbutils.MyDbConnection;
import com.app.model.Player;

public class PlayerDAOImpl implements PlayerDAO{

	public Player createPlayer(Player player) throws BusinessException {
		Player addPlayer = null;
		try(Connection connection = MyDbConnection.getConnection()){
			String sql = "insert into player(playerName,age,teamName) values(?,?,?)";
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
	
			preparedStatement.setString(1, player.getPlayerName());
			preparedStatement.setInt(2, player.getAge());
			preparedStatement.setString(3, player.getTeamName());
			
			int c=preparedStatement.executeUpdate();
			
			if(c==1) {
				ResultSet resultSet=preparedStatement.getGeneratedKeys();
				if(resultSet.next()) {
					addPlayer = new Player();
					addPlayer.setId(resultSet.getInt(1));
					addPlayer.setPlayerName(resultSet.getString("playerName"));
					addPlayer.setAge(resultSet.getInt("age"));
					addPlayer.setTeamName(resultSet.getString("teamName"));
				}
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			throw new com.app.exception.BusinessException("Internal Problem Occured Please Contact System Admin!");
		}
		return addPlayer;
	}

	public Player updatePlayer(Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	public Player getPlayerById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deletePlayerById(int id) {
		// TODO Auto-generated method stub
		
	}

	public List<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Player> getAllPlayersByTeamName(String teamName) {
		// TODO Auto-generated method stub
		return null;
	}

}
