import java.io.*;
class shapes
{
shapes(int l,int b)
    {
       System.out.println("Area of Rectangle:");
        int aos1=l*b; 
        System.out.println(+aos1);
    }
shapes(int a)
    {
        System.out.println("Area of Square:");
        int aos2=a*a; 
        System.out.println(+aos2);
    }
shapes(double p,double r)
    {
        System.out.println("Area of Circle:");
        double aos3=p*r*r; 
        System.out.println(+aos3);
    }
shapes(double t,double w,double h)
    {
        System.out.println("Area of Triangle:");
        double aos4=t*w*h; 
        System.out.println(+aos4);
    }
public static void main(String args[])
{
shapes aos1=new shapes(2,3);
shapes aos2=new shapes(8);
shapes aos3=new shapes(3.14,2);
shapes aos4=new shapes(0.5,8,7);
}
}     
