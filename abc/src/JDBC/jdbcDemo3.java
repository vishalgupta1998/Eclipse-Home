
package JDBC;
import java.sql.*;

public class jdbcDemo3 {

public static void main(String[] args)  {
		
		
try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ABCD","root","root1234");


String sql = "Insert into Student1 (id, name) Values (?,?)";

PreparedStatement statement = con.prepareStatement(sql);
System.out.println("hello");
statement.setInt(1,2);
statement.setString(2,"Vibhor");
System.out.println("Hello");

statement.executeUpdate();
{
	System.out.println("Inserted successfully!");
	statement.close();
	con.close();

}

System.out.println("inserted");
}
catch(SQLException e){
System.out.println(e);	}
catch(Exception e){ System.out.println(e);}  


}
}