package Practise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
	@Parameters({ "URL" })
	@Test(dependsOnMethods={"bookedBooks"})
	public void libraryBook(String hey)
	{
		System.out.println("libraries Book");
		System.out.println(hey);
	}
	
	@Test(groups={"Smoke"})
	public void libraryStaff()
	{
		System.out.println("libraries Staff");
	}
	@Test(dataProvider="provider")
	public void boAligned(String Username,String Password)
	{
		System.out.println(Username);
		System.out.println(Password);
		System.out.println("All Aligned");
	}
	@Test(enabled=true)
	public void booksAligned()
	{
		System.out.println("Books Aligned");
	}
	@Test
	public void bookedBooks()
	{
		System.out.println("Booked Books");
	}
	
	
	@DataProvider
	public Object[][] provider()
	{
		System.out.println("program analyst");
		Object[][] data = new Object[3][2];
		 data[0][0]= "First Username";
		 data[0][1]="First Password";
		 
		 
		 data[1][0] = "Second Username";
		 data[1][1]="Second password";
		 
		 
		 data[2][0]="Third Username";
		 data[2][1]="Third password";
		 
		 return data;
		
	}

}
