import java.awt.*;
import java.applet.*;

/*
<APPLET Code="RadioButton" Width=500 Height=200>
</APPLET>
*/

public class RadioButton extends Applet 
{
	public void init( )
	{
		CheckboxGroup chkgrp = new CheckboxGroup ( );

		Checkbox chkRed,chkBlue,chkYellow,chkGreen,chkOrange;

		chkRed = new Checkbox("Red", chkgrp, false);                
		chkBlue = new Checkbox("Blue", chkgrp, false);
		chkYellow = new Checkbox("Yellow", chkgrp, false);
		chkGreen = new Checkbox("Green", chkgrp, true);
		chkOrange = new Checkbox("Orange", chkgrp, false);

		add(chkRed);
		add(chkBlue);                
		add(chkYellow);                
		add(chkGreen);                
		add(chkOrange);
	}
}