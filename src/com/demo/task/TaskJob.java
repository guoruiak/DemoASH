package com.demo.task;


import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("taskJob")  
public class TaskJob {
	@Scheduled(cron = "0 0/59 11-12 * * ?") 
	//@Scheduled(cron = "* * * * * ?") 
	public void job(){
		Date d = new Date();
		System.out.println("tasking......." + d.toLocaleString());
	}

}
