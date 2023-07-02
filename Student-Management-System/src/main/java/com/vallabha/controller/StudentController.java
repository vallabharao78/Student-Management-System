package com.vallabha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.vallabha.entities.Student;
import com.vallabha.service.StudentService;

@Controller
public class StudentController 
{
	// Field Injection
	@Autowired
	private StudentService studentService;
	
	/*
	 * // Constructor Injection
	 * public StudentController(StudentService studentService) 
	 * { 
	 * 		super(); 
	 * 		this.studentService = studentService;
	 *  }
	 */


	// This method is used to retrive the students list
	@GetMapping("/students")
	public String getStudents(Model model)
	{
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model)
	{
		// Creating student object to hold student form data.
		Student studentObj = new Student();
		model.addAttribute("student", studentObj);
		return "create_student";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student)
	{
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Integer id, Model model)
	{
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit_student";
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Integer id, @ModelAttribute("student") Student student, Model model)
	{
		// Get existing student from the database.
		Student existingStudent = studentService.getStudentById(id);
		existingStudent.setId(student.getId());
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setDepartment(student.getDepartment());
		existingStudent.setPhoneNumber(student.getPhoneNumber());
		existingStudent.setEmail(student.getEmail());
		existingStudent.setAge(student.getAge());
		existingStudent.setDistrict(student.getDistrict());
		
		// Now save updated student data
		studentService.updateStudent(existingStudent);
		return "redirect:/students";
	}
	
	// To delete the student record from the database.
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Integer id)
	{
		studentService.deleteStudentById(id);
		return "redirect:/students";
	}
	
	
}
