package com.main.serviceimpl;

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

}
