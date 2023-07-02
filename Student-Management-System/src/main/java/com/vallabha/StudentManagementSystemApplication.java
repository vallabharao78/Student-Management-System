package com.vallabha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vallabha.entities.Student;
import com.vallabha.repo.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner
{
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception 
	{
//		Student s1 = new Student("Vallabha","Anguru","---",7702445451l,"vallabharao@777.com",23,"Srikakulam");
//		Student s2 = new Student("Mahi","Anguru","---",123456789l,"dummy@email.com",20,"Srikakulam");
//		Student s3 = new Student("Chandhu","Happy","---",123456789l,"dummy@email.com.com",24,"Kadapa");
//		Student s4 = new Student("Sai","Bhayya","---",123456789l,"dummy@email.com.com",24,"Kadapa");
//		Student s5 = new Student("Pratap","Bro","---",123456789l,"dummy@email.com.com",23,"Kadapa");
//		Student s6 = new Student("Jayram","Dude","---",123456789l,"dummy@email.com.com",23,"Kadapa");
//		Student s7 = new Student("Hari","Bava","---",123456789l,"dummy@email.com.com",24,"Kadapa");
//		Student s8 = new Student("Vikas","Vallapu","---",123456789l,"dummy@email.com.com",24,"Ananthapur");
//	    List<Student> students = Arrays.asList(s1,s2,s3,s4,s5,s6,s7,s8);
//	    studentRepository.saveAll(students);
	}
}
