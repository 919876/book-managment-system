package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.student.MyBook;
@Repository
public interface mybok extends JpaRepository<MyBook, Integer> {

	MyBook deleteById(int id);

}
