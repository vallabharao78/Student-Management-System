package com.vallabha.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vallabha.entities.Student;
import com.vallabha.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudents() {
		List<Student> students = studentRepository.findAll();
		return students;
	}

	@Override
	public Student saveStudent(Student student) {
		studentRepository.save(student);
		return null;
	}

	@SuppressWarnings("deprecation")
	@Override
	public Student getStudentById(Integer id) {
		Optional<Student> student = studentRepository.findById(id);
		return student.get();
	}

	@Override
	public Student updateStudent(Student student1) {
		Student student = studentRepository.save(student1);
		return student;
	}

	@Override
	public void deleteStudentById(Integer id) {
		studentRepository.deleteById(id);
	}

}
