package com.app.model;

public class Player {
	
	private int id;
	private String playerName;
	private int age;
	private String teamName;
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", playerName=" + playerName + ", age=" + age + ", teamName=" + teamName + "]";
	}
	
	
	
}
