import java.io.*;
public class quorem
{
public static void main(String[] args)throws IOException 
{
int dividend, quotient,remainder,divisor;
System.out.println("\n\t Enter the dividend:\t");
DataInputStream ob=new DataInputStream(System.in);
dividend=Integer.parseInt(ob.readLine());   
System.out.println("\n\t Enter the divisor:\t");
divisor=Integer.parseInt(ob.readLine());   
quotient = dividend / divisor;
remainder = dividend % divisor;
System.out.println("Quotient = " + quotient);
System.out.println("Remainder = " + remainder);
  }
}