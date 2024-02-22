package com.student.response;


public class StudentResponse {
	private String studentRollnumber;
	private String studentName;
	private int studentStandard;
	private String studentContactnumber;
	private String studentAddress;
	public StudentResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentResponse(String studentRollnumber, String studentName, int studentStandard,
			String studentContactnumber, String studentAddress) {
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
