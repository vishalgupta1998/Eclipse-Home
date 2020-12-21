package GlobalParameters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalParameters {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\pc\\workspace\\TestNGTutorials\\src\\GlobalParameters\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("Username"));
		FileOutputStream fos =new FileOutputStream("C:\\Users\\pc\\workspace\\TestNGTutorials\\src\\GlobalParameters\\data.properties");

		prop.store(fos, null);

	}

}
