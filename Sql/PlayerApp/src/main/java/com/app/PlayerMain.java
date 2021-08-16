package com.app;

import java.util.List;

import com.app.businessException.BusinessException;
import com.app.dao.PlayerDAO;
import com.app.dao.TeamDAO;
import com.app.dao.imp.PlayerDaoImp;
import com.app.dao.imp.TeamDaoImp;
import com.app.model.Team;

public class PlayerMain {

	public static void main(String[] args) {

		PlayerDAO playerDAO = new PlayerDaoImp();

// Insert Entry in Player Table 
//		try {
//			Player player = new Player(101,"Mohit Jindal","M","Bharatpur",22,"Cricket",9511500754L);	
//			if(playerDAO.createPlayer(player)==1) {
//				System.out.println("Player Entry Inserted and Details are below");
//				System.out.println(player);
//			}
//		} catch (BusinessException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//		}

		// Update Entry in Player Table

//		try {
//			if(playerDAO.updatePlayer(101, 8905052680L) == 1) {
//				System.out.println("Update Successfully");
//			}
//		} catch (BusinessException e) {
//			System.out.println(e);
//		}

		// Delete Entry in database
//			try {
//				if(playerDAO.deletePlayer(101)==1) {
//					System.out.println("Player Entry Delete Successfully By id");
//				}
//			} catch (BusinessException e1) {
//				System.out.println(e1);
//			}

		// Show entry in Database
//		try {
//			List<Player> playerList =playerDAO.getAllPlayer();
//			System.out.println("Successful");
//			for (Player player1 : playerList) {
//				System.out.println(player1);
//			}
//			
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}

		TeamDAO teamDao = new TeamDaoImp();
		// Insert Team
//		Team team = new Team("West Indies");
//		try {
//			Team getTeam = teamDao.createTeam(team);
//			System.out.println(getTeam);
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}

		// Get All Team
		try {
			List<Team> teamList = teamDao.getAllTeams();

			if (teamList != null & teamList.size() > 0) {
				System.out.println("Total team is " + teamList.size() + " and Details are Below -->");
				for (Team team : teamList) {
					System.out.println(team);
				}
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("*********************************************************************");
		// Get Team by Team Name
//		try {
//			List<Team> team = teamDao.getTeamByName("South Africa");
//			for (Team team2 : team) {
//				System.out.println(team);
//			}
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}

	}
}
