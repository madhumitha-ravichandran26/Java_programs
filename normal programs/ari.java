import java.io.*;
class ari
{
public static void main(String args[])throws IOException
{
int a,b,c,choice,add,sub,mul,div,mod;  
System.out.println("\n\t Enter the value of A:\t");
DataInputStream ob=new DataInputStream(System.in);
a=Integer.parseInt(ob.readLine());
System.out.println("\n\t Enter the value of B:\t");
b=Integer.parseInt(ob.readLine());

System.out.println("\n\t Enter Choice:\t");
choice=Integer.parseInt(ob.readLine());

switch(choice)
{
case 1:add = a + b;
           System.out.println("Result : "+add);
           break;
case 2:sub = a - b;
           System.out.println("Result : "+sub);
            break;
case 3:mul = a *b;
           System.out.println("Result : "+mul);
           break;
case 4:div = a / b;
            System.out.print("Result : "+div);
             break;
case 5: mod = a% b;
           System.out.println("Result : "+mod);
           break;
default:System.out.print("\n\t WRONG CHOICE\n\n");
             break;     
}
}
}