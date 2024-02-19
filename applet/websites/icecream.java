import java.awt.*;
import java.applet.*;
public class icecream extends Applet 
{
Image picture;
public void init()
{
setBackground(Color.pink);
setForeground(Color.black);
String colorName = "Black";
picture = getImage(getDocumentBase(), "icecream.jpg");
setFont(new Font ( "Helvetica" , Font.BOLD, 13));
Label l1=new Label("IBACO ICECREAMS", Label.CENTER);
add(l1);
}
public void paint( Graphics g)
{
g.drawImage(picture,110,200,this);
int width=picture.getWidth(this);
int height=picture.getHeight(this);
g.drawImage(picture,width/2,height*2,this);

g.drawOval(250,79,250,79);
g.drawString("PICK YOUR FAVOURITE ICECREAM",270,124);

g.drawRect(20,70,120,70);
g.drawString("ENJOY YOUR DAY",25,120);

g.drawRect(240,220,240,220);
g.drawString("ALL FLAVOURS ARE AVAILABLE!",240,200);

g.drawString("* vanilla",290,290);
g.drawString("* chocolate",290,310);
g.drawString("* pista",290,330);
g.drawString("* strawberry",290,350);
g.drawString("* blackcurrent",290,370);
g.drawString("* butterscotch",290,390);

g.drawOval(40,170,170,40);
g.drawString("50%offer",90,200);
g.drawString("Phone-9488493257",200,470);
g.drawString("Plot-9,Laxmi complex,Anna main road,Madurai-6",100,487);
}
}

/*<APPLET Code="icecream.class" Width=500 Height=500>
</APPLET>*/
