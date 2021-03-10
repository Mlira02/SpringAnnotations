package com.marcos.demo.main;

public class SwimCoach implements Coach
{

	private FortuneService fortuneService;

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
}
