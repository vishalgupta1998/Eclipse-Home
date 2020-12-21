package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		try {	 
	int i,j,k;
	i=8;
	j=0;
	k=i/j;
	System.out.println(k);
	
		if (k>2)
			throw new ArithmeticException("/by zero");
		}
	catch(ArithmeticException e)
	{
		System.out.println(e);
		}
		System.out.println("hello");
	}
	
		// TODO Auto-generated method stub

	

}
