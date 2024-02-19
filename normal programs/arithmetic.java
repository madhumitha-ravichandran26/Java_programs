import java.util.Scanner;
class arithmetic {
   public static void main(String[] args) 
{
     Scanner in = new Scanner(System.in);
     System.out.println("Enter first number :");
     int a = in.nextInt();
     System.out.println("Enter second number :");
     int b = in.nextInt();
        
     int c = a+b;
     int d= a-b;
     int e =a*b;
     int f= a/b;
     int g= a%b;

     System.out.println("Sum : "         + c);
     System.out.println("Difference : " + d);
     System.out.println("Product : "    + e);
     System.out.println("Quotient : "   + f);
     System.out.println("Modulo : "     + g);
    }
}