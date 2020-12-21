package BasicPrograms;
import java.util.Scanner;
public class PrimenumbersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a= sc.nextInt();
		for(int i=2;i<=a/2;i++)
		{
			if (a%i==0)
			{ 
				flag =true;
				break;
				
			}
			
		if(!flag)
		{
			System.out.println(+a + " is prime number");
		}
		else
		{
			System.out.println(+a + " is not prime number");
		}
		
		
		}
		
	}

}
