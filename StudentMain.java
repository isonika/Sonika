package com.java.project;

import java.util.List;
import java.util.Scanner;



public class StudentMain {

	 static Scanner sc = new Scanner(System.in);
	 
	 public static void main(String[] args) {
		int choice;
		 do {
			 System.out.println("M E N U");
			 System.out.println("********");
			 System.out.println("1.Add student");
			 System.out.println("2.Show student");
			 System.out.println("3.Exit");
			 System.out.println("Enter your choice  ");
			 choice = sc.nextInt();
			 switch(choice) {
			 case 1 :
				 try {
					addStudent();
				} catch (StudentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break; 
			 case 2 :
				 showStudent();
				 break;
			 case 3 :
				 return;
			 }
			 }while(choice!=3 );
	}
	 
	 public static void showStudent() {
		 StudentBAL bal = new StudentBAL();
		 List<Student> studentList = bal.showStudentBAl();
		 for (Student student : studentList) {
			 System.out.println(student);
		 }
	 }
	 
	 public static void addStudent() throws StudentException {
		 Student student = new Student();
		 System.out.println("Enter Student No");
		 student.setSno(sc.nextInt());
		 System.out.println("Enter Student Name");
		 student.setName(sc.next());
		 System.out.println("Enter Student City");
		 student.setCity(sc.next());
		 System.out.println("Enter Cgp...");
		 student.setCgp(sc.nextDouble());
		 StudentBAL bal = new StudentBAL();
		 System.out.println(bal.addStudentBal(student));
	 

	
		
	}
}
