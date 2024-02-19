import java.io.*;
public class concatenate 
{
public static void main(String[] args)throws IOException
{
String str1,str2,str3;
DataInputStream sc=new DataInputStream(System.in);
System.out.println("Enter the first String:");
str1= sc.readLine();
System.out.println("Enter the second String:");
str2= sc.readLine(); 
System.out.println("First String: " + str1); 
System.out.println("Second String: " + str2); 
str3 = str1.concat(str2);
System.out.println("The concatenated string: " + str3);
}
}
