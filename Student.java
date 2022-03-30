package com.collegevalidation;

import java.util.Set;

public class Student {
	int StudentId;
	String studentName;
	Set<Subject>subjectSet;
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Set<Subject> getSubjectSet() {
		return subjectSet;
	}
	public void setSubjectSet(Set<Subject> subjectSet) {
		this.subjectSet = subjectSet;
	}
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", studentName=" + studentName + ", subjectSet=" + subjectSet + "]";
	}
	

}
