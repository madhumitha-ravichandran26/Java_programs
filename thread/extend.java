import java.io.*;
class fibo extends Thread
{
 public void run()
 {
  try
  {
    System.out.println(Thread.currentThread());
    int fact=1;
    int f=1,i;
    for(i=1;i<=5;i++)
    {
      f=f*i;
      System.out.println("factorial value" +f);
      Thread.sleep(500);
     }
   }
   catch(InterruptedException e)
   {
   }
  }
}
 class extend
 {
  public static void main(String args[])
  {
    fibo f=new fibo();
    f.start();
  }
}