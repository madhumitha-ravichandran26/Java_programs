import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class CBGroup extends Applet implements ItemListener {
        String msg = new String();
        Checkbox Win98,winNT,solaris,mac;
        CheckboxGroup cbg;

        public void init() {
                cbg = new CheckboxGroup();
                Win98 = new Checkbox("Windows 98",cbg,true);
                winNT = new Checkbox("Windows NT/2000",cbg,false);
                solaris = new Checkbox("Solaris",cbg,false);
                mac = new Checkbox("MacOS",cbg,false);

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
                msg = "Current Selection: ";
                msg += cbg.getSelectedCheckbox().getLabel();
                g.drawString(msg,6,100);
        }
}

//<applet code="CBGroup.class" width=500 height=500></applet>
