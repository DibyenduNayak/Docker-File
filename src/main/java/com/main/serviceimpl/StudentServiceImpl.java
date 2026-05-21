package com.main.serviceimpl;

import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.Student;
import com.main.service.StudentService;
import com.main.studentrepository.StudentRepo;

@Service
public class StudentServiceImpl  implements StudentService{

	@Autowired
  private StudentRepo studentRepo;
	
	@Override
	public Student createStudent(Student std) {
		return studentRepo.save(std);
	}

	@Override
	public List<Student> getAllStudents() {
		return 	studentRepo.findAll();

	}

	@Override
	public Optional<Student> getDetailsById(int id) {
		
		return studentRepo.findById(id); 
		
	}

	@Override
	public Student updateStudentDetails(int id, Student newStudent) {
		
		Student studentData=studentRepo.findById(id).orElse(null);
		if (studentData !=null) {
			return studentRepo.save(newStudent);
		}
		else {
			  throw new RuntimeException("user Not found");

		}
		
	}

	@Override
	public void deleteStudentDetails(int id) {
		studentRepo.deleteById(id);
		
	}



	
	

	
	
	
	
}
