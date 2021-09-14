package com.app.main;



import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.dao.PlayerDAO;
import com.app.model.Player;




public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc-beans.xml");
		
		PlayerDAO playerDAO = (PlayerDAO) context.getBean("playerDao");
		
//		playerDAO.addPlayer(new Player("Virat Kohli","Male",32));
//		System.out.println("add");
		
		List<Player> playerList =playerDAO.getAllPlayers();
		
		for (Player player : playerList) {
			System.out.println(player);
		}
		
		Player player = playerDAO.getPlayerById(4);
		System.out.println("Player Id 4 details is : " +player);
		
		List<Player> playerList1 = playerDAO.getPlayerByGender("Male");
		
		System.out.println("Gender Male Player are :");
		for (Player player2 : playerList1) {
			System.out.println(player2);
		}
	}

}
