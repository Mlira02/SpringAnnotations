package com.marcos.demo.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// Config file will require no XML file to configure our spring container...
//@ComponentScan("com.marcos.demo.main")
@Configuration
public class SportConfig
{
	@Bean
	public FortuneService sadFortuneService()
	{
		return new SadFortuneService();
	}

	@Bean
	public Coach swimCoach()
	{
		return new SwimCoach(sadFortuneService());
	}
}