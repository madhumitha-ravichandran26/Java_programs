import java.io.*;
class numfi implements Runnable
{
 public void run()
 {
  try
  {
    int a=-1;
    int b=1;
    int n=5,i;
    for(i=0;i<=n;i++)
    {
      int c=a+b;
      System.out.println("Fibonacci series" +c);
      a=b;
      b=c;
      Thread.sleep(500);
     }
   }
   catch(InterruptedException e)
   {
   }
  }
}
class fibonacci
 {
  public static void main(String args[])
  {
    numfi f=new numfi();
    Thread t=new Thread(f);
    t.start();
  }
}