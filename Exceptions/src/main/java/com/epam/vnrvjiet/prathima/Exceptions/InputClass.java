package com.epam.vnrvjiet.prathima.Exceptions;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InputClass {
	float PrincipalAmount,TimeDuration,RateOfInterest;
	int NumOfTimesInterestCompounded;
	private static final Logger LOGGER=LogManager.getLogger(InterestCalculation.class);
	Scanner s=new Scanner(System.in);
	void GetPrincipalAmount()
	{
	LOGGER.info("enter principal amount:");
	PrincipalAmount=s.nextFloat();
	}
	void GetTimeDuration()
	{
	LOGGER.info("enter Time Period:");
	TimeDuration=s.nextFloat();
	}
	void GetRateOfInterest()
	{
	LOGGER.info("enter RateOfInterest:");
	RateOfInterest=s.nextFloat();
	}
	void GetNumOfTimesInterestCompounded()
	{
	LOGGER.info("enter NumOfTimesInterestCompounded per unit time:");
	NumOfTimesInterestCompounded=s.nextInt();
	}
	
}
