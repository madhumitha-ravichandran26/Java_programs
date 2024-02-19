import java.io.*;
public class polygon
{
public static void main(String[] args)throws IOException
{
int n;
double side; 
DataInputStream ob=new DataInputStream (System.in);
System.out.print("Enter the number of sides: ");
n=Integer.parseInt(ob.readLine());
System.out.print("Enter the side: ");
side=Double.parseDouble(ob.readLine());
System.out.println("The area of the pentagon is " + pentagon_area(n, side));
 }
 public static double pentagon_area(int n, double s)
 {
 return  (n * s * s) / (4 * Math.tan(Math.PI/n));
 }
}