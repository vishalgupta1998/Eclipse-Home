package Practise;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {
	@Test(dependsOnMethods={"bcollegeStudent"})
	public void acollegeTeachers(){
		System.out.println("2 Heres only teachers allowed");
	}
	@Test
	public void bcollegeStudent(){
		System.out.println("3 only students allowed");
	}
	@Test(priority=1)
	public void ccollegeEmployees(){
		System.out.println("1 Emplyees allowed");
	}
	@Test(groups={"Smoke"})
	public void collegeTransport(){
		System.out.println("Only Transport query  allowed");
	}
	@BeforeMethod        //Same as @AfterMethod
	public void beforeEveryMethod()
	{
		System.out.println("Run Before every method within the class");
	}
	@BeforeTest
	public void Beforetest()
	{
		System.out.println("I will run at first ");
	}
	@AfterSuite()
	public void AfterEverySuite()
	{
		System.out.println("I Will run At Last The suite");
	}
	
	
	
	
	
	
	
	
	
	

}
