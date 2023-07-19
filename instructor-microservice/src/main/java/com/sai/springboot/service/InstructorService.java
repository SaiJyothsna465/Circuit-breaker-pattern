package com.sai.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sai.springboot.entity.Instructor;
import com.sai.springboot.repo.InstructorRepo;
import com.sai.springboot.request.CreateInstructorRequest;
import com.sai.springboot.response.InstructorResponse;

@Service
public class InstructorService {
	
	
	@Autowired
	InstructorRepo instructorRepo;

	public InstructorResponse createInstructor(CreateInstructorRequest createInstructorRequest) {
		
		Instructor instructor=new Instructor();
		instructor.setInstructorName(createInstructorRequest.getInstructorName());
		instructor.setExperience(createInstructorRequest.getExperience());
		instructor.setAvailability(createInstructorRequest.getAvailability());
		
		instructorRepo.save(instructor);
		return new InstructorResponse(instructor);
		
	}
	
	public InstructorResponse getById (long id) {
		
		//logger.info("Inside getById " + id);
		Instructor instructor=instructorRepo.findById(id).get();
		return new InstructorResponse(instructor);
	}
	
	public List<Instructor> getAllInstructors() {
		return instructorRepo.findAll();
	}
}
