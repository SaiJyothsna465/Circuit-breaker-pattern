package com.sai.microservice.response;

import com.sai.microservice.entity.Course;

public class CourseResponse {
	private long courseId;
	private String title;
	private String duration;
	private InstructorResponse instructorResponse;
	
	public CourseResponse(Course course) {
		this.courseId=course.getId();
		this.title=course.getTitle();
		this.duration=course.getDuration();
	}

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public InstructorResponse getInstructorResponse() {
		return instructorResponse;
	}

	public void setInstructorResponse(InstructorResponse instructorResponse) {
		this.instructorResponse = instructorResponse;
	}

	

	
	
}
