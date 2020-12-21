package Vtestingpk;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Vtesting2 {
	@Test
	public void HomeLoan()
	{
	System.out.println("homeloan");
	}
	@Test
	public void mobileLoan()
	{
	System.out.println("Mobileloan");
	}
	@BeforeTest
	public void PartyLoan()
	{
	System.out.println("Partyloan");
	}

}
