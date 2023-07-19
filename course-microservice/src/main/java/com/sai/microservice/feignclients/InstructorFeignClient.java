package com.sai.microservice.feignclients;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sai.microservice.response.InstructorResponse;

@FeignClient(value = "instructor-microservice", path = "/instructor")
public interface InstructorFeignClient {
	
	@GetMapping("/getById/{id}")
	public InstructorResponse getById(@PathVariable long id);
	
}
