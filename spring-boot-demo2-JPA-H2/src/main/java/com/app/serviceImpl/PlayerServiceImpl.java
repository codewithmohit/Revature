package com.app.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Player;
import com.app.repository.PlayerRepository;
import com.app.service.PlayerCRUDService;

@Service
public class PlayerServiceImpl implements PlayerCRUDService{
	
	@Autowired
	private PlayerRepository repository;
	
	@Override
	public Player addPlayer(Player player) {
		return repository.save(player);
	}

	@Override
	public Player updatePlayer(Player player) {
		return repository.save(player);
	}

	@Override
	public void deletePlayer(int id) {
		repository.deleteById(id);
		
	}

	@Override
	public Player getPlayerById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}
	
	

}
