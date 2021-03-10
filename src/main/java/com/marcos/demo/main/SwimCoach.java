package com.marcos.demo.main;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach
{

	private FortuneService fortuneService;

	@Value("something@gmail.com")
	private String email;

	@Value("Cool team")
	private String team;

	public SwimCoach(FortuneService fortuneService)
	{
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune()
	{
		return "Swim 1000 meters as a warm up...";
	}

	@Override
	public String getDailyWorkout()
	{
		return fortuneService.getFortune();
	}

	public String getEmailAndTeam()
	{
		return "Email is " + email + " And this is our team name " + team;
	}
}
