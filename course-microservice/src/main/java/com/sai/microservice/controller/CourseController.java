package com.sai.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sai.microservice.entity.Course;
import com.sai.microservice.request.CreateCourseRequest;
import com.sai.microservice.response.CourseResponse;
import com.sai.microservice.service.CourseService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/course")
public class CourseController {
	@Autowired
	CourseService courseService;

	@PostMapping("/create")
	@CircuitBreaker(name="instructor",fallbackMethod="printFallback")
	public String createCourse (@RequestBody CreateCourseRequest createCourseRequest) {
		courseService.createCourse(createCourseRequest);
		return "Course created successfully";
	}
	
	@GetMapping("/getById/{id}")
	public CourseResponse getById(@PathVariable long id) {
		return courseService.getById(id);
	}
	
	@GetMapping("/getAllCourses")
	public List<Course> findAllCourses(){
		return courseService.findAllCourses();
	}
	
	
	public String printFallback(CreateCourseRequest createCourseRequest, RuntimeException runtimeException) {
		return "OOPS!! Something went wrong, Please try after sometime";
	}
	
}

