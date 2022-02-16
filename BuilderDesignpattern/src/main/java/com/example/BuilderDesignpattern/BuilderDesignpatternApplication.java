package com.example.BuilderDesignpattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BuilderDesignpatternApplication
{

	private static Logger logger= LogManager.getLogger(BuilderDesignpatternApplication.class);
	public static void main(String[] args)
	{
		Computer comp = new Computer.ComputerBuilder(
				"200 GB", "1 GB","5th").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();


		Computer comp2 = new Computer.ComputerBuilder(
				"300 GB", "2 GB","5th").setBluetoothEnabled(true).build();


		System.out.println("\n hello !!!\n");
		logger.info("This is information msg");
		logger.error("This is error msg");
		logger.warn("this is warn msg");

		System.out.println("Completed");


	}


}
