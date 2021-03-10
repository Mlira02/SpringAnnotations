package com.marcos.demo.main;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService
{
	@Override
	public String getFortune()
	{
		return "from Rest fortune service...";
	}
}
