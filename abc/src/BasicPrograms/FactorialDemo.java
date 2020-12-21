package BasicPrograms;

import java.util.Scanner;

public class FactorialDemo {

	public static void main(String[] args) {
		System.out.print("Enter a number:");
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		int Fact=1;
		
		for(int i=1;i<=n;i++)
		{
			Fact=Fact*i;
		}
		System.out.println(" " +Fact);
		

	}

}
