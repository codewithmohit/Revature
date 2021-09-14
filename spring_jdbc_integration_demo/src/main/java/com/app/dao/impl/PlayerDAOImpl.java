package com.app.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.app.dao.PlayerDAO;
import com.app.dao.mapper.PlayerRowMapper;
import com.app.model.Player;

public class PlayerDAOImpl implements PlayerDAO {

	private JdbcTemplate template;
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.template = new JdbcTemplate(dataSource);
	}

	@Override
	public Player addPlayer(Player player) {
		String sql = "insert into player(age,gender,playerName) values(?,?,?)";
		template.update(sql, player.getAge(), player.getGender(), player.getName());
		return player;
	}

	@Override
	public Player updatePlayer(Player player) {
		String sql = "update player set age=?,gender=?,playerName=?";
		template.update(sql, player.getAge(), player.getGender(), player.getName());
		return player;
	}

	@Override
	public Player getPlayerById(int id) {
		String sql = "select id,age,gender,playerName from player where id=?";
		Player player = template.queryForObject(sql, new Object[] { id }, new PlayerRowMapper());
		return player;
	}

	@Override
	public void deletePlayer(int id) {
		String sql = "delete from player where id = ?";
		template.update(sql, id);
	}

	@Override
	public List<Player> getAllPlayers() {
		String sql = "select id,age,gender,playerName from player";
		List<Player> playerList = template.query(sql, new PlayerRowMapper());
		return playerList;
	}

	@Override
	public List<Player> getPlayerByName(String name) {
		String sql = "select id,age,gender,playerName from player where playerName=?";
		List<Player> playerList = template.query(sql, new Object[] { name }, new PlayerRowMapper());
		return playerList;
	}

	@Override
	public List<Player> getPlayerByGender(String gender) {
		String sql = "select id,age,gender,playerName from player where gender=?";
		List<Player> playerList = template.query(sql, new Object[] { gender }, new PlayerRowMapper());
		return playerList;
	}

}
