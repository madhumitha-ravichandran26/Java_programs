import java.io.*;
class area
{
public static void main(String args[])throws IOException
{
int a,l,b,square,r,rectangle,choice;  
double pi=3.14,circle;
DataInputStream ob=new DataInputStream(System.in);
System.out.println("\n\t Enter Choice:\t");
choice=Integer.parseInt(ob.readLine());

switch(choice)
{
case 1: System.out.println("Area of Square:");
          System.out.println("\n\t Enter the Side:\t");
          a=Integer.parseInt(ob.readLine());
          square= a*a;
           System.out.println("Result : "+square);
           break;
case 2: System.out.println("Area of Rectangle:");
         System.out.println("\n\t Enter the lenght and breadth:\t");
          l=Integer.parseInt(ob.readLine());
          b=Integer.parseInt(ob.readLine());
          rectangle= l*b;
          System.out.println("Result : "+rectangle);
           break;
case 3:System.out.println("Area of Circle:");
          System.out.println("\n\t Enter the radius:\t");
          r=Integer.parseInt(ob.readLine());
          circle=pi*r*r;
          System.out.println("Result : "+circle);
           break;

default:System.out.print("\n\t WRONG CHOICE\n\n");
             break;     
}
}
}