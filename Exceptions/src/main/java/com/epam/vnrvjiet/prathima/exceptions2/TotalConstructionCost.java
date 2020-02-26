package com.epam.vnrvjiet.prathima.exceptions2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class TotalConstructionCost {
	private static final Logger LOGGER=LogManager.getLogger(TotalConstructionCost.class);
    public static void main( String[] args )
    {
    	InputClass inputClass=new InputClass();
    	switch(inputClass.GetMaterialStandard())
    	{
    	case 1:InputClass standardMaterial=new StandardMaterial();
    	       standardMaterial.GetTotalAreaOfHouse();
    	       LOGGER.info("Total Construction Cost is:");
    	       LOGGER.info(((StandardMaterial)standardMaterial).ConstructionCost());
    	       break;
    	case 2:InputClass aboveStandardMaterial=new AboveStandardMaterial();
    	        aboveStandardMaterial.GetTotalAreaOfHouse();
    	        LOGGER.info("Total Construction Cost is:");
    	        LOGGER.info(((AboveStandardMaterial)aboveStandardMaterial).ConstructionCost());
    	        break;
    	case 3:InputClass highStandardMaterial=new HighStandardMaterial();
    		    highStandardMaterial.GetTotalAreaOfHouse();
    		    highStandardMaterial.GetIsAutomationRequired();
    		    LOGGER.info("Total Construction Cost is:");
    		    LOGGER.info(((HighStandardMaterial)highStandardMaterial).ConsructionCost());
    		    break;
       default:LOGGER.info("Entered values are not appropriate");  
    	}
    	/*InputClass standardMaterial=new StandardMaterial();
    	InputClass aboveStandardMaterial=new AboveStandardMaterial();
    	InputClass highStandardMaterial=new HighStandardMaterial();*/
       	
    }

}
