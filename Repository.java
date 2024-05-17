package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.student.Student;
import java.util.List;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Student, Integer>{
 public Student getBookById(int id);
 public Student  deleteById(int id);
}
