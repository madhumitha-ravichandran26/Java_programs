import java.util.Scanner;
class student{
    private String rollno,name;
    Scanner sc= new Scanner(System.in);

    public void get_data()
    {
        rollno=sc.nextLine();
        name=sc.nextLine();
    }
    public void print_data()
    {
        System.out.println("Roll-no:"+ rollno);
        System.out.println("Name:"+ name);
    }
}
class academics extends student{
int t1_marks,t2_marks,q1_marks,q2_marks;
public void get_marks()
{
t1_marks=sc.nextInt();
t2_marks=sc.nextInt();
q1_marks=sc.nextInt();
q2_marks=sc.nextInt();
}
public void print_marks()
{
System.out.println("Test-1:"+ t1_marks);
System.out.println("Test-2:"+ t2_marks);
System.out.println("Quiz-1:"+ q1_marks);
System.out.println("Quiz-2:"+ q2_marks);
}
}
class extracuricular extends academics{
    int sports_score,cultural;
    public void get_eca()
    {
        sports_score=sc.nextInt();
        cultural=sc.nextInt();
    }
    public void put_eca()
    {
        System.out.println("Sports score:"+ sports_score);
        System.out.println("Cultural score:"+ cultural);
    }
}
class stud_inherit{
    public static void main(String[] args) 
    {
        extracuricular e = new extracuricular();
        e.get_data();
        e.print_data();
        e.get_marks();
        e.print_marks();
        e.get_eca();
        e.put_eca();
    }
}