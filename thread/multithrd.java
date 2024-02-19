import java.io.*;
class m1 extends Thread
{
 public void run()
 {
  try
  {
  for(int i=1;i<=5;i++)
  {
    System.out.println("TABLE--2");
    System.out.println(i+"*"+2+"="+i*2);
    Thread.sleep(1000);
  }
  }
  catch(InterruptedException e)
  {
  }
 }
}
class m2 extends Thread
{
 public void run()
 {
  try
  {
  for(int i=1;i<=5;i++)
  {
   System.out.println("TABLE--5");
   System.out.println(i+"*"+5+"="+i*5);
   Thread.sleep(1000);
  }
 }
 catch(InterruptedException e)
 {
 }
 }
}
class m3 extends Thread
{
 public void run()
 {
  try
  {
  for(int i=1;i<=5;i++)
  {
   System.out.println("TABLE--10");
   System.out.println(i+"*"+10+"="+i*10);
   Thread.sleep(1000);
  }
  }
  catch(InterruptedException e)
  {
  }
 }
}
class multithrd
{
 public static void main(String s[])
 {
  new m1().start();
  new m2().start();
  new m3().start();
 }
}