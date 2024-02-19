import java.sql.*;
class datastudent
{
  public static void main(String args[])
{
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:ds");
Statement stmt = con.createStatement();
String sql="select * from student";
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
