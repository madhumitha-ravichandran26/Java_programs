import java.io.*;
class cricket
{
String name,team;
void player()
{
System.out.println("name:"+name);
System.out.println("team:"+team);
}
}
class avg extends cricket
{
int tr;
void totalruns()
{
System.out.println("total runs:"+tr);
}
int i;
void innings()
{
System.out.println("innings:"+i);
}
int no;
void notout()
{
System.out.println("number of times notout:"+no);
}
}

class criplayer
{
public static void main(String args[])throws IOException
{
int avg;
avg ob=new avg();
ob.name="Dhoni";
ob.team="CSK";
ob.tr=44;
ob.i=5;
ob.no=3;
ob.player();
ob.totalruns();
ob.innings();
ob.notout();
avg=ob.tr/(ob.i-ob.no);
System.out.println("Average:"+avg);
}
}