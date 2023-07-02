package com.vallabha.repo;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.vallabha.entities.Student;

public interface StudentRepository extends JpaRepository<Student,Serializable> {

}
