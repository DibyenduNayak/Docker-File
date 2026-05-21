package com.main.service;

import java.util.List;
import java.util.Optional;

import com.main.entity.Student;

public interface StudentService {

	public Student createStudent(Student std) ;
	public List<Student>  getAllStudents();
	public  Optional<Student> getDetailsById(int id);
	public Student updateStudentDetails(int id, Student std);
	public void deleteStudentDetails(int id);
	
	
}
