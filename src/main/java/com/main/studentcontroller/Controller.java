package com.main.studentcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	//add all details of students
	
	@PostMapping("/add")
	public ResponseEntity<Student> addDetails(@RequestBody Student std) {
		Student response =studentService.createStudent(std);
		return ResponseEntity.ok(response);
		
	}
	
	//find list of all the student details
	@GetMapping("/getDetails")
	public List<Student> getAllDetails() {
		
		List<Student> student= studentService.getAllStudents();;
		return student ;
		
	}
	
	// find student details by id
	@GetMapping("/user/{id}")
	public ResponseEntity<Student> getDetailsById(@PathVariable int id) {
		Student sts= studentService.getDetailsById(id).orElse(null) ;
		
		if (sts !=null) {
			return ResponseEntity.ok().body(sts);
		}else {
			return ResponseEntity.notFound().build();
		}
		
	}
	
	//update student by id
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Student > updateStudent(@PathVariable int id, @RequestBody Student std){
	Student updatedStudent=	studentService.updateStudentDetails(id, std);
		if (updatedStudent!=null) {
			return ResponseEntity.ok(updatedStudent);
		}else {
			return ResponseEntity.notFound().build();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
