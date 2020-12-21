package Collections;
import java.util.*;
import java.util.Map.Entry;

public class MapDemo2 {

	public static void main(String[] args) {
		
		Map<String,String> M = new HashMap<>();
		M.put("SName", "Vishal");
		M.put("CName", "Sqe");
		M.put("TName", "MyComapny");
		M.put("Job", "Testing");
		
		Iterator<Map.Entry<String, String>> itr = M.entrySet().iterator();
		while(itr.hasNext())
		{
			Entry<String, String> entry = itr.next();
			System.out.println("key is "+entry.getKey()+"value is"+entry.getValue());
			
		}
	}

}
