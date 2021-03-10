package com.marcos.demo.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Scope("prototype") this makes our bean into prototype scope instead of the default singleton
@Component
public class TennisCoach implements Coach
{

	@Autowired
	@Qualifier("randomFortuneService") // Qualifier tells spring which dependency it should use given that there are multiple dependencies to be used
	private FortuneService fortuneService;

	public TennisCoach()
	{
		System.out.println("TennisCoach created...");
	}

	@PostConstruct // This annotation is a startup method done when bean is created
	public void startUp()
	{
		System.out.println("Bean startup method...");
	}

	@PreDestroy // this annotation is a destroy method used when bean is being destroyed
	public void destroyMethod()
	{
		System.out.println("Bean destroyed...");
	}

	@Override
	public String getDailyFortune()
	{
		return fortuneService.getFortune();
	}

	@Override
	public String getDailyWorkout()
	{
		return "Practice your backhand volley...";
	}
}

