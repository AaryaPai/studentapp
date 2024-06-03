package com.aarya.studentapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aarya.studentapp.domain.Student;
import com.aarya.studentapp.service.StudentService;

@RestController
@RequestMapping("/v1/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/ping")
	@ResponseBody
	public String getPing() {
		
		return "hello";
		
	}

	@GetMapping("/")
	@ResponseBody
	public List<Student> getAllStudents() {
		
		//return "return all student list";
		return studentService.getAllStudents();
		
		
	}
}
