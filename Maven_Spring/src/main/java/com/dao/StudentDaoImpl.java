package com.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
//
import com.bean.Student;

public class StudentDaoImpl extends JdbcDaoSupport implements IStudentDao {

	public void insertStudnet(Student student) {
		String sql = "insert into students(names,age) values (?,?)";
		this.getJdbcTemplate().update(sql, student.getNames(),student.getAge());
	}

}
