package Multithreading;


class Teacher extends Thread
{
public void run()
{
	System.out.println("Teacher");
	}

}
class Student extends Thread
{
	public void run()
	{
	System.out.println("Student");
}}

public class MultithreadingDemo extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Teacher Th1 = new Teacher();
Th1.start();
	}

}
