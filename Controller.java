package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.repository.Repository;
import com.example.demo.repository.mybok;
import com.example.demo.service.BookService;
import com.example.demo.service.MyService;
import com.example.demo.student.MyBook;
import com.example.demo.student.Student;


@org.springframework.stereotype.Controller
public class Controller {
	
@Autowired
  BookService bookService;

@Autowired
MyService myService;

	
	@GetMapping("/home")
  public String home() {
	  return "home";
  }
	
	
	
@GetMapping("/register")
public String register() {
	return "register";
}
// retriving the data from database
@RequestMapping("/Available")
public ModelAndView Available() {
List<Student> students  = bookService.getallList();
ModelAndView m=  new ModelAndView();
	m.setViewName("Available");
	m.addObject("book",students);
	return m;
}

// saving the data into database
@PostMapping("/save")
public String addBook(@ModelAttribute Student student){
	
	bookService.save(student);
	
	return "redirect:/Available";
}
/*   below and this are same written pattern 
@GetMapping("/BookList")
public ModelAndView able() {

List<MyBook> myBook = myService.getallList();
ModelAndView mo=  new ModelAndView();
	mo.setViewName("BookList");
	mo.addObject("book",myBook);
	return mo;
}  
*/
 
@RequestMapping("/BookList")
public String getallBooks(Model model){
List<MyBook> myBook=myService.getallBooks();
model.addAttribute("book", myBook);
	return "BookList";
}

@RequestMapping("/myList/{id}")
public String getMyList(@PathVariable("id") int id) {

	Student student=bookService.getBookById(id);
	MyBook myBook= new MyBook(student.getId(), student.getName(), student.getAddress(),student.getBookName(), student.getAuthor() ,student.getPrice());
	myService.saveMyBooks(myBook);
	return "redirect:/BookList";
	}


@RequestMapping("/deleteList/{id}")
public String deletebyid(@PathVariable("id") int id) {	
     myService.deleteByid(id);
return "redirect:/BookList";
}

@RequestMapping("/deleteList2/{id}")
public String deletebyid2(@PathVariable("id") int id) {
	
     bookService.deleteByid(id);

return "redirect:/Available";
}


@RequestMapping("/EditList/{id}")
public String getString(@PathVariable("id") int id , Model model ) {

	Student student=bookService.getBookById(id);
	model.addAttribute("book", student);
	return "/edit";
	}

}
