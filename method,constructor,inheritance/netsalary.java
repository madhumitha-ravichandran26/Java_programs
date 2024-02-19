import java.io.*;
class employee
{
int id;
long phone;
String name,address;
void detail()
{
System.out.println("id:"+id);
System.out.println("name:"+name);
System.out.println("phone:"+phone);
System.out.println("address:"+address);
}
}
class esal extends employee
{
int salary;
void sal()
{
System.out.println("salary:"+salary);
}
}
class netsalary
{
public static void main(String args[])
{
double hra,da,pf,net;
int sal;
esal ob=new esal();
ob.name="Hema";
ob.id=10000;
ob.phone=94567031;
ob.address="Chennai";
ob.salary=25000;
ob.detail();
ob.sal();
hra=0.03*ob.salary;
da=0.04*ob.salary;
pf=0.05*ob.salary;
net=hra+da+pf+ob.salary;
System.out.println("net salary:"+net);
}
}