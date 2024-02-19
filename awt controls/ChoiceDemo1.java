import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ChoiceDemo1 extends Applet implements ActionListener
{
        Choice names;
        TextField tf;
        Button ad,rm,ra;
        Label na,cnt;

        public void init()
        {
                setLayout(null);
                na = new Label("Enter Name : ");
                tf = new TextField(20);
                names = new Choice();
                ad = new Button("Add");
                rm = new Button("Remove");
                ra = new Button("RemoveAll");
                cnt = new Label("Count : ");

                na.setBounds(100,100,130,30);
                tf.setBounds(240,100,100,30);
                names.setBounds(100,150,100,30);
                ad.setBounds(240,150,100,30);
                rm.setBounds(240,190,100,30);
                ra.setBounds(240,230,100,30);
                cnt.setBounds(240,270,100,30);

                add(na);
                add(tf);
                add(names);
                add(ad);
                add(rm);
                add(ra);
                add(cnt);


                ad.addActionListener(this);
                rm.addActionListener(this);
                ra.addActionListener(this);
        }

        public void actionPerformed(ActionEvent ae)
        {
                String na;
                if(ae.getSource() == ad)
                {
                        na = tf.getText();
                        names.add(na);
                        tf.setText("");
                        cnt.setText("Count : " + names.getItemCount());
                }
                else if(ae.getSource() == rm)
                {
                        int index = names.getSelectedIndex();
                        names.remove(index);
                        cnt.setText("Count : " + names.getItemCount());
                }
                else if(ae.getSource() == ra)
                {
                        names.removeAll();
                        cnt.setText("Count : " + names.getItemCount());
                }
        }
}

//<applet code="ChoiceDemo1" width=400 height=400></applet>
