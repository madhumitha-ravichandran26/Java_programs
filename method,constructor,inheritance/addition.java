import java.io.*;
class addition
{
addition(int a,int b)
    {
        int a1=a+b; 
        System.out.println(+a1);
    }
addition(int a,int b,int c)
    {
        int a2=a+b+c; 
        System.out.println(+a2);
    }
addition(int a,int b,int c,int d)
    {
        int a3=a+b+c+d; 
        System.out.println(+a3);
    }
public static void main(String args[])
{
addition a1=new addition(2,3);
addition a2=new addition(4,6,8);
addition a3=new addition(1,7,9,5);
}
}     