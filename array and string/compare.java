import java.io.*;
class compare 
{
    public static void main(String[] args)throws IOException
{
String str1,str2;
DataInputStream sc=new DataInputStream(System.in);
System.out.println("Enter the first String:");
str1= sc.readLine();
System.out.println("Enter the second String:");
str2= sc.readLine(); 
if(str1 == str2)
System.out.println("It is Equal");
else
System.out.println("It is Not Equal");
}
}