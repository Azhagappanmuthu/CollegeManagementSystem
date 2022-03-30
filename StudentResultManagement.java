package com.collegevalidation;

import java.util.HashSet;
import java.util.Set;

public class StudentResultManagement {

	public static void main(String args[]) {

		StudentResultManagement studentResultManagement = new StudentResultManagement();

		studentResultManagement.studentResult();

	}

	private void studentResult() {

		Set<Department> departmentDetails = departmentDetails();
// using condition for iterating   department details
		for (Department department : departmentDetails) {
			// using if condition to get the department name
			if (department.getDeptId() == 1) {
				department.getDeptName();
				System.out.println("departmentName : " + department.getDeptName());
				// using condition for iterating student details
				for (Student student : department.getStudentSet()) {
					student.getStudentName();
					System.out.println("studentName: " + student.getStudentName());
					if (student.getSubjectSet() != null) {
						// getting subject details by student.get subject set
						for (Subject subject : student.getSubjectSet()) {
							subject.getSubName();
							subject.getMark();
							System.out.println("subjectName:" + subject.getSubName());
							System.out.println("subjectMark: " + subject.getMark());
							// student mark is greater than are equal to 35 will go inside this condition
							if (subject.getMark() >= 35) {
								System.out.println("pass");
								// student less than 35 go inside
							} else {
								System.out.println("fail");
							}

						}
					}

				}

			} else if (department.getDeptId() == 2) {
				department.getDeptName();
				System.out.println("departmentName : " + department.getDeptName());
				for (Student student : department.getStudentSet()) {
					student.getStudentName();
					System.out.println("studentName: " + student.getStudentName());
					for (Subject subject : student.getSubjectSet()) {
						subject.getSubName();
						subject.getMark();
						System.out.println("subjectName:" + subject.getSubName());
						System.out.println("subjectMark: " + subject.getMark());
						if (subject.getMark() >= 35) {
							System.out.println("pass");
						} else {
							System.out.println("fail");
						}

					}
				}
			} else if (department.getDeptId() == 3) {
				department.getDeptName();
				System.out.println("departmentName : " + department.getDeptName());
				for (Student student : department.getStudentSet()) {

					student.getStudentName();
					System.out.println("studentName: " + student.getStudentName());
					if (student.getSubjectSet() != null) {
						for (Subject subject : student.getSubjectSet()) {
							subject.getSubName();
							subject.getMark();
							System.out.println("subjectName:" + subject.getSubName());
							System.out.println("subjectMark: " + subject.getMark());
							if (subject.getMark() >= 35) {
								System.out.println("pass");
							} else {
								System.out.println("fail");
							}

						}
					}
				}
			}
		}

	}
	// creating method for subject details

	private Set<Subject> subjectDetails(int deptId, String studentName) {

		// creating object for subjectSet

		HashSet<Subject> subjectSet = new HashSet<Subject>();
		// creating object for each subject
		Subject subject1 = new Subject();
		Subject subject2 = new Subject();
		Subject subject3 = new Subject();
        // 
		if (deptId == 1) {
			//adding name and id for subject

			subject1.setSubId(1001);
			subject1.setSubName("Tamil");

			subject2.setSubId(1002);
			subject2.setSubName("English");

			subject3.setSubId(1003);
			subject3.setSubName("Maths");
			// using condition to set mark for each students
			if (studentName.equals("ajay")) {
				subject1.setMark(35);
				subject2.setMark(55);
				subject3.setMark(58);
			} else if (studentName.equals("vijay")) {
				subject1.setMark(34);
				subject2.setMark(49);
				subject3.setMark(40);
			} else if (studentName.equals("vimal")) {
				subject1.setMark(41);
				subject2.setMark(43);
				subject3.setMark(39);
			}
		}

		else if (deptId == 2) {

			subject1.setSubId(1004);
			subject1.setSubName("ComputerScience");

			subject2.setSubId(1005);
			subject2.setSubName("Accounts");

			subject3.setSubId(1006);
			subject3.setSubName("Commerce");

			if (studentName.equals("kumar")) {
				subject1.setMark(80);
				subject2.setMark(51);
				subject3.setMark(54);
			} else if (studentName.equals("vikram")) {
				subject1.setMark(20);
				subject2.setMark(36);
				subject3.setMark(39);
			} else if (studentName.equals("saran")) {
				subject1.setMark(32);
				subject2.setMark(34);
				subject3.setMark(29);
			}
		}

		else if (deptId == 3) {

			subject1.setSubId(1007);
			subject1.setSubName("Principle of Management");

			subject2.setSubId(1008);
			subject2.setSubName("Electrical Drives");

			subject3.setSubId(1009);
			subject3.setSubName("Electrical Engineering");
			if (studentName.equals("sanjay")) {
				subject1.setMark(45);
				subject2.setMark(41);
				subject3.setMark(39);
			} else if (studentName.equals("mani")) {
				subject1.setMark(38);
				subject2.setMark(38);
				subject3.setMark(35);
			} else if (studentName.equals("siva")) {
				subject1.setMark(37);
				subject2.setMark(33);
				subject3.setMark(32);
			}
		}

		subjectSet.add(subject1);
		subjectSet.add(subject2);
		subjectSet.add(subject3);

		return subjectSet;
	}

