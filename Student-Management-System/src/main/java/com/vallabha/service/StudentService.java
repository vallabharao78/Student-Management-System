package com.vallabha.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vallabha.entities.Student;

public interface StudentService {
	
	 List<Student> getAllStudents();
	 
	 Student saveStudent(Student student);
	 
	 Student getStudentById(Integer id);
	 
	 Student updateStudent(Student student);
	 
	 void deleteStudentById(Integer id);

}
