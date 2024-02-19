import java.io.FileWriter;
class writefile 
{
   public static void main(String args[]) 
{
String data = "My Document";
     try
 {
       FileWriter mad = new FileWriter("madhu.docx");
       mad.write(data);
       System.out.println("This is my word document.");
       mad.close();
 }
     catch (Exception e) 
    {
       e.getStackTrace();
     }
  }
}
