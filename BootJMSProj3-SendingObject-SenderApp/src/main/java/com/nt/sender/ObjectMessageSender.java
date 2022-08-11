package com.nt.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.nt.model.Students;
@Component
public class ObjectMessageSender {
	@Autowired
	private JmsTemplate template;
	
	@Scheduled(cron = "0/10 * * * * * ") //application run betn gap of 5sec
	public   void  sendObjectDataAsMessage() {
		//prepare object
		  Students student=new Students(1001, "ranveer", "mumbai",25000F);
		//send object as the message
		  template.convertAndSend("obj_mq1", student);
		  System.out.println("Object is send  as Message ");
		  
	}

}
