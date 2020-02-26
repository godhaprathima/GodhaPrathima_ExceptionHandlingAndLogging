package com.epam.vnrvjiet.prathima.exceptions2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HighStandardMaterial extends InputClass {
	private static final Logger LOGGER=LogManager.getLogger(TotalConstructionCost.class);
	
	int ConsructionCost()
	{
	if(IsFullyAutomatedRequired=='y')
	{
	return 2500*TotalAreaOfHouse;
	}
	  else if(IsFullyAutomatedRequired=='N')
	{
		return 1800*TotalAreaOfHouse;
	}
	else
	{
	 LOGGER.info("Entered conditions are appropriate");	
	 return 0;
	}
		
}
}
