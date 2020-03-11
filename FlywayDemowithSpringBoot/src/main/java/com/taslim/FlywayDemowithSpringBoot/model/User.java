package com.taslim.FlywayDemowithSpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "REGISTER_STUDENT")
public class User {

	@Id
	@GeneratedValue
	private int id;
	private String username;
	private String first_name;
	private String last_name;
	private String email;
	private String mobile;
}
