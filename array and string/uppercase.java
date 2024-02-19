import java.io.*;
class uppercase
 {
  public static void main(String[] args) throws IOException
{  
String word; 
DataInputStream sc=new DataInputStream(System.in);
System.out.println("Enter the String:");
word= sc.readLine();
String wordupper=word.toUpperCase(); 
System.out.println(wordupper);
}
}
