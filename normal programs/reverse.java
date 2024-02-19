import java.io.*;
public class reverse
{
public static void main(String[] args) throws IOException
{
int num, digit,r= 0;
System.out.println("\n\t Enter the N:\t");
DataInputStream ob=new DataInputStream(System.in);
num=Integer.parseInt(ob.readLine());      
while(num != 0)
{
digit = num % 10;
r = r * 10 + digit;
num =num/ 10;
}
System.out.println("Reversed Number is: " + r);
}
}