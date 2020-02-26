package com.epam.vnrvjiet.prathima.Exceptions;

public class CompoundInterest extends InputClass{
	double CompoundInterestCalculation()
	{
		double result=Math.pow((1+(RateOfInterest)/(100*NumOfTimesInterestCompounded)),TimeDuration*NumOfTimesInterestCompounded);
		return(PrincipalAmount*result-PrincipalAmount);
	}

}
/**double amount = p * Math.pow(1 + (r / n), n * t);
double cinterest = amount - p;
System.out.println("Compound Interest after " + t + " years: "+cinterest);
System.out.println("Amount after " + t + " years: "+amount);
}
public static void main(String args[]) {
JavaExample obj = new JavaExample();
obj.calculate(2000, 5, .08, 12);
}
}
public void calculate(int p, int t, double r, int n) {**/