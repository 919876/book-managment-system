package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.repository.mybok;
import com.example.demo.student.MyBook;

@Component
public class MyService {
	@Autowired
	mybok mybok;
	
	public void saveMyBooks(MyBook myBook) {
		mybok.save(myBook);
		
	}
	



	public List<MyBook> getallList() {
		// TODO Auto-generated method stub
		return mybok.findAll();
	}




	public List<MyBook> getallBooks() {
		// TODO Auto-generated method stub
		return  mybok.findAll();
	}

	public MyBook deleteByid(int id) {	
	  return mybok.deleteById(id);
	}
	
}
