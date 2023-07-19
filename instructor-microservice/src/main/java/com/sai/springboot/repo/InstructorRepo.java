package com.sai.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sai.springboot.entity.Instructor;

@Repository
public interface InstructorRepo extends JpaRepository<Instructor, Long>{

}
