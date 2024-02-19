import java.io.*;
class gcd
{
public static void main(String[] args)throws IOException
{
int gcd = 1,num1,num2,i;
System.out.println("\n\t Enter the 1st Number:\t");
DataInputStream ob=new DataInputStream(System.in);
num1=Integer.parseInt(ob.readLine());   
System.out.println("\n\t Enter the 2nd Number:\t");
num2=Integer.parseInt(ob.readLine());   
for(i=1;i<=num1 && i<=num2; i++)
{
if(num1 % i==0 && num2 % i==0)
gcd = i;
}
System.out.printf("G.C.D is %d",gcd);
}
}