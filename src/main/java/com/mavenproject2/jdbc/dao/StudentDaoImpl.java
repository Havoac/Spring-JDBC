package com.mavenproject2.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mavenproject2.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		// insert query
		String query = "insert into student(id,name,city) values(?,?,?)";
		int result = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
        return result;
	}

	public int change(Student student) {
		// update query
		String query = "update student set name=?, city=? where id=?";
		int result = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
        return result;
	}
	
	public int delete(int studentId) {
		// delete
		String query = "delete from student where id=?";
		int result = this.jdbcTemplate.update(query, studentId);
        return result;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
