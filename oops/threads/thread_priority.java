class A extends Thread
{
public void run()
{
for (int i=1;i<=4;i++)
{
System.out.println("Class A "+i);
}
System.out.println("Class A ends.");
}
}

class B extends Thread
{
public void run()
{
for (int j=1;j<=4;j++)
{
System.out.println("Class B "+j);
}
System.out.println("Class B ends.");
}
}

class C extends Thread
{
public void run()
{
for (int k=1;k<=4;k++)
{
System.out.println("Class C "+k);
}
System.out.println("Class C ends.");
}
}

class thread_priority
{
public static void main(String args[])
{
A a= new A();
B b=new B();
C c=new C();
c.setPriority(Thread.MAX_PRIORITY);
b.setPriority(a.getPriority()+1);
a.setPriority(Thread.MIN_PRIORITY);
System.out.println("start thread A");
a.start();
System.out.println("start thread B");
b.start();
System.out.println("start thread C");
c.start();
}
}