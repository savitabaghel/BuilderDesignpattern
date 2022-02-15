package com.example.BuilderDesignpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class BuilderDesignpatternApplication
{
	public static void main(String[] args)
	{
		Computer comp = new Computer.ComputerBuilder(
				"200 GB", "1 GB","5th").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();


		Computer comp2 = new Computer.ComputerBuilder(
				"300 GB", "2 GB","5th").setBluetoothEnabled(true).build();


		SpringApplication.run(BuilderDesignpatternApplication.class, args);
	}


}
