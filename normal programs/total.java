import java.io.*;
class total
{
public static void main(String args[]) throws IOException
{
int first_no,sec_no,result;
DataInputStream in=new DataInputStream(System.in);
first_no=Integer.parseInt(in.readLine());
sec_no=Integer.parseInt(in.readLine());
result=first_no+sec_no;
System.out.println(result);
}
}
