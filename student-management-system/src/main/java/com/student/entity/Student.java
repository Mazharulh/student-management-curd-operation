package com.student.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student-details")
public class Student {
	@Id
	@Column(name="student-rollnumber")
	private String studentRollnumber;
	@Column(name="student-name")
	private String studentName;
	@Column(name="student-class")
	private int studentStandard;
	@Column(name="student-mobile-number")
	private String studentContactnumber;
	@Column(name="student-address")
	private String studentAddress;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentRollnumber, String studentName, int studentStandard, String studentContactnumber,
			String studentAddress) {
		super();
		this.studentRollnumber = studentRollnumber;
		this.studentName = studentName;
		this.studentStandard = studentStandard;
		this.studentContactnumber = studentContactnumber;
		this.studentAddress = studentAddress;
	}
	public String getStudentRollnumber() {
		return studentRollnumber;
	}
	public void setStudentRollnumber(String studentRollnumber) {
		this.studentRollnumber = studentRollnumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentStandard() {
		return studentStandard;
	}
	public void setStudentStandard(int studentStandard) {
		this.studentStandard = studentStandard;
	}
	public String getStudentContactnumber() {
		return studentContactnumber;
	}
	public void setStudentContactnumber(String studentContactnumber) {
		this.studentContactnumber = studentContactnumber;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
}
