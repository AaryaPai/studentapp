package com.aarya.studentapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aarya.studentapp.domain.Student;
import com.aarya.studentapp.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired 
	StudentRepository studentRepository;
	
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

}
