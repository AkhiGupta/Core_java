package com.tns.service;

import com.tns.dao.studentdaoimplementation;
import com.tns.entities.student;

public class studentserviceimpl implements studentservice{
	
	
	
	private studentdaoimplementation dao;
 

	@Override
	public void addstudent(student student) {
		// TODO Auto-generated method stub
		dao = new studentdaoimplementation();
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();	
	}

//	public student findStudentById(int id) {
//		// TODO Auto-generated method stub
//		student student = dao.getStudentById(id);
//		return student;
//	}

	@Override
	public void updateStudent(student student) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public void removeStudent(student student) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public student findstudentById(int id) {
		// TODO Auto-generated method stub
		student student = dao.getStudentById(id);
		return student;
	}

}
