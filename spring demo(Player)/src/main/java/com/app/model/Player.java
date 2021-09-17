package com.app.model;

import java.util.List;

public class Player {

	private int id;
	private String name;
	private Team team;
	private List<Address> address;

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(int id, String name, Team team, List<Address> address) {
		super();
		this.id = id;
		this.name = name;
		this.team = team;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", team=" + team + ", address=" + address + "]";
	}

}
