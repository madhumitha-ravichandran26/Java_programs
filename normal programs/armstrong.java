import java.io.*;
class armstrong 
{
public static void main(String[] args)throws IOException
 {
int low,high,digits,result,originalNumber,number,remainder;
System.out.println("\n\t Enter the low Number:\t");
DataInputStream ob=new DataInputStream(System.in);
low=Integer.parseInt(ob.readLine());   
System.out.println("\n\t Enter the high Number:\t");
high=Integer.parseInt(ob.readLine());   
for(number = low + 1; number < high; ++number) 
{
originalNumber = number;
digits = 0;
result = 0;
while (originalNumber != 0) 
{
originalNumber /= 10;
digits++;
}
originalNumber = number;
while (originalNumber != 0)
{
remainder = originalNumber % 10;
result += Math.pow(remainder, digits);
originalNumber /= 10;
}
if (result == number)
System.out.println("The armstrong number is :"+number);
}
}
}