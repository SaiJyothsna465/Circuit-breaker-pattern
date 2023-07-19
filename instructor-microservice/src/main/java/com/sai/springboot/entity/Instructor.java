package com.sai.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="instructor_table")
public class Instructor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long instructorId;
	private String instructorName;
	private String experience;
	private String availability;
	
	public Instructor() {
		
	}
	
	public Instructor(long instructorId, String instructorName, String experience, String availability) {
		super();
		this.instructorId = instructorId;
		this.instructorName = instructorName;
		this.experience = experience;
		this.availability = availability;
	}
	
	public long getInstructorId() {
		return instructorId;
	}
	public void setInstructorId(long instructorId) {
		this.instructorId = instructorId;
	}
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	
	
}
