package com.marcos.demo.main;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService
{
	@Override
	public String getFortune()
	{
		return "From database fortune service";
	}
}
