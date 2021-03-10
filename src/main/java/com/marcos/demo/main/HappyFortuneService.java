package com.marcos.demo.main;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService
{


	@Override
	public String getFortune()
	{
		return "This is a happy fortune yayyy!!";
	}
}
