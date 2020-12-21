package JDBC;
import java.sql.*;
public class Jdbcconnectivity {

	public static void main(String[] args) throws ClassNotFoundException  {
		try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ABCD","root","root1234");
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("select name from student1");

   rs.next();
   
	 String yeh =  rs.getString("name");
	 System.out.println(yeh);
	 st.close();
	   con.close();
		}
   catch(Exception e) {
	   System.out.println("Exception");
	   }
	
	
   
	}

}
