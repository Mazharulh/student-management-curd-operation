package com.student.servicesimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repo.StudentRepo;
import com.student.response.StudentResponse;
import com.student.reuest.StudentRequest;
import com.student.services.StudentServices;
import com.student.utils.GenrateRollNumber;
@Service
public class StudentServicesImpl implements StudentServices {
	 @Autowired
     private StudentRepo studentRepo;
	 @Autowired
	 private ModelMapper modelMapper;
	@Override
	public StudentResponse addstudent(StudentRequest reuest) {
		// convert StudenrReuest to Student class
		Student student = this.modelMapper.map(reuest, Student.class);
		student.setStudentRollnumber(GenrateRollNumber.getRollNumber());
		 Student savestudent = studentRepo.save(student);
		 //convert Student to StudentReponse class
		 StudentResponse response = this.modelMapper.map(savestudent, StudentResponse.class);
		 response.setStudentRollnumber(savestudent.getStudentRollnumber());
		 return response;
	}

	@Override
	public StudentResponse updatestudent(StudentRequest request, String rollnumber) {
		// we check given student is present or not
		Student student = studentRepo.findById(rollnumber).get();
		student.setStudentName(request.getStudentName());
		student.setStudentStandard(request.getStudentStandard());
		student.setStudentContactnumber(request.getStudentContactnumber());
		student.setStudentAddress(request.getStudentAddress());
		StudentResponse response = this.modelMapper.map(student, StudentResponse.class);
		return response;
	}

	@Override
	public List<StudentResponse> getallstudent() {
		List<Student> allstudent = studentRepo.findAll();
		List<StudentResponse> studentReponse= allstudent.stream().map(student->modelMapper.map(student, StudentResponse.class)).collect(Collectors.toList());
		return studentReponse;
	}

	@Override
	public void deletestudent(String rollnumber) {
		studentRepo.deleteById(rollnumber);

	}

	@Override
	public StudentResponse getstudentbyrollnumber(String rollnumber) {
		Student student = studentRepo.findById(rollnumber).get();
		StudentResponse studentResponse= this.modelMapper.map(student, StudentResponse.class);
		return studentResponse;
	}

}
