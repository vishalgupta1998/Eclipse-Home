package Multithreading;

class Teher implements Runnable
{
public void run()
{
	System.out.println("Teacher");
	}

}
class Stent implements Runnable
{
	public void run()
	{
	System.out.println("Student");
}}

public class Multithreading2  {
	

	public static void main(String[] args) {
		
Teher obj= new Teher();
Stent obj1= new Stent();
Thread th1 = new Thread(obj);
Thread th2 = new Thread(obj1);
th1.start();
th2.start();

	}

}