package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table
@Entity
public class Player {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String teamName;
	
	@Column(columnDefinition = "CLOB")
	private String avatar;
	

}
