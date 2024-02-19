import java.io.*;
class swi
{
public static void main(String args[]) throws IOException
{
char ch;    
 System.out.print("\n\tA. Red");
System.out.print("\n\tB. Blue");
System.out.print("\n\tC. Yellow");
System.out.print("\n\tEnter Your Choice (A-C) :\t");
DataInputStream ob=new DataInputStream(System.in);
ch = (char) System.in.read();
switch(ch)
{
case 'A':
{
System.out.print("\n\tYour Choice is Red\n\n");
break;
}
case 'B':
{
System.out.print("\n\tYour Choice is Blue\n\n");
break;
}
case 'C':
{
System.out.print("\n\tYour Choice is Yellow\n\n");
break;
}
default:
{
System.out.print("\n\tYour Choide is Wrong...\n\n");
break;
}
}        
}
}
