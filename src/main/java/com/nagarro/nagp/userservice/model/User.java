package com.nagarro.nagp.userservice.model;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "user")
@EntityListeners(AuditingEntityListener.class)
public class User {

	@Id
	private Long id;
	private String email;
	private String name;
	private int age;	
	
	public User() {
	}
		
	public User(String email, String name, int age) {
		this.email = email;
		this.name = name;
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
}
