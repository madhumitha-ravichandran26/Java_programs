import java.lang.Thread;
class A
{
public void start()
{
for (int i=0;i<10;i++)
{
System.out.println("Class A "+i);
}
System.out.println("Class A ends.");
}
}
class B
{
public void start()
{
for (int i=0;i<10;i++)
{
System.out.println("Class B "+i);
}
System.out.println("Class B ends.");
}
}
class test_thread
{
public static void main(String args[])
{
A a= new A();
B b=new B();
a.start();
b.start();
}
}