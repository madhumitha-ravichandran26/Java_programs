import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<APPLET Code="form" Width=500 Height=500>
</APPLET>
*/
public class form extends Applet implements ActionListener
{
Label head=new Label("APPLICATION FORM",Label.CENTER);
String name=" ",email=" ",gender=" ",profession=" ",date=" ",age=" ",city=" ",experience=" ";
Label Chag=new Label("Gender:");
CheckboxGroup gen = new CheckboxGroup ( );
Checkbox chkm = new Checkbox("Male",gen,false);
Checkbox chkf = new Checkbox("Female",gen,false); 
Checkbox chko = new Checkbox("Other",gen,false);

Label lblName = new Label("Name:");
TextField txtName = new TextField(20);
Label lblEmail  = new Label("Email:");
TextField txtEmail = new TextField(15);
Label lblDate = new Label("Date of Birth:");
TextField txtDate = new TextField(10);

Label lblAge = new Label("Age:");
Choice a=new Choice();

Label lblCity = new Label("City:");
Choice ci=new Choice();

Label Char = new Label("Profession:");
Choice pro=new Choice();

Label ex = new Label("Are you experienced?");
CheckboxGroup exp = new CheckboxGroup ( );
Checkbox yes = new Checkbox("Already Experienced",exp,false); 
Checkbox no = new Checkbox("Not yet Experienced",exp,false);

Button btnSubmit= new Button("Submit");

 public void init( )
 {  
setFont(new Font ( "Verdana", Font.BOLD, 18));
add(head);    
add(lblName);                
add(txtName);   
add(lblEmail);
add(txtEmail);   
add(lblDate);                
add(txtDate); 
add(Char);  
pro.add("SELECT"); 
pro.add("Student");
pro.add("Teacher"); 
pro.add("Employee");
pro.add("Designer");
pro.add("Engineer");
pro.add("Programmer");
pro.add("Developper");
add(pro);
add(Chag);  
add(chkm);                
add(chkf);                
add(chko);   
add(lblAge);
a.add("SELECT"); 
a.add("18 to 20");                
a.add("21 to 30");                
a.add("31 to 40");
a.add("41 to 50");
a.add("51 to 60");
a.add("61 to 70");
add(a);  
add(lblCity);
ci.add("SELECT"); 
ci.add("madurai");                
ci.add("chennai");                
ci.add("bangalore");
ci.add("coimbatore");
ci.add("hyderabad");
ci.add("mumbai");
ci.add("thiruvanandapuram");
ci.add("delhi");
add(ci);
add(ex);
add(yes);
add(no);
add(btnSubmit);
btnSubmit.addActionListener(this);
}

public void paint(Graphics g)
{
g.drawString("Name:"+name,20,320);
g.drawString("Age:"+age,20,340);
g.drawString("Date of Birth:"+date,20,360);
g.drawString("Gender:"+gender,20,380);
g.drawString("Email Address:"+email,20,400);
g.drawString("City:"+city,20,420);
g.drawString("Experience:"+experience,20,440);
g.drawString("Profession:"+profession,20,460);
}

public void actionPerformed(ActionEvent ae) 
{
name=txtName.getText();
email=txtEmail.getText();
date =txtDate.getText();
age=a.getSelectedItem();
gender=gen.getSelectedCheckbox().getLabel();
city=ci.getSelectedItem();
profession=pro.getSelectedItem();
experience=exp.getSelectedCheckbox().getLabel();
repaint();
}
}