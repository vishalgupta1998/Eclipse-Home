package Vtestingpk;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Test
public class Vtesting3 {
	public void Signoutcarloan()
	{	System.out.println("Mobile Sign out");
	}
	
	@Parameters({"Url","Username"})
	@Test
	public void WebloginCarloan(String urlname, String key)
	{
		System.out.println("WebloginCarloan");
		System.out.println(urlname);
		System.out.println(key);
	}
	@BeforeMethod
	public void beforeevery()
	{
		System.out.println("I Will Execute Before Every test method in the class");
	
	}
	@AfterMethod
	public void afterevery()
	{
		System.out.println("I Will Execute after Every test method in the class");
	
	}
	@Parameters({"Url","Username"})
	public void MobileSignoutCarloan(String urlname, String key)
	{
		System.out.println("Mobile Sign out");
		System.out.println(urlname);
		System.out.println(key);
	}
	public void Apicarloan()
	{
		
	System.out.println("api");
	}
	
	@Test(timeOut=4800)
	public void MobileSignoutCarloan()
	{
		System.out.println("mobilesignout");
	}
	@DataProvider
 public Object[] getData(){
	
	Object[][]data = new Object [3][2];
	data[0][0] = "firstsetusername";
	data[0][1] = "Password";
	data[1][0] = "Secondsetusername";
	data[1][1] = "SecondPassword";
	data[2][0] = "Thirdsetusername";
	data[2][1] = "ThirdPassword";
	return data;
}

}
