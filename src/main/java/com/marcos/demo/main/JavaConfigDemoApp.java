package com.marcos.demo.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class JavaConfigDemoApp
{
	public static void main(String[] args)
	{
		SpringApplication.run(JavaConfigDemoApp.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		System.out.println(theCoach.getDailyFortune());
	}
}