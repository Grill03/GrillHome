package com.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.annotation.ISomeService;
import com.bean.Student;
import com.service.IStudentService;

public class MyTest {
	@Test
	public void Test(){
		String re = "Aop.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(re);
		Student student = new Student("1", "张三", "15");
		IStudentService sc = (IStudentService) ac.getBean("StudentServiceImpl");
		sc.addStudnet(student);
	}

	@Test
	public void Test2(){
		String re = "Aop.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(re);
		ISomeService service = (ISomeService) ac.getBean("myService");
		service.doThird();
	}
}
