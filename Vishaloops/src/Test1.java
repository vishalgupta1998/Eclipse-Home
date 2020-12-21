
abstract class Myname 
{  
 
abstract void display();  
}  
public class Test1 extends Myname
{   
void display()  
{  
System.out.println("Abstract method?");  
}  
public static void main(String args[])  
{   
Test1 obj = new Test1();    
obj.display();  
}  
}  