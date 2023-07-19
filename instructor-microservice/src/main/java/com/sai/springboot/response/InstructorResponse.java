package com.sai.springboot.response;

import com.sai.springboot.entity.Instructor;

public class InstructorResponse {
	
	private long instructorId;
	private String instructorName;
	private String experience;
	private String availability;
	
	
	public InstructorResponse(Instructor instructor) {
		this.instructorId=instructor.getInstructorId();
		this.instructorName=instructor.getInstructorName();
		this.experience=instructor.getExperience();
		this.availability=instructor.getAvailability();
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
