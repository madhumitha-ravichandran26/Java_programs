class Parent{
    public void print_parent()
    {
        System.out.println("this is parent class");
    }
}
class Child extends Parent{
    public void print_child()
    {
        System.out.println("this is child class");
    }
}

public class testint1 {
    public static void main(String [] args)
    {
        Parent p =new Parent();
        p.print_parent();
        Child c = new Child();
        c.print_child();
        c.print_parent();
    }
}
