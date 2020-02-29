package com.epam.costructioncost;

public class costOfConstruction {
	public double calculatecost(int choosenoption,double areaofland)
	{
		switch(choosenoption)
		{
			case 1:return (1200*areaofland);
			case 2:return (1500*areaofland);
			case 3:return (1800*areaofland);
			case 4:return (2500*areaofland);
			default:return 0;
		}
	}
}
