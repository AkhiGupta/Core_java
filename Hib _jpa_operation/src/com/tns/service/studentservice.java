package com.tns.service;

import com.tns.entities.student;

public interface studentservice {
	public abstract void addstudent(student student);
	public abstract student findstudentById(int id);
	public abstract void updateStudent(student student);
	public abstract void removeStudent(student student);


}
