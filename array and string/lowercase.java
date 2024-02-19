import java.io.*;
class lowercase
 {
  public static void main(String[] args) throws IOException
{  
String word; 
DataInputStream sc=new DataInputStream(System.in);
System.out.println("Enter the String:");
word= sc.readLine();
String wordlower=word.toLowerCase(); 
System.out.println(wordlower);
} }
