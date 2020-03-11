package com.taslim.SpringBootJPACRUDServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@Autowired
	StudentService service;

	@GetMapping("/list")
	public String viewHomePage(Model model) {
		List<Student> listStudents = service.getAllStudents();
		model.addAttribute("listStudents", listStudents);
		return "index";
	}

//	@GetMapping("/lists")
//	public String getAllStudents(Model model) {
//		List<Student> list = service.getAllStudents();
//		model.addAttribute("list", list);
//		// return new ResponseEntity<List<Student>>(list, new HttpHeaders(),
//		// HttpStatus.OK);
//		return "index";
//	}

	@GetMapping("/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable("id") Long id) {
		Student entity = service.getStudentById(id);

		return new ResponseEntity<Student>(entity, new HttpHeaders(), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Student> createOrUpdateStudent(Student student) {
		Student updated = service.createOrUpdateStudent(student);
		return new ResponseEntity<Student>(updated, new HttpHeaders(), HttpStatus.OK);
	}

	@RequestMapping("/delete/{id}")
	public String deleteStudent(@PathVariable(name = "id") long id) {
	    service.deleteStudentById(id);
	    return "redirect:/list";       
	}
	
	@RequestMapping("/new")
	public String showNewProductPage(Model model) {
		Student student = new Student();
	    model.addAttribute("student", student);
	     
	    return "new_student";
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("student") Student student) {
	    service.save(student);
	     
	    return "redirect:/list";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditStudentPage(@PathVariable(name = "id") long id) {
	    ModelAndView mav = new ModelAndView("edit_student");
	    Student student = service.getStudentById(id);
	    mav.addObject("student", student);
	     
	    return mav;
	}

}
