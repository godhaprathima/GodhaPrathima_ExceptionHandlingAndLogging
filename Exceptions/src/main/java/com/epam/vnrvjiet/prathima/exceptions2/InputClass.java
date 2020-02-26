package com.epam.vnrvjiet.prathima.exceptions2;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.epam.vnrvjiet.prathima.Exceptions.InterestCalculation;


public class InputClass {

	int MaterialStandard,TotalAreaOfHouse;
	char IsFullyAutomatedRequired;
	private static final Logger LOGGER=LogManager.getLogger(InterestCalculation.class);
	Scanner s=new Scanner(System.in);
	int GetMaterialStandard()
	{
		LOGGER.info("1:Standard Material\n 2:Above Standard Material\n 3:High Standard Material\n");
		LOGGER.info("Enter your Choice:");
		MaterialStandard=s.nextInt();
		return MaterialStandard;
	}
	void GetTotalAreaOfHouse()
	{
		LOGGER.info("Enter area of house");
		TotalAreaOfHouse=s.nextInt();
	}
	void GetIsAutomationRequired()
	{
		LOGGER.info("Is Automation Required Enter y/N ");
		IsFullyAutomatedRequired=s.next().charAt(0);
		 
	}
}
