package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("sharmila");
	}
	public void studentDept() {
		System.out.println("EEE");
	}
	public void studentId() {
		System.out.println("44");
	}
	public static void main(String[] args) {
		Student obj=new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
	}

}
