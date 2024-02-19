import java.awt.*;
import java.applet.*;
public class testapp extends Applet {
    String r,n,a,sentence;
    public void init()
    {
        r=getParameter("rollno");
        n=getParameter("sname");
        a=getParameter("age");
        int ag;
        ag=Integer.parseInt(a)+1;
        sentence=r+"Hello "+n+String.valueOf(ag);
    }
    public void paint(Graphics g)
    {
        g.drawString(sentence,50,60);
    }
}
