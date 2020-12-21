package OOps;

interface Demo {
	public abstract void processing();
}

public class InterfaceDemo implements Demo
{
	public void processing()
	{
		System.out.println("Implementation of  Interface");
	}
	
	
	public static void main(String args[]) throws Exception
	{
		
		 Demo obj = new InterfaceDemo();
		obj.processing();	
		
	}
}