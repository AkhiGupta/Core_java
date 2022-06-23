package com.tns.dao;

import com.tns.entities.student;
import javax.persistence.*;
public class studentdaoimplementation
{
	private EntityManager entityManager;
	
	public void studentdaoimplenetation() {
		entityManager = Jpautil.getEntityManager();
	}
	
	public  void addStudent(student student)
	{
		entityManager.persist(student);
	}
	public  student getStudentById(int id)
	{
		student student = entityManager.find(student.class, id);
		return student;
	}
	public void removeStudent(student student)
	{
		entityManager.remove(student);
	}
	public  void updateStudent(student student)
	{
		entityManager.merge(student);
	}
	public  void commitTransaction()
	{
		entityManager.getTransaction().commit();
	}
	public  void beginTransaction()
	{
		entityManager.getTransaction().begin();
	}
	

}
