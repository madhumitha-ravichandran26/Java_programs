import java.io.*;
public class trim
{ 
public static void main(String args[]) throws IOException
{ 
String str1,str2; 
DataInputStream sc=new DataInputStream(System.in);
System.out.println("Enter the 1st String:");
str1 = sc.readLine();
System.out.println("Enter the 2nd String:");
str2 = sc.readLine();
System.out.println(str1.trim()+str2); 
}
} 
