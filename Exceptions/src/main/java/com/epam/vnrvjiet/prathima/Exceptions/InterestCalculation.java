package com.epam.vnrvjiet.prathima.Exceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */

public class InterestCalculation {
	private static final Logger LOGGER=LogManager.getLogger(InterestCalculation.class);
    public static void main( String[] args )
    {
    	InputClass simpleInterest=new SimpleInterest();
    	InputClass compoundInterest=new CompoundInterest();
        simpleInterest.GetPrincipalAmount();
    	simpleInterest.GetTimeDuration();
    	simpleInterest.GetRateOfInterest();
    	compoundInterest.PrincipalAmount=simpleInterest.PrincipalAmount;
    	compoundInterest.TimeDuration=simpleInterest.TimeDuration;
    	compoundInterest.RateOfInterest=simpleInterest.RateOfInterest;
    	compoundInterest.GetNumOfTimesInterestCompounded();
    	LOGGER.debug("Simple Interest is");
    	LOGGER.debug(((SimpleInterest)simpleInterest).SimpleInterestCalculation());
    	LOGGER.debug("Compound Interest is");
    	LOGGER.debug(((CompoundInterest)compoundInterest).CompoundInterestCalculation());
    	
    	
       // LOGGER.debug("Hello World!");
    }
	

}
