package com.main.studentcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.entity.Student;
import com.main.service.StudentService;

@RestController
@RequestMapping("/api/details")
public class Controller {

	@Autowired
	StudentService studentService;
	
	@PostMapping("/add")
	public ResponseEntity<Student> addDetails(@RequestBody Student std) {
		Student response =studentService.createStudent(std);
		return ResponseEntity.ok(response);
		
	}
	
}
