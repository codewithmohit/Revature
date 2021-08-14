package com.app.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.businessException.BusinessException;
import com.app.dao.PlayerDAO;
import com.app.dao.dbutils.MyDbConnection;
import com.app.model.Player;

public class PlayerDaoImp implements PlayerDAO{

	@Override
	public List<Player> getAllPlayer() throws BusinessException{
		
		List<Player> allPlayerList = new ArrayList<>();
		try(Connection connection = MyDbConnection.getConnection()){
			//Prepared Statement
			String sql = "select id,name,age,gender,city,sportsName,contact from player order by name";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			//Execute Query
			ResultSet resultSet = preparedStatement.executeQuery();			
			//Process Details
			while(resultSet.next()) {
				Player player = new Player();
				player.setId(resultSet.getInt("id"));
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setCity(resultSet.getString("city"));
				player.setContact(resultSet.getLong("contact"));
				player.setGender(resultSet.getString("gender"));
				player.setSportsName(resultSet.getString("sportsName"));
				allPlayerList.add(player);				
			}
			
		}catch(SQLException | ClassNotFoundException e) {
			throw new BusinessException("Internal Problem occured.");
		}
		return allPlayerList;
	}

	@Override
	public int createPlayer(Player player) throws BusinessException {
		int c = 0;
		try(Connection connection = MyDbConnection.getConnection()){
			String sql="insert into player(id,name,age,gender,city,sportsName,contact) values(?,?,?,?,?,?,?)";
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, player.getId());
			preparedStatement.setString(2, player.getName());
			preparedStatement.setInt(3, player.getAge());
			preparedStatement.setString(4, player.getGender());
			preparedStatement.setString(5, player.getCity());
			preparedStatement.setString(6, player.getSportsName());
			preparedStatement.setLong(7, player.getContact());
			
			c = preparedStatement.executeUpdate();
			
		}catch(SQLException | ClassNotFoundException e) {
			System.out.println(e);
			throw new BusinessException("Internal Problem occured.");
		}
		return c;
	}

	@Override
	public int updatePlayer(int id, long contact) throws BusinessException {
		int c = 0; 
		try(Connection connection = MyDbConnection.getConnection()){
			String sql = "update player set contact = ? where id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setLong(1, contact);
			preparedStatement.setInt(2, id);
			
			c = preparedStatement.executeUpdate();
			
		}catch(SQLException | ClassNotFoundException e) {
			System.out.println(e);
			throw new BusinessException("Internal Problem occured.");
		}
		return c;
	}

	@Override
	public int deletePlayer(int id) throws BusinessException {
		
		int c =0;
		try(Connection connection = MyDbConnection.getConnection()){
			
			String sql = "delete from player where id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, id);
			c = preparedStatement.executeUpdate();
			
		}catch(SQLException | ClassNotFoundException e) {
			System.out.println(e);
			throw new BusinessException("Internal Problem occured.");
		}
		
		return c;
	}
	
	
}
