package com.tns.clients;

import com.tns.entities.*;
import com.tns.service.studentservice;
import com.tns.service.studentserviceimpl;

public class client {
	public static void main(String[] args) {
		studentservice service = new studentserviceimpl();
		
		student student = new student();
		
		//CreateOperation
		student.setStudentId(100);
		student.setName("Akhilesh");
		service.addstudent(student);
		
		//Retrive operation 
		student = service.findstudentById(100);
		System.out.print("ID:"+student.getStudentId());
		System.out.print("Name:"+student.getName());
		
		//update operation
		student = service.findstudentById(100);
		student.setName("Disha");
		service.updateStudent(student);
		
		
		student = service.findstudentById(100);
		System.out.print("ID:"+student.getStudentId());
		System.out.print("Name:"+student.getName());
		
		//delete operaation
		student = service.findstudentById(100);
		service.removeStudent(student);
		System.out.println("END OF THE PROGRAM");
		
	}
}
