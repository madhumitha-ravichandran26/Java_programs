import java.awt.*;
import java.applet.*;
public class flower extends Applet 
{
public void paint (Graphics page)
{
float r,g,b;
int x1, y1, x2, y2;
setSize (640,480);
setBackground (Color.black);
Color c = new Color ( (float) 0.0, (float) 0.4, (float) 0.0);
page.setColor (c);
for ( y2 = 0; y2 < 480; y2 = y2 + 10){
page.drawLine ( 1, y2, 639, y2);
} 
for ( x2 = 0; x2 < 640; x2 = x2 + 10)
{
page.drawLine ( x2, 1, x2, 479);
} 
c = new Color ( (float) 0.6, (float) 0.0, (float) 0.0);
page.setColor (c);
page.drawRect (0,0,639,479);
page.drawString ("A flower", 10, 440);
} 
} 
/*<applet code="flower.class" width=640 height=480>
</applet>*/