package com.epam.interestcalculation;
import java.util.*;
public class SimpleInterest {
	double principleAmount;
	double timeperiod;
	double rateOfIntrest;
	double simpleIntrest=0;
	Scanner sc=new Scanner(System.in);
	void InputValues()
	{
		System.out.println("Enter number of months:(Time period)");
		timeperiod=sc.nextInt();
		System.out.println("Enter principle amount:");
		principleAmount=sc.nextInt();
		System.out.println("Enter Rate of Intrest:");
		rateOfIntrest=sc.nextInt();		
	}
	public void CalculateIntrest()
	{
		timeperiod=timeperiod/12;
		simpleIntrest=(principleAmount*timeperiod*rateOfIntrest)/100;
		System.out.println("Simple Intrest:"+simpleIntrest);
	}
}
