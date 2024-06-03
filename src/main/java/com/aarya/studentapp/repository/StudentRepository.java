package com.aarya.studentapp.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.aarya.studentapp.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,String>{
	
	List<Student> findAll();
	

}
