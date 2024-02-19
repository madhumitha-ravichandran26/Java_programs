import java.io.*;
class length
 {
  public static void main(String[] args) throws IOException
{  
String word; 
int length;
DataInputStream sc=new DataInputStream(System.in);
System.out.println("Enter the String:");
word= sc.readLine();
length = word.length(); 
System.out.println("Length: " + length); 
} 
}
