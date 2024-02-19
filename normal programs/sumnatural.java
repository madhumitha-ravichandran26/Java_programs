import java.io.*;
public class sumnatural
 {
public static void main(String[] args) throws IOException
{
int n,i,sum = 0;
System.out.println("\n\t Enter the N value:\t");
DataInputStream ob=new DataInputStream(System.in);
n=Integer.parseInt(ob.readLine());  
for(i = 1; i <= n; i++)
{
sum = sum + i;       
}
System.out.println("Sum of natural numbers = " + sum);
}
}