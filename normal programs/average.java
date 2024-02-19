import java.io.*;
class average
{
public static void main(String args[])throws IOException
{
int a,b,c,ave;  
System.out.print("\n\t Enter the value of A:\t");
DataInputStream ob=new DataInputStream(System.in);
a=Integer.parseInt(ob.readLine());
System.out.print("\n\t Enter the value of B:\t");
b=Integer.parseInt(ob.readLine());
System.out.print("\n\t Enter the value of C:\t");
c=Integer.parseInt(ob.readLine());
ave=(a+b+c)/3;
System.out.println("The average Value is: " + ave);
}
}