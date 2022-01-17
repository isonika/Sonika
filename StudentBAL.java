package com.java.project;

import java.util.List;

public class StudentBAL {  
	
	static StringBuilder sb = new StringBuilder();
	
	public List<Student> showStudentBAl(){
		StudentDAO dao = new StudentDAO();
		return dao.showStudentDao();
	
	}
	
	public String addStudentBal(Student student) throws StudentException {
		if (validateStudent(student) == true) {
			StudentDAO dao = new StudentDAO();
			return dao.addStudentDao(student);
			
		}else {
			throw new StudentException(sb.toString());
		}
		
	}
	public boolean validateStudent(Student student) {
		boolean isValid= true;
		if(student.getSno() <= 0) {
			isValid=false;
			sb.append("Student No Cannot be zero or negative..");
		}
		if(student.getName().length() < 4) {
			isValid=false;
			sb.append("\n Name contains minimum 4 characters..");
		}
		if(student.getCity().length() < 3) {
			isValid = false;
			sb.append("\n City contains minimum 3 characters.. ");
		}
		if(student.getCgp() <= 0) {
			isValid = false;
			sb.append("\n Cgp can't be Zero or Negative..");
		}
		return isValid;
		
	}

}
