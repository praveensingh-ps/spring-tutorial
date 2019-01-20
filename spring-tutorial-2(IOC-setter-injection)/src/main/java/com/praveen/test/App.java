package com.praveen.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.praveen.beans.Student;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student=(Student)context.getBean("student-1");
		Student student1=(Student)context.getBean("student-1");
		System.out.println(student);
		System.out.println(student1);
		((ClassPathXmlApplicationContext)context).close();
	}

}
