import java.io.*;
public class triangle
{
public static void main(String[] args) throws IOException
{
double side1,side2,side3;
DataInputStream ob=new DataInputStream (System.in);
System.out.print("Enter the side1: ");
side1=Double.parseDouble(ob.readLine());
System.out.print("Enter the side2: ");
side2=Double.parseDouble(ob.readLine());
System.out.print("Enter the side3: ");
side3=Double.parseDouble(ob.readLine());
System.out.println( is_Valid(side1, side2,side3) ? "The area of the triangle is " + area_triangle(side1, side2, side3) : "Invalid triangle" );
}
public static boolean is_Valid(double side1, double side2, double side3) 
{
if( side1 + side2 > side3 &&side2 + side3 > side1 &&side1 + side3 > side2) 
return true;
else 
return false;
}
public static double area_triangle(double side1, double side2, double side3) 
{
double area = 0;
double s = (side1 + side2 + side3)/2;
area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
return area;
}
}
