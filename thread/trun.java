import java.io.*;
import java.lang.*;
class odd implements Runnable
{
 public void run()
 {
  try
  {
   int i;
   for(i=1;i<=20;i++)
   {
    if(i%2!=0)
    {
     System.out.println("ODD:"+i);
     Thread.sleep(1000);
    }
   }
  }
  catch(InterruptedException e)
  {
  }
 }
}
class even implements Runnable
{
 public void run()
 {
  try
  {
   int i;
   for(i=1;i<20;i++)
   {
    if(i%2==0)
    {
     System.out.println("EVEN:"+i);
     Thread.sleep(1000);
    }
   }
  }
  catch(InterruptedException e)
  {
  }
 }
}
class trun
{
 public static void main(String args[])
 {
  odd o=new odd();
  Thread t=new Thread(o);
  t.start();
  even e1=new even();
  Thread t1=new Thread(e1);
  t1.start();
 }
}