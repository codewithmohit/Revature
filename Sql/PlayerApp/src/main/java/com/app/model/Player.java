package com.app.model;

public class Player {
		
	private int id;
	private String name;
	private String gender;
	private String city;
	private int age;
	private String sportsName;
	private long contact;
	private int teamId;
	
	public Player() {
		super();
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getSportsName() {
		return sportsName;
	}

	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}
	
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public Player(int id, String name, String gender, String city, int age, String sportsName, long contact,
			int teamId) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.city = city;
		this.age = age;
		this.sportsName = sportsName;
		this.contact = contact;
		this.teamId = teamId;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", gender=" + gender + ", city=" + city + ", age=" + age
				+ ", sportsName=" + sportsName + ", contact=" + contact + ", teamId=" + teamId + "]";
	}
	
	
	
	
	
		
}
