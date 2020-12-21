package OOps;

public class OverloadingDemo {

	public static void main(String[] args) {
		
		
		Overloadingclass.add(11, 12);
		System.out.println("");
		

	}

}
class Overloadingclass
{
	public static int add(int a,int b)
	{
		int c = a+b;
		
		System.out.println("Sum is :"+c);
		return c;
	}
	public static void add(int a ,int b ,int c)
	{
		c= a+b;
		System.out.println("Sum is :"+c);
	}


}
