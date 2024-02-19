package EPack;
public class employee {
    public String name,dept;
    public void get_data(String n, String d)
    {
        name=n;
        dept=d;
    }
    public void put_data()
    {
        System.out.println("Name:"+name);
        System.out.println("Department:"+dept);
    }
}
