package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.repository.Repository;
import com.example.demo.student.MyBook;
import com.example.demo.student.Student;

@Component
public class BookService {

	@Autowired
	Repository repository;

	public void save(Student student) {
		repository.save(student);

	}

	public List<Student> getallList() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	

	public Student getBookById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	public Student deleteByid(int id) {
		// TODO Auto-generated method stub
		
return 	repository.deleteById(id);
 
	}

	public void saveMyBooks(Student student1) {
		// TODO Auto-generated method stub
		repository.save(student1);
	}

	

/*	public Student getBokById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}*/
}
