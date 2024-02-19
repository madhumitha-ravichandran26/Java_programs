import java.awt.*;
import java.applet.*;
public class jewellery extends Applet 
{
Image picture;
public void init()
{
setBackground(Color.yellow);
setForeground(Color.black);
String colorName = "Black";
picture = getImage(getDocumentBase(), "icecream. jpg");
setFont(new Font ( "Helvetica" , Font.BOLD, 13));
Label l1=new Label("LALITHA JEWELLERY", Label.CENTER);
add(l1);
}
public void paint(Graphics g)
{
g.drawImage(picture,50,50,this);
g.drawOval(250,79,250,79);
g.drawString("EXCITING SUMMER OFFER",275,124);

g.drawRect(20,70,120,70);
g.drawString("ENJOY YOUR DAY",25,120);

g.drawRect(230,210,230,210);
g.drawString("SELECT YOUR FAVOURITE JEWEL!",240,200);

g.drawString("* gold",290,290);
g.drawString("* silver",290,310);
g.drawString("* diamond",290,330);
g.drawString("* platinum",290,350);


g.drawOval(40,170,170,40);
g.drawString("50%offer",90,200);
g.drawString("Phone-9488493257",200,470);
g.drawString("Plot-4,West Masi street,Anna main road,Madurai-6",100,487);
}
}

/*<APPLET Code="jewellery.class" Width=500 Height=500>
</APPLET>*/
