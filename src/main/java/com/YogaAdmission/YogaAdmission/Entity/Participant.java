package com.YogaAdmission.YogaAdmission.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Participant.java (Entity)
@Entity
@Table(name = "participants")
public class Participant {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String name;

 private int age;

 private String batch;

 @Column(name = "created_at")
 private LocalDateTime createdAt;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getBatch() {
	return batch;
}

public void setBatch(String batch) {
	this.batch = batch;
}

public Participant(Long id, String name, int age, String batch, LocalDateTime createdAt) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.batch = batch;
	this.createdAt = createdAt;
}
public void Particioant() {
 // Getters and Setters
}

public void setCreatedAt(LocalDateTime now) {
	// TODO Auto-generated method stub
	
}
}
