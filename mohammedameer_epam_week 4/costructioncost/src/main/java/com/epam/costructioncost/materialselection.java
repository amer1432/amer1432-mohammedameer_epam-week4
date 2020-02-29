package com.epam.costructioncost;
import java.util.*;
public class materialselection 
{
    public static void main( String[] args )
    {
    	double LandArea;
    	int ChoosenOption;
    	Scanner sc=new Scanner(System.in);
    	costOfConstruction costObject=new costOfConstruction();
    	System.out.println("Enter the area of the land(square meters):");
   		LandArea=sc.nextDouble();
   		System.out.println("Enter the material you of your choice:");
   		System.out.println("1.Standard Material\n2.Above standard material\n3.High Standard material\n4.High standard and Fully automated house");
   		ChoosenOption=sc.nextInt();
   		System.out.println("The total cost of the construction is:"+costObject.calculatecost(ChoosenOption, LandArea));
   		sc.close();
    }
}
