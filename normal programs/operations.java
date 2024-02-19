import java.io.*;
class operations
{
public static void main(String args[]) throws Exception
{
int a,b,c,d;
char ch;    
a= -5 + 8 * 6;
b= (55+9) % 9;
c= 20 + -3*5 / 8 ;
d= 5 + 15 / 3 * 2 - 8 % 3;
System.out.print("\n\tEnter Your Choice:\t");
ch = (char) System.in.read();
switch(ch)
{
case 'A':
{
System.out.print("Result of A:" +a);
break;
}
case 'B':
{
System.out.print("Result of B:" +b);
break;
}
case 'C':
{
System.out.print("Result of C:" +c);
break;
}
case 'D':
{
System.out.print("Result of D:" +d);
break;
}
default:
{
System.out.print("\n Wrong Choice");
break;
}
}        
}
}
