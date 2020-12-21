import java.io.IOException;
import java.util.*;
public class testSample {

	public static void main(String[] args) throws IOException {
		DataDriven obj = new DataDriven();
		ArrayList ar1=obj.getData("Add Profile");
		System.out.println(ar1.get(0));
		System.out.println(ar1.get(1));
		System.out.println(ar1.get(2));
	}

}
