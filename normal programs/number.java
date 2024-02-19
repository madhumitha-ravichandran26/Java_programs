import java.util.Scanner;
public class number
{
    public static void main(String[] args) 
    {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number:");
        num = scan.nextInt();
        scan.close();
        if(num > 0)
        {
            System.out.println(num+" is positive number");
        }
        else 
        {
            System.out.println(num+" is negative number");
        }
   }
}