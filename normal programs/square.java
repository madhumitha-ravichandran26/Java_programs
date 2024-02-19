import java.util.Scanner;
class square
{
    public static void main(String[] args) 
    {
        int side,area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the side:");
        side = s.nextInt();
        area = side * side;
        System.out.println("Area of square:"+area);
    }            
}