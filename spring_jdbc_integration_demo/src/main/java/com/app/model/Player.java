package com.app.model;

public class Player {

	private int id;
	private String name;
	private String gender;
	private int age;

	public Player() {
		super();
	}

	public Player(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

	

}
