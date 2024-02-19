class member
{
    String name,address;
    int age,salary;
    long phone;
    public void printsalary()
    {
        System.out.println("Salary:" + salary);
    }
}
class employee extends member
{
    public void print_spe(String spe)
    {
        System.out.println("Specialization:" + spe);
    }
}
class manager extends member
{
    public void print_dept(String dept)
    {
        System.out.println("Department:" + dept);
    }
}
public class testint2 {
    public static void main(String [] args)
    {
        employee e=new employee();
        e.name="ammu";
        e.age=28;
        e.phone=8123456;
        e.address="madurai";
        e.salary=50000;

        System.out.println("Name:"+e.name);
        System.out.println("Age:"+e.age);
        System.out.println("Phone-no:"+e.phone);
        System.out.println("Address:"+e.address);
        e.printsalary();
        e.print_spe("analyst");
        

        manager m=new manager();
        m.name="vikram";
        m.age=31;
        m.phone=987654;
        m.address="bangalore";
        m.salary=100000;
        System.out.println("Name:"+m.name);
        System.out.println("Age:"+m.age);
        System.out.println("Phone-no:"+m.phone);
        System.out.println("Address:"+m.address);
        
        m.printsalary();
        m.print_dept("development");

        
    }
}