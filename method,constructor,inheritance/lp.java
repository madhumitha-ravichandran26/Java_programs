import java.io.*;
public class lp
{
public static void main(String[] args)throws IOException
{
int year;
DataInputStream ob=new DataInputStream (System.in);
System.out.print("Enter the year:\n");
year=Integer.parseInt(ob.readLine());
System.out.println(is_LeapYear(year));
}
public static boolean is_LeapYear(int y)
{
boolean a = (y % 4) == 0;
boolean b = (y % 100) != 0;
boolean c = ((y % 100 == 0) && (y % 400 == 0));
return a && (b || c);
}
}
