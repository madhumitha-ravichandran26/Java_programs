import java.util.Scanner;
class biggest
{
private static Scanner sc;
public static void main(String[] args) 
{
int m,n;
sc = new Scanner(System.in);
System.out.print("Enter the value of m : ");
m = sc.nextInt();	
System.out.print("Enter the  value of  n: ");
n = sc.nextInt();	
if(m > n) 
{
System.out.println("The Largest Number is " + m);          
} 
else 
{ 
System.out.println("\n The Largest Number is " + n);        
} 
}	
}