import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class SimpleKey extends Applet implements KeyListener{
        String msg=" ";
        int X = 10,Y = 20;

        public void init() {
                addKeyListener(this);
                requestFocus(); //set the input focus
        }

        public void keyPressed(KeyEvent ke) {
                showStatus("Key Down");
                      msg="Key Pressed";
        }

        public void keyReleased(KeyEvent ke) {
                showStatus("Key Up");
                 msg="Key released";
        }
        public void keyTyped(KeyEvent ke) {
                msg += ke.getKeyChar();
                repaint();
        }

        public void paint(Graphics g) {
                g.drawString(msg,X,Y);
        }
}

//<applet code="SimpleKey.class" width=300 height=100></applet>
