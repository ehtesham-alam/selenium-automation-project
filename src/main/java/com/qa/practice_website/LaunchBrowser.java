package com.qa.practice_website;

public class LaunchBrowser {
	int salarycalculator(int basicpay)
	{
	return basicpay;
	}
	int salarycalculator(int basicpay,int hra)
	{
	return basicpay+ hra;
	}
	float salarycalculator(int basicpay,int hra,float bonus)
	{
		return basicpay+ hra+ bonus;
	}

public static void main(String[] args) {
	
	LaunchBrowser T= new LaunchBrowser();
		int salary1= T.salarycalculator(0);
		int salary2= T.salarycalculator(salary1, salary1);
		float salary3= T.salarycalculator(salary1, salary2, salary1);
	

}
}