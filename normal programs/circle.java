import java.util.Scanner;
class circle
{
    public static void main(String[] args) 
    {
        int r;
        double pi = 3.14, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the radius:");
        r = s.nextInt();
        area = pi * r * r;
        System.out.println("Area of circle:"+area);
    }            
}