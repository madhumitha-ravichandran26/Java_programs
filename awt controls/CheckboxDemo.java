import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class CheckboxDemo extends Applet implements ItemListener {
        String msg = new String();
        Checkbox Win98,winNT,solaris,mac;
        public void init() {
                Win98 = new Checkbox("Windows 98",null,true);
                winNT = new Checkbox("Windows NT/2000");
                solaris = new Checkbox("Solaris");
                mac = new Checkbox("MacOS");
                add(Win98);
                add(winNT);
                add(solaris);
                add(mac);
                Win98.addItemListener(this);
                winNT.addItemListener(this);
                solaris.addItemListener(this);
                mac.addItemListener(this);
        }
       public void itemStateChanged(ItemEvent ie) {
                repaint();
        }
        public void paint(Graphics g) {
                msg = "Current state : ";
                g.drawString(msg,6,80);
                msg = "  Windows 98: " + Win98.getState();
                g.drawString(msg,6,100);
                msg = "  Windows NT/2000: " + winNT.getState();
                g.drawString(msg,6,120);
                msg = "  Solaris: " + solaris.getState();
                g.drawString(msg,6,140);
                msg = "  MacOS: " + mac.getState();
                g.drawString(msg,6,160);
        }
}
//<applet code="CheckboxDemo.class" width=300 height=200></applet>