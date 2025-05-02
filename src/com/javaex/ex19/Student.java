package com.javaex.ex19;

public class Student extends Person{
	//필드
	private String schoolName;

	//생성자
	public Student() {
		super("이효리", 22);
		System.out.println("Student()");
	}
	
	public Student(String schoolName) {
		this.schoolName = schoolName;
		System.out.println("Student(1)");
	}
	
	//////////////////////////////////
	public Student(String name, int age, String schoolName) {
		//name ?
		//age ?
		
		this.schoolName =schoolName;
	}
	
	
	//////////////////////////////////

	//메소드gs
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	//메소드일반
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}
}
