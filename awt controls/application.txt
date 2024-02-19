import java.awt.*;
import java.applet.*;
/*
<APPLET Code="application" Width=1000 Height=500>
</APPLET>
*/
public class application extends Applet
{
 public void init( )
 {
CheckboxGroup rad = new CheckboxGroup ( );
CheckboxGroup gen = new CheckboxGroup ( );

  Label bu,lab,la,lblName,lblPhone,lblDate,Char,Chag;
    Button btnSubmit;
    Checkbox chkstu,chktea,chkemp,chkm,chkf,chko;

                Font f1=new Font("New Times Roman",Font.BOLD,22);
                Font f2=new Font("New Times Roman",Font.BOLD|Font.ITALIC,20); 
                bu = new Label("Click here to submit");
                btnSubmit = new Button("Submit");
                bu.setFont(f1);
                btnSubmit.setFont(f2);

setFont(new Font ( "Helvetica" , Font.BOLD, 24));
lab = new Label("APPLICATION FORM", Label.CENTER);
la = new Label("          ");
setFont(new Font ( "Verdana" , Font.BOLD|Font.ITALIC, 24));
  
lblName = new Label("Name:");
lblPhone  = new Label("Phone:");
lblDate = new Label("Date of Birth:");
TextField txtName = new TextField(20);
TextField txtPhone = new TextField(12);
TextField txtDate = new TextField(12);

                Char = new Label("Profession:");
                chkstu = new Checkbox("Student",rad, true);
                chktea = new Checkbox("Teacher",rad,false); 
                chkemp = new Checkbox("Employee",rad,false);

                 Chag=new Label("Gender:");
                chkm = new Checkbox("Male",gen, false);
                chkf = new Checkbox("Female",gen,true); 
                chko = new Checkbox("Other",gen,false);
add(lab); 

add(la);    
add(lblName);                
add(txtName); 

add(la);            
add(lblPhone);
add(txtPhone);   

add(la);     
add(lblDate);                
add(txtDate); 

add(la);   
add(Char);  
add(chkstu);                
add(chktea);                
add(chkemp);  
 
add(la);  
add(Chag);  
add(chkm);                
add(chkf);                
add(chko);   

add(bu);
add(btnSubmit);
}
}