import java.io.*;
public class methodaverage 
{
 public static void main(String[] args)throws IOException
{
double x,y,z;
DataInputStream ob=new DataInputStream (System.in);

System.out.print("Enter the first number:\n");
x=Integer.parseInt(ob.readLine());

System.out.print("Enter the second number:\n");
y=Integer.parseInt(ob.readLine());

System.out.print("Enter the Third number:\n");
z=Integer.parseInt(ob.readLine());
       
 System.out.print("The average value is " + average(x, y, z)+"\n" );
    }

  public static double average(double x, double y, double z)
    {
        return (x + y + z) / 3;
    }
}
