import java.io.*;
class cus
{
int id;
String name,address;
void detail()
{
System.out.println("id:"+id);
System.out.println("name:"+name);
System.out.println("address:"+address);
}
}
class bill extends cus
{
int u;
void units()
{
System.out.println("units:"+u);
}
void cal()
{
double bill;
if (u<100)
bill=u*1.20;
else if (u<=300)
bill=u*2.20;
else
bill=u*4.20;
System.out.println("Electricity Bill:"+bill);
}
}
class electricity
{
public static void main(String args[])
{
bill ob=new bill();
ob.name="Ramya";
ob.id=10001;
ob.address="Trichy";
ob.u=50;
System.out.println();
ob.detail();
ob.units();
ob.cal();
}}