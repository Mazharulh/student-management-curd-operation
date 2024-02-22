package com.student.services;

import java.util.List;

import com.student.entity.Student;
import com.student.response.StudentResponse;
import com.student.reuest.StudentRequest;

public interface StudentServices {
public StudentResponse addstudent(StudentRequest reuest);
public StudentResponse updatestudent(StudentRequest request,String rollnumber);
public List<StudentResponse> getallstudent();
public void deletestudent(String rollnumber);
public StudentResponse getstudentbyrollnumber(String rollnumber);
}
