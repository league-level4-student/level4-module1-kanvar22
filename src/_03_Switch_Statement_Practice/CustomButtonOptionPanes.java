package _03_Switch_Statement_Practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);
			switch(input) {
			case(0):
				System.out.println("Its Sunday!");
			break;
			case(1):
				System.out.println("Its Monday!");
			break;
			case(2):
				System.out.println("Its Tuesday!");
			break;
			case(3):
				System.out.println("Its Wednessday!");
			break;
			case(4):
				System.out.println("Its Thursday!");
			break;
			case(5):
				System.out.println("Its Friday!");
			break;
			case(6):
				System.out.println("Its Saturday!");
			break;
			}
			
		
		
		//use a switch statement to do something cool for each option
		
	}
}