	private Set<Student> studentDetails(int deptId) {

		HashSet<Student> studentSet = new HashSet<Student>();

		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();

		if (deptId == 1) {
			student1.setStudentId(2001);
			student1.setStudentName("ajay");
			student1.setSubjectSet(subjectDetails(1, "ajay"));
			studentSet.add(student1);

			student2.setStudentId(2002);
			student2.setStudentName("vijay");
			student2.setSubjectSet(subjectDetails(1, "vijay"));
			studentSet.add(student2);

			student3.setStudentId(2003);
			student3.setStudentName("vimal");
			student3.setSubjectSet(subjectDetails(1, "vimal"));
			studentSet.add(student3);
		} else if (deptId == 2) {
			student1.setStudentId(2004);
			student1.setStudentName("kumar");
			student1.setSubjectSet(subjectDetails(2, "kumar"));
			studentSet.add(student1);

			student2.setStudentId(2005);
			student2.setStudentName("vikram");
			student2.setSubjectSet(subjectDetails(2, "vikram"));
			studentSet.add(student2);

			student3.setStudentId(2006);
			student3.setStudentName("saran");
			student3.setSubjectSet(subjectDetails(2, "saran"));
			studentSet.add(student3);

		} else if (deptId == 3) {
			student1.setStudentId(2007);
			student1.setStudentName("sanjay");
			student1.setSubjectSet(subjectDetails(3, "sanjay"));
			studentSet.add(student1);

			student2.setStudentId(2008);
			student2.setStudentName("mani");
			student2.setSubjectSet(subjectDetails(3, "mani"));
			studentSet.add(student2);

			student3.setStudentId(2009);
			student3.setStudentName("siva");
			student3.setSubjectSet(subjectDetails(3, "siva"));
			studentSet.add(student3);

		}
		studentSet.add(student1);
		studentSet.add(student2);
		studentSet.add(student3);
		return studentSet;
	}

	private Set<Department> departmentDetails() {

		HashSet<Department> departmentSet = new HashSet<Department>();

		Department dept1 = new Department();
		Department dept2 = new Department();
		Department dept3 = new Department();

		dept1.setDeptId(1);
		dept1.setDeptName("Arts");
		dept1.setStudentSet(studentDetails(dept1.getDeptId()));
		departmentSet.add(dept1);

		dept2.setDeptId(2);
		dept2.setDeptName("CSC");
		dept2.setStudentSet(studentDetails(dept2.getDeptId()));
		departmentSet.add(dept2);

		dept3.setDeptId(3);
		dept3.setDeptName("EEE");
		dept3.setStudentSet(studentDetails(dept3.getDeptId()));
		departmentSet.add(dept3);

		departmentSet.add(dept1);
		departmentSet.add(dept2);
		departmentSet.add(dept3);

		return departmentSet;

	}

}
