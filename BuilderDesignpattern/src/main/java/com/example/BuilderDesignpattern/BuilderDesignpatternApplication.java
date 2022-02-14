package com.example.BuilderDesignpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class BuilderDesignpatternApplication
{
	public static void main(String[] args)
	{
		Computer comp = new Computer.ComputerBuilder(
				"500 GB", "2 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();
		SpringApplication.run(BuilderDesignpatternApplication.class, args);
	}


}
