import java.io.*;
class student
{
String name;
int rgn;
String course;
student()
    {
        name="Sita";
        rgn=67;     
        course="English";   
    }
student(String str,int n,String c)
    {
        name=str;
        rgn=n;     
        course=c;   
    }
public static void main(String args[])
{
student s1=new student();
 student s2=new student("Madhu",22,"Computer"); 
 student s3=new student("Yamini",45,"Mathematics");
student s4=new student("Raksha",86,"Physics");
student s5=new student("Neha",53,"Chemistry");

System.out.println(s1.name);
System.out.println(s1.rgn);
System.out.println(s1.course);
System.out.println(  );
System.out.println(s2.name);
System.out.println(s2.rgn);
System.out.println(s2.course);
System.out.println(  );
System.out.println(s3.name);
System.out.println(s3.rgn);
System.out.println(s3.course);
System.out.println(  );
System.out.println(s4.name);
System.out.println(s4.rgn);
System.out.println(s4.course);
System.out.println(  );
System.out.println(s5.name);
System.out.println(s5.rgn);
System.out.println(s5.course);
} 
}