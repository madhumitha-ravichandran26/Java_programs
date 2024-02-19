import java.io.*;
class leapyear
{
	public static void main(String args[]) throws IOException
	{
		String n;
       
		System.out.println("\n\nEnter the Year:\t");                
		DataInputStream ob=new DataInputStream(System.in);

		n = ob.readLine();
		int leap_year = Integer.parseInt(n);
               
		if(leap_year % 4 == 0)
		{
			System.out.println("\n\tThis Year is Leap");
		}
		else
		{
			System.out.println("\n\tThis Year is not Leap");
		}
	}
}
