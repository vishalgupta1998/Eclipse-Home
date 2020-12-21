package BasicPrograms;

import java.util.Scanner;

public class FibonnaciProgramsDemo {

	public static void main(String[] args) {
		System.out.println("Enter a numberr");
		Scanner sc = new Scanner(System.in);
		int first=0;
		int second =1;
		int n= sc.nextInt();
		for(int i=0;i<=n;i++)
		{
		int third=first+second;;
		first=second;
		second = third;
	 System.out.println(first + "");
		}
		
	}

}
