package com.example.demo.student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class MyBook {
	@Id
	private int id;	
	private String name;
	private String address;
	private String bookName;
	private String author;
	private String price;
	public MyBook(int id, String name, String address, String bookName, String author, String price) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", bookName=" + bookName + ", author="
				+ author + ", price=" + price + "]";
	}
	public MyBook() {
		super();
		// TODO Auto-generated constructor stub
	}


}
