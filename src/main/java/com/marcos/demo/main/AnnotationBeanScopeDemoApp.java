package com.marcos.demo.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
public class AnnotationBeanScopeDemoApp
{
	public static void main(String[] args)
	{
		SpringApplication.run(AnnotationBeanScopeDemoApp.class, args);
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/marcos/demo/main/applicationContext.xml");
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		System.out.println("Location of theCoach " + theCoach);
		System.out.println(theCoach.getDailyFortune());
	}
}