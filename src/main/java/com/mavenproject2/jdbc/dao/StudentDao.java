package com.mavenproject2.jdbc.dao;

import com.mavenproject2.jdbc.entities.Student;

public interface StudentDao {
	public int insert(Student student);
	public int change(Student student);
	public int delete(int studentId);
}
