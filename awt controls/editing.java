import java.awt.*;
import java.awt.event.*;

public class editing extends Frame implements ActionListener
{
  Menu program, file;
  public editing()
  {			
    MenuBar mb = new MenuBar();
    setMenuBar(mb);		        
    program = new Menu("Program");		 
    file = new Menu("File");	

    mb.add(program);				
    mb.add(file);

    program.addActionListener(this);		
    file.addActionListener(this);

    program.add(new MenuItem("C"));
    program.add(new MenuItem("C++"));
    program.add(new MenuItem("HTML"));	
    program.add(new MenuItem("JAVA"));
    program.add(new MenuItem("PYTHON"));
    program.add(new MenuItem("SQL"));

    file.add(new MenuItem("New"));
    file.add(new MenuItem("Open"));
    file.add(new MenuItem("Save"));			
    file.add(new MenuItem("Save As"));
    file.add(new MenuItem("Print"));
    file.add(new MenuItem("Close"));
setTitle("MENU PROGRAM");
setSize(300,300);
setVisible(true);
  }
  public void actionPerformed(ActionEvent ae)
  {
    String str = ae.getActionCommand();		
    System.out.println("You selected " + str);
  }
public static void main(String[] args)
 {    
    new editing();    
}     
}