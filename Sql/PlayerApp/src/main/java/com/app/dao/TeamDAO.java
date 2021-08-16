package com.app.dao;

import java.util.List;

import com.app.businessException.BusinessException;
import com.app.model.Team;

public interface TeamDAO {
	
	public Team createTeam(Team team) throws BusinessException;
	
	public List<Team> getAllTeams() throws BusinessException;
	
	public List<Team> getTeamByName(String team) throws BusinessException;
	
	
}
