import java.awt.*;  
import java.awt.event.*;  
public class diaex 
{  
    private static Dialog d;  
    diaex () 
{  
        Frame f= new Frame();  
        d = new Dialog(f , "Alert Page", true);  
        d.setLayout( new FlowLayout() );  
        Label l = new Label ("PLEASE BE ALERT!");  
        d.add(l);   
        d.setSize(300,300);    
        d.setVisible(true);  
    }  
    public static void main(String args[])  
    {  
        new diaex ();  
    }  
}  