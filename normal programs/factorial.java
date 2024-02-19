import java.io.*;
public class factorial
 {

    public static void main(String[] args) throws IOException
 {
    int fact = 1,i,n;
    System.out.println("\n\t Enter the N:\t");
    DataInputStream ob=new DataInputStream(System.in);
    n=Integer.parseInt(ob.readLine());      
        for( i = 1; i <= n; i++)
        {
           fact= fact *i;
        }
        System.out.printf("Factorial of %d = %d", n, fact);
    }
}