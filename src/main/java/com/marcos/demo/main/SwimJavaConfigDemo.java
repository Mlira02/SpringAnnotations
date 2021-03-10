package com.marcos.demo.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SwimJavaConfigDemo
{
	public static void main(String[] args)
	{
		SpringApplication.run(SwimJavaConfigDemo.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach theCoach = context.getBean("swimCoach", Coach.class);
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
	}
}
