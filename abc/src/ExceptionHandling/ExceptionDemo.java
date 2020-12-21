package ExceptionHandling;

public class ExceptionDemo {

	public static void main(String[] args) {
	try {	 
int i,j,k;
i=8;
j=0;
k=i/j;
System.out.println(k);

	}
catch(Exception e)
{
	System.out.println(e);
	}
	System.out.println("hello");
}
}