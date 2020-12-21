package test;


import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {
	@AfterTest
	public void Afterall()
	{
		System.out.println("This will run in the end");
	}
	
	@Test
	public void carloan()
	{
		System.out.println("Car loan");
		
	}
	@Test
	public void bikeloan()
	{
		System.out.println("Bike Loan");
	}

}
