import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<APPLET Code="flower" Width=500 Height=500>
</APPLET>
*/
public class flower extends Applet implements ActionListener
{
String name=" ",email=" ",flower=" ",account=" ",address=" ",phone=" ";
Image picture;
Label head = new Label("BLOSSOMS BOUQUET SHOP",Label.CENTER);
Label lblName = new Label("Name:");
TextField txtName = new TextField(20);
Label lblPhone  = new Label("Phone:");
TextField txtPhone = new TextField(10);
Label lblEmail  = new Label("Email:");
TextField txtEmail = new TextField(15);
Label lblAcc = new Label("Account Number:");
TextField txtAcc = new TextField(10);
Label lblAdd = new Label("Address to be delivered:");
TextField txtAdd = new TextField(9);
Label lblflo = new Label("Flower:");
Choice f=new Choice();
Button btnSubmit= new Button("Submit");
public void init( )
{  
picture = getImage(getDocumentBase(),"flowerbouquet.jpeg");  
setFont(new Font ( "Verdana", Font.BOLD, 18));
add(head);    
add(lblName);                
add(txtName);  
add(lblPhone);
add(txtPhone);    
add(lblEmail);
add(txtEmail);   
add(lblAcc);                
add(txtAcc); 
add(lblAdd);                
add(txtAdd); 
add(lblflo);
f.add("SELECT"); 
f.add("rose- RS.300");                
f.add("jasmine-RS.250");                
f.add("hibiscus-RS.180");
f.add("sunflower-RS.290");
f.add("lily-RS.100");
f.add("tulip-RS.390");
f.add("poppy-RS.500");
f.add("lavender-RS.480");
f.add("orchid-RS.220");
f.add("daisy-RS.470");
add(f);
add(btnSubmit);
btnSubmit.addActionListener(this);
}
public void paint(Graphics g)
{
g.drawImage(picture, 50,50, this);  
g.drawString("Name:"+name,20,320);
g.drawString("Phone:"+phone,20,340);
g.drawString("Email:"+email,20,360);
g.drawString("Account number:"+account,20,380);
g.drawString(" Address:"+address,20,400);
g.drawString("Flower:"+flower,20,420);
}
public void actionPerformed(ActionEvent ae) 
{
name=txtName.getText();
phone=txtPhone.getText();
email=txtEmail.getText();
account=txtAcc.getText();
address =txtAdd.getText();
flower=f.getSelectedItem();
repaint();
}
}