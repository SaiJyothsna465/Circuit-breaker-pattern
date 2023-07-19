package com.sai.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sai.springboot.entity.Instructor;
import com.sai.springboot.request.CreateInstructorRequest;
import com.sai.springboot.response.InstructorResponse;
import com.sai.springboot.service.InstructorService;

@RestController
@RequestMapping("/instructor")
public class InstructorController {
	@Autowired
	InstructorService instructorService;

	@PostMapping("/create")
	public InstructorResponse createInstructor(@RequestBody CreateInstructorRequest createInstructorRequest) {
		return instructorService.createInstructor(createInstructorRequest);
	}

	@GetMapping("/getById/{id}")
	public InstructorResponse getById(@PathVariable long id) {
		return instructorService.getById(id);
	}

	@GetMapping("/getAllInstructors")
	public List<Instructor> getAllInstructors() {
		return instructorService.getAllInstructors();
	}

}
