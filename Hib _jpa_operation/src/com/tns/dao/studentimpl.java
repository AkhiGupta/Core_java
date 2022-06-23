package com.tns.dao;
import com.tns.entities.*;
public interface studentimpl {
	
	//crud operation
	public abstract void addStudent(student student);
	public abstract student getStudentById(int id);
	public abstract void removeStudent(student student);
	public abstract void updateStudent(student student);
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}
 