package Collections;

//import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class listDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> c= new ArrayList<>();
		//List<Integer> c= new LinkedList<>();
		//List<Integer> c= new Vector<>();
		{
		c.add(5);
		c.add(6);
		c.add(8);
		c.add(3);
		}
	/*	for(Object o:c)
		{
			System.out.println(o);
		}

	}
	

}
*/

/*import java.util.*;  
public class listDemo{  
public static void main(String args[]){  
 //Creating a List  
 List<String> list=new ArrayList<>();  
 //Adding elements in the List  
 list.add("Mango");  
 list.add("Apple");  
 list.add("Banana");  
 list.add("Grapes");  
 //Iterating the List element using for-each loop  
 for(String fruit:list)  
  System.out.println(fruit);  
  
}  
}  
*/
Iterator<Integer> itr = c.iterator();
while(itr.hasNext())
{
      System.out.println(itr.next());	
}
}
}