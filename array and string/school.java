import java.io.*;
class student
{
String name;
int m1,m2,m3,total;
float average;

void get() throws IOException
{
DataInputStream in =new DataInputStream(System.in);
System.out.println("enter name");
name=in.readLine();
System.out.println("enter marks");
m1=Integer.parseInt(in.readLine());
m2=Integer.parseInt(in.readLine());
m3=Integer.parseInt(in.readLine());
}

void cal()
{
total=m1+m2+m3;
average=total/3;
}

void display()
{
System.out.println("name\ttotal\tmarks");
System.out.println(name+"\t"+total+"\t"+average);
}
}
class school
{
public static void main(String args[]) throws IOException
{
int i,n,c;
DataInputStream in =new DataInputStream(System.in);
student s[]=new student[10];
System.out.println("enter limit");
n=Integer.parseInt(in.readLine());
for(i=0;i<n;i++)
{
s[i]=new student();
s[i].get();
s[i].cal();
}
for(i=0;i<n;i++)
{

s[i].display();

}
do
{
System.out.println("display toppers list");
System.out.println("enter option");
c=Integer.parseInt(in.readLine());

switch(c)
{
case 1:
for(i=0;i<n;i++)
{
if(s[i].average>=90)
s[i].display();
}
break;
	
}
}while(c<=1); 	


}
}
