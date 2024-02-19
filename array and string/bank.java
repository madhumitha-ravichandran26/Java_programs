import java.io.*;
class employee
{
String name; 
int salary,dmoney,wmoney,deposit,withdraw,account,balance;
void get() throws IOException
{
DataInputStream in =new DataInputStream(System.in);
System.out.println("Enter Name:");
name=in.readLine();
System.out.println("Enter account Number:");
account=Integer.parseInt(in.readLine());
System.out.println("Enter Salary:");
salary=Integer.parseInt(in.readLine());
System.out.println("Enter Money to be deposited:");
dmoney=Integer.parseInt(in.readLine());
System.out.println("Enter Money to be withdrew:");
wmoney=Integer.parseInt(in.readLine());
deposit=salary+dmoney;
withdraw=salary-wmoney;
balance=salary+dmoney-wmoney;
System.out.println("The Deposited Amount:"+deposit);
System.out.println("The Withdrew Amount:"+withdraw);
System.out.println("The Balance Amount:"+balance);
}
void display()
{
System.out.println(name+"\t\t"+account+"\t\t"+salary+"\t\t"+deposit+"\t\t"+withdraw+"\t\t"+balance);
}
}
class bank
{
public static void main(String args[]) throws IOException
{
int i,n;
employee e[]=new employee[5];
DataInputStream in =new DataInputStream(System.in);
System.out.println("Enter the number of employees:");
n=Integer.parseInt(in.readLine());
for(i=0;i<n;i++)
{
e[i]=new employee();
e[i].get();
}
System.out.println("\nname\t\taccount\t\tsalary\t\tdeposit\t\twithdraw\t\tbalance\n");
for(i=0;i<n;i++)
{
e[i].display();
}
}
}