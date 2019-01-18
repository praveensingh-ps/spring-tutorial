package com.praveen.test;

import com.praveen.servce.MessageService;

public class MessageApp {

	public static void main(String[] args) {
		MessageService messageService=new MessageService();
		messageService.sayHello();
	}

}
