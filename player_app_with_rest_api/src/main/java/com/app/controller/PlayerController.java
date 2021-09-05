package com.app.controller;


import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.service.PlayerService;
import com.app.serviceImpl.PlayerServiceImpl;

@Path("/player")
public class PlayerController {
	
	private PlayerService service=new PlayerServiceImpl();
	@POST
	@Consumes(MediaType.APPLICATION_JSON) //converts JSON to POJO
	@Produces(MediaType.APPLICATION_JSON) //converts POJO to JSON
	public Player createPlayer(Player player) {
		
		Player addPlayer = null;
		try {
			addPlayer =  service.createPlayer(player);
		} catch (BusinessException e) {
			System.out.println(e);
		}
		return addPlayer;
	}
}
