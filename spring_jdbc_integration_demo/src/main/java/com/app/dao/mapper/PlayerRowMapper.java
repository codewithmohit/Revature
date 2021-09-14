package com.app.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.app.model.Player;

public class PlayerRowMapper implements RowMapper<Player>{

	@Override
	public Player mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Player player = new Player();
		player.setId(rs.getInt("id"));
		player.setAge(rs.getInt("age"));
		player.setGender(rs.getString("gender"));
		player.setName(rs.getString("playerName"));
		return player;
	}
	
	

}
