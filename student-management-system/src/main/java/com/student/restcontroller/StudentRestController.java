package com.student.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.response.StudentResponse;
import com.student.reuest.StudentRequest;
import com.student.services.StudentServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/student")
public class StudentRestController {
	
	@Autowired
	private StudentServices studentServices;
	
	// add student 
	@PostMapping("/addstudent")
   public StudentResponse addstudent(@RequestBody StudentRequest reuest)
   {
		StudentResponse response = studentServices.addstudent(reuest);
		return response;
   }
	
	// update student
	@PutMapping("/update/{rollnumber}")
	public StudentResponse updatestudent(@RequestBody StudentRequest reuest,@PathVariable String rollnumber)
	{
		System.out.println("rollnumber "+rollnumber);
		StudentResponse reponse = studentServices.updatestudent(reuest, rollnumber);
		return reponse;
	}
	
	// delete student 
	@DeleteMapping("/delete/{rollnumber}")
	public void deletestudent(@PathVariable String rollnumber)
	{
		studentServices.deletestudent(rollnumber);
		
	}
	
	// get student by rollnumber
	@GetMapping("/{rollnumber}")
	public StudentResponse getstudentbyrollnumber(@PathVariable String rollnumber)
	{
		StudentResponse studentresponse = studentServices.getstudentbyrollnumber(rollnumber);
		return studentresponse;
	}
	
	// get all student 
	@GetMapping("/all")
	public List<StudentResponse> allstudent()
	{
		List<StudentResponse> studentresponse = studentServices.getallstudent();
		return studentresponse;
	}
	
}
