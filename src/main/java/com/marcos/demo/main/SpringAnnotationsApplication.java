package com.marcos.demo.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
public class SpringAnnotationsApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(SpringAnnotationsApplication.class, args);
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/marcos/demo/main/applicationContext.xml");
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		System.out.println(theCoach.getDailyFortune());;
	}
}