package com.student.reuest;
public class StudentRequest {
	private String studentName;
	private int studentStandard;
	private String studentContactnumber;
	private String studentAddress;
	public StudentRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentRequest(String studentName, int studentStandard, String studentContactnumber, String studentAddress) {
		super();
		this.studentName = studentName;
		this.studentStandard = studentStandard;
		this.studentContactnumber = studentContactnumber;
		this.studentAddress = studentAddress;
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
