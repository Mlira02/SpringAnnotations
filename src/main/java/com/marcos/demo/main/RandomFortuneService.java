package com.marcos.demo.main;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService
{
private String[] data = {"First fortune has been delivered", "Second fortune has been delivered", "Third fortune has been delivered"};
private Random myRandom = new Random();

	public RandomFortuneService()
	{
		System.out.println("RandomService instantiated...");
	}

	@Override
	public String getFortune()
	{
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}
}
