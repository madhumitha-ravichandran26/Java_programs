import java.io.*;
public class multiplication
{
public static void main(String[] args) throws IOException
{
int i=0,num,mul;
System.out.println("\n\t Enter the Number:\t");
DataInputStream ob=new DataInputStream(System.in);
num=Integer.parseInt(ob.readLine());      
while(i<=10)
{
mul=num*i;
System.out.println(+num+"x"+i+"="+num*i);
i=i+1;
}
}
}