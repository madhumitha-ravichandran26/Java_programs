class stringex
{
   public static void main(String args[])
   {
      try
{
	 String str="Hello Everyone";
	 System.out.println(str.length());;
	 char c = str.charAt(0);
	 c = str.charAt(88);
	 System.out.println(c);
      }
catch(StringIndexOutOfBoundsException e)
{
	  System.out.println("StringIndexOutOfBoundsException!!");
       }
   }
}
