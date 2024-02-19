import java.io.*;
class number extends Thread
{
 public void run()
 {
  int i=0,n=10,m=4;
  try
  {
while(i<=10)
{
n=i*m;
System.out.println(+m+"x"+i+"="+n);
i=i+1;
System.out.println(i);
    Thread.sleep(1000);
   } 
  }
  catch(InterruptedException e)
  {
   System.out.println(e);
  }
 }
}
class multiples
{
 public static void main(String args[])
 {
  number nob=new number();
  nob.start();
 }
}