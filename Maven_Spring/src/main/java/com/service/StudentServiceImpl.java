package com.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Student;
import com.dao.IStudentDao;

public class StudentServiceImpl implements IStudentService{
	
	private IStudentDao dao;
	
	public void setDao(IStudentDao dao) {
		this.dao = dao;
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	public void addStudnet(Student student) {
		dao.insertStudnet(student);
		dao.insertStudnet(student);
	}
}
