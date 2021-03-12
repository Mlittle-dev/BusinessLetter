// exersize on page 345

import javax.swing.*;

public class BuissnessLetter
{
	public static void main(String[] args)
	{
		// variable and constants
		String name;
		String firstName = "";
		String familyName = "";
		int x;
		char c;

		//input phase 
		name = JOptionPane.showInputDialog(null, "please enter customers first and last name: ");
		// calculation phase
		x = 0;
		while(x < name.length())
		{
			// keep checking every charcter in the name to see if we have found a blank space

			if(name.charAt(x) == ' ')
			{
				firstName = name.substring(0, x);
				familyName = name.substring(x + 1, name.length());
				// once the blank space is found, force the variable to the length number to stop the looping
				x = name.length();
			}
			++x;
		}

		// output phase
		JOptionPane.showMessageDialog(null, "Dear" + firstName + ",\n I am so glad we are on a first name basis because i would like the opportunity to talk to you about an affordable insurance protecting plan for the entire " + familyName + "family.\ncall a-one family insurance today at 1-800-555-9287");
	}
}