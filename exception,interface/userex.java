class InvalidAgeException extends Exception{
 InvalidAgeException(String s)
{
  super(s);
 }
 public String toString()
 {
  return "Not eligible to vote.";
 }
}
class userex
{
   static void validate(int age) throws InvalidAgeException{
     if(age >=18)
         System.out.println("welcome to vote"); 
     else
        throw new InvalidAgeException("invalid candidate");
   }
   public static void main(String args[]){
      try{
        validate(15);
      }
catch(Exception ex)
{
         System.out.println("Exception occured: "+ex);
      }
  }
}