import EPack.employee;
class staff extends employee
{
        int bs;
        float pf,hra,net;
    public void get_stadata(int b,float p,float h)
    {
        bs=b;
        pf=p;
        hra=h;
    }
    public void put_stadata()
    {
        System.out.println("Basic Salary:"+bs);
        System.out.println("PF:"+pf);
        System.out.println("HRA:"+hra);
    }
    public void print_net()
    {
        net =bs+hra-pf;
        System.out.println("NET:"+net);
    }
}
class worker extends employee
{
    public int wages,hrs;
    public void get_workdata(int w,int hour)
    {
        wages=w;
        hrs=hour;
    }
    public void print_workdata()
    {
        System.out.println("Wages:"+wages);
        System.out.println("Hours:"+hrs);
        
    }
}
public class testpack 
{
public static void main(String[] args)
{
employee E=new employee();
staff S=new staff();
worker W= new worker();

E.get_data("Ramu","Management");
E.put_data();

S.get_stadata(50000,1500,2000);
S.put_stadata();
S.print_net();

W.get_workdata(500,1);
W.print_workdata();

}
}
