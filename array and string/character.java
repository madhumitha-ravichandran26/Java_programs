import java.io.*;
public class character
 {
   public static void main(String[] args)throws IOException
    {
        String str;
        System.out.println("Enter the String: ");
        DataInputStream sc=new DataInputStream(System.in);
    str = sc.readLine();
        int index1 = str.charAt(0);
        int index2 = str.charAt(10);
System.out.println("The character at position 0 is " +(char)index1);
System.out.println("The character at position 10 is " +(char)index2);
    }
}
