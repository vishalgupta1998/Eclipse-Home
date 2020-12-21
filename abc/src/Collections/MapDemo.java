package Collections;
import java.util.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> h = new HashMap<>();
		h.put(1,"Vishal");
		h.put(2,"Nikhil");
		/*for(Object j:h);
		{
			System.out.println(j);
		}
*/
		Iterator<Map.Entry<Integer,String>> itr = h.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println(" key is:" +entry.getKey() + "value is:"+entry.getValue());
		}
	}

}
