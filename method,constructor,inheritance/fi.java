import java.io.*;
public class fi
{
public static void main(String[] args) throws IOException
{
int investment,year;
double rate;
DataInputStream ob=new DataInputStream (System.in);
System.out.print("Enter the investment amount: ");
investment=Integer.parseInt(ob.readLine());
System.out.print("Enter the rate of interest: ");
rate=Double.parseDouble(ob.readLine());
System.out.print("Enter the number of years: ");
year=Integer.parseInt(ob.readLine());
rate *= 0.01;
System.out.println("Years    FutureValue");
for(int i = 1; i <= year; i++)
{
int formatter = 19;
if (i >= 10) formatter = 18;
System.out.printf(i + "%"+formatter+".2f\n", futureInvestmentValue(investment, rate/12, i));
}
}
public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) 
{
return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
}
}