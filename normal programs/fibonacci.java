import java.util.Scanner;
class fibonacci 
{
public static void main(String args[]) 
{
Scanner sc= new Scanner(System.in);
int a,b,c,i,n;
a=-1,b=1;
System.out.println("Enter n value:");
n=sc.nextInt();
System.out.println("Fibonacci Series of " +n+" terms:");
for (i = 1; i <= n; i++) 
{
   c = a +b;
System.out.println(c);
   a = b;
   b = c;
    }
  }
}