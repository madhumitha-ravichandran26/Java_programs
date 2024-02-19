import java.io.*;
public class prime
{
public static void main(String[] args) throws IOException
{
int s=0,i,n;
System.out.println("\n\t Enter the N:\t");
DataInputStream ob=new DataInputStream(System.in);
n=Integer.parseInt(ob.readLine());      
for( i = 2; i <= n/2; i++)
{
if(n%i==0)
{
s=1;
break;
}
}
if(n==1)
{
System.out.printf("1 is neither prime nor composite");
}
else
{
if(s==0)
System.out.printf("It is a prime number",n);
else
System.out.printf("It is a prime number",n);
}
}
}