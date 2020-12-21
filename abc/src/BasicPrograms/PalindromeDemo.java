package BasicPrograms;
import java.util.Scanner;
public class PalindromeDemo {

	public static void main(String[] args) {
		
		int r ,rev=0,temp;
		System.out.println("Enter Number");
         Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		temp = n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			rev=rev*10+r;
		}
		if(temp==rev)
			System.out.println("number is palindrome");
		else
			System.out.println("number is not palindrome");
		
	}

}
