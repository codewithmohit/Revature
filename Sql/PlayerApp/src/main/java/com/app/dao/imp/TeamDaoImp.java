package com.app.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.app.businessException.BusinessException;
import com.app.dao.TeamDAO;
import com.app.dao.dbutils.MyDbConnection;
import com.app.model.Team;

public class TeamDaoImp implements TeamDAO{

	@Override
	public Team createTeam(Team team) throws BusinessException {
		
		try(Connection connection = MyDbConnection.getConnection()){
			
			String sql = "insert into team(teamName) values(?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			preparedStatement.setString(1, team.getTeamName());
			 int c = preparedStatement.executeUpdate();
			 
			 if(c == 1) {
				 ResultSet resultset = preparedStatement.getGeneratedKeys();
				 if(resultset.next())
					 team.setId(resultset.getInt(1));
			 }
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal Error occured contact sysadmin");
		} 
		
		return team;
	}

	@Override
	public List<Team> getAllTeams() throws BusinessException {
		List<Team> teamList = new ArrayList<>();
		try(Connection connection = MyDbConnection.getConnection()){
			
			String sql = "select id,teamName from team";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Team team = new Team();
				team.setId(resultSet.getInt("id"));
				team.setTeamName(resultSet.getString("teamName"));
				teamList.add(team);
			}
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal Error occured contact sysadmin");
		} 
		return teamList;
	}

	@Override
	public List<Team> getTeamByName(String teamName) throws BusinessException {
		
		List<Team> teamList = new ArrayList<>();
		try(Connection connection = MyDbConnection.getConnection()){
			
			String sql = "select id from team where teamName = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, teamName);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Team team = new Team();
				team.setId(resultSet.getInt("id"));
				team.setTeamName(teamName);
				teamList.add(team);
			}
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal Error occured contact sysadmin");
		} 
		return teamList;
	}
	
	

}
