package com.nt.reciever;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.nt.model.Students;

@Component
public class ObjectMessageReciever {
	
	@JmsListener(destination = "obj_mq1")
	public   void  consumeObjectDataAsMessage(Students  student) {
		  System.out.println("Recived Object Data ::"+student);
	}
}
