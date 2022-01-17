package com.java.project;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	
	static List<Student> studentList;
	
	static{
		studentList = new ArrayList<Student>();
	}
	
	public String addStudentDao(Student student) {
		studentList.add(student);
		return"Student added Successfully..";
	}
	
	public List<Student>showStudentDao(){
		return studentList;
	}

}
