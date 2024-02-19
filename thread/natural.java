import java.io.*;
class number extends Thread
{
 public void run()
 {
  int i,n=10;
  try
  {
   for(i=1;i<=n;i++)
   {
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
class natural
{
 public static void main(String args[])
 {
  number nob=new number();
  nob.start();
 }
}