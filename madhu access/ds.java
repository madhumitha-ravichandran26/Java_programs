import java.sql.*;
import java.util.Properties;

public class ds
{
  // The JDBC Connector Class.
  private static final String dbClassName = "com.mysql.jdbc.Driver";

 
  private static final String CONNECTION =
                          "jdbc:mysql://localhost:3306/joice?useSSL=false";

  public static void main(String[] args) 
  {
     String queryString = "SELECT ID, NAME FROM emp";
    System.out.println(dbClassName);
 
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:mydatabase");
Statement stmt = con.createStatement();
String sql="Select * from student";
ResultSet rs = stmt.executeQuery(sql);
    while(rs.next())
      {
   System.out.println("-----------------------------------------------");
   System.out.println("Records of student Table");
   System.out.println("\n"+rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
   System.out.println("-----------------------------------------------");
      }
 }
    catch (Exception e) 
    {
    System.out.println(e.getMessage());
    }
}
}