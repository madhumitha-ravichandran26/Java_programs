import java.io.*;

public class sumofdigits {
    public static void main(String[] args)throws IOException
    {
int n,r,s=0;
DataInputStream ob=new DataInputStream(System.in);
System.out.println("Enter the number:");
n=Integer.parseInt(ob.readLine());
while(n>0){
    r=n%10;
    s=s+r;
    n=n/10;
}
System.out.println("Sum of digits:"+ s);
    }
}0
