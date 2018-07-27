package com.cg.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class ScheduledSessions {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
int id;
String name;
int duration;
String faculty;
String mode1;
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
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
public String getFaculty() {
	return faculty;
}
public void setFaculty(String faculty) {
	this.faculty = faculty;
}
public String getMode1() {
	return mode1;
}
public void setMode1(String mode1) {
	this.mode1 = mode1;
}




}
