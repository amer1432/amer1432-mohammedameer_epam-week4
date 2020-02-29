package com.epam.interestcalculation;
import java.util.*;

public class InterestType {

	public static void main(String[] args) {
		System.out.println("Welcome to simple interest and Compound interest Calculator:");
		boolean tobecontinued=true;
		do
		{
		System.out.println("Choose the option of your choice:\n1. Compound Interest\n 2.Simple Interest ");
		Scanner sc=new Scanner(System.in);
		int Intresttype;
		Intresttype=sc.nextInt();
			switch(Intresttype)
			{
			case 1: CompoundInterest compoundobject=new CompoundInterest();
					compoundobject.InputValues();
					compoundobject.CalculateIntrest();
					break;
			case 2: SimpleInterest simpleobject=new SimpleInterest();
					simpleobject.InputValues();
					simpleobject.CalculateIntrest();
					break;
			default:System.out.println("Enter correct option");
			}
			System.out.println("Do you want to continue?:(true for continue / false for discontinue)");
			tobecontinued=sc.nextBoolean();
			sc.close();
		}while(tobecontinued);
	}
	
}