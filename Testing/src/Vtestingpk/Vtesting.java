package Vtestingpk;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Vtesting {
	@Test(groups={"Smoke"})
public void carloan(){
	System.out.println("car Loan");
	
}
	@BeforeTest
	public void Accesoriesloan()
	{
		System.out.println("Accesories Loan");
		
} 
	@AfterTest
	public void Laptoploan()
	{System.out.println("Accesories Loan");
	}

}