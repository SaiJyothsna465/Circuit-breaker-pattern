package com.sai.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sai.springboot.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}