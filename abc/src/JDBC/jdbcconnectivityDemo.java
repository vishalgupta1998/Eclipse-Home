package JDBC;
import java.sql.*;

public class jdbcconnectivityDemo {

public static void main(String[] args) throws Exception  {
		
		
try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ABCD","root","root1234");



Statement statement = con.createStatement();

System.out.println("Hello added customer");

String sql = "INSERT INTO student1 (id,name) VALUES (2, 'Vishal')";
statement.executeUpdate(sql);
/*PreparedStatement statement = con.prepareStatement(sql);
statement.setString(3,"rohity");

System.out.println("Hello");
statement.setString(4,"Vibhor");
statement.setString(5,"Catalina");
int rowsInserted = statement.executeUpdate();
if (rowsInserted > 0) 
{
	System.out.println("Inserted successfully!");
	statement.close();
	con.close();

}
*/
System.out.println("inserted");
}
catch(SQLException e){
System.out.println("Exception found");	}


}
}


