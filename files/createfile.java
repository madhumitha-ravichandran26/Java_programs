import java.io.File;
class createfile
{
  public static void main(String[] args) 
{
    File file = new File("madhu.docx");
    try 
{    
      boolean value = file.createNewFile();
      if (value) 
{
        System.out.println("The new file is created.");
      }
      else 
{
        System.out.println("The file already exists.");
      }
    }
    catch(Exception e)
 {
      e.getStackTrace();
    }
  }
}
