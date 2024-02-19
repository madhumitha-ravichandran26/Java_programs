import java.io.FileReader;
class readfile 
{
  public static void main(String[] args)
 {

    char[] array = new char[100];
    try 
{     
      FileReader input = new FileReader("madhu.docx");
      input.read(array);
      System.out.println("File's Data:");
      System.out.println(array);
     input.close();
    }
    catch(Exception e) 
{
      e.getStackTrace();
    }
  }
}
