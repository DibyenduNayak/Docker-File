package com.main.studentrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	
	

}
