package com.sai.springboot.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sai.springboot.entity.Student;
import com.sai.springboot.feignclients.CourseFeignClient;
import com.sai.springboot.repo.StudentRepository;
import com.sai.springboot.request.CreateStudentRequest;
import com.sai.springboot.response.StudentResponse;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	CourseFeignClient courseFeignClient;

	public String createStudent(CreateStudentRequest createStudentRequest) {

		Student student = new Student();
		student.setFirstName(createStudentRequest.getFirstName());
		student.setLastName(createStudentRequest.getLastName());
		student.setEmail(createStudentRequest.getEmail());
		
		student.setCourseId(createStudentRequest.getCourseId());
		student = studentRepository.save(student);
		StudentResponse studentResponse=new StudentResponse(student);
		studentResponse.setCourseResponse(courseFeignClient.getById(student.getCourseId()));
		return "student created successfully";
	}
	
	public StudentResponse getById (long id) {
		Student student=studentRepository.findById(id).get();
		StudentResponse studentResponse=new StudentResponse(student);
		studentResponse.setCourseResponse(courseFeignClient.getById(student.getCourseId()));
		return studentResponse;
		
	}
	
	public List<Student> findAllStudents(){
		List<Student> students=studentRepository.findAll();
		return students;
	}
	
	

}
