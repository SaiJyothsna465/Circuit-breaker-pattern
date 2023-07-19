package com.sai.springboot.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sai.springboot.entity.Student;
import com.sai.springboot.request.CreateStudentRequest;
import com.sai.springboot.response.StudentResponse;
import com.sai.springboot.service.StudentService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;


@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService studentService;

	@PostMapping("/create")
	@CircuitBreaker(name="course",fallbackMethod="fallbackStatement")
	public String createStudent (@RequestBody CreateStudentRequest createStudentRequest) {
		studentService.createStudent(createStudentRequest);
		return "student created succesfully";
	}
	
	@GetMapping("/getById/{id}")
	public StudentResponse getById(@PathVariable long id) {
		return studentService.getById(id);
	}
	
	@GetMapping("/getAllStudents")
	public List<Student> getAllStudents(){
		return studentService.findAllStudents();
	}
	
	public String fallbackStatement(CreateStudentRequest createStudentRequest, RuntimeException runtimeException) {
		return "OOPS!! Something went wrong, Please try again later...";
		
	}
	
}


