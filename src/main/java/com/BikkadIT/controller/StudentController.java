package com.BikkadIT.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.BikkadIT.model.Student;

@Controller
public class StudentController {

	@GetMapping("/studentInfo")
	public String studentInfo(Model model) {

		Student student = new Student();
		student.setStudentId(1234);
		student.setStudentName("Karun");
		student.setStudentAddress("Chandrapur");

		model.addAttribute("STUDENTS", student);
		return "studentInfo";

	}

}
