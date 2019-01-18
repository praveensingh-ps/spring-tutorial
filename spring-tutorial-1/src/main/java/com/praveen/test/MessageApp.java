package com.praveen.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.praveen.servce.MessageService;

public class MessageApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		MessageService messageService=(MessageService)applicationContext.getBean("msg");
		messageService.sayHello();
		((ClassPathXmlApplicationContext)applicationContext).close();
	}

}
