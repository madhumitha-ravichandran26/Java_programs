import java.io.*;
class methodgreatest
{
public static void main (String args[])throws IOException
{
int num1,num2,num3;
DataInputStream ob=new DataInputStream (System.in);
System.out.print("Enter the first number\n");
num1=Integer.parseInt(ob.readLine());
System.out.print("Enter the second number\n");
num2=Integer.parseInt(ob.readLine());
System.out.print("Enter the Third number\n");
num3=Integer.parseInt(ob.readLine());
findLargest(num1,num2,num3);
}
static void findLargest(int num1,int num2, int num3)
{
 if(num1<=num2 && num1<=num3)
{
 System.out.println(num1+" is the smallest number"); 
}
else if(num2<=num1 && num2<=num3)
{
 System.out.println(num2+" is the smallest number");
 }
else
{
System.out.println(num3+" is the smallest number");        
}  
}
}