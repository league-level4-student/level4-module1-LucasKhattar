package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];

		// use a switch statement to do something cool for each option
		switch (choice) {
		case "Sunday":
			System.out.println("Sunday, day of the sun");
			break;
		case "Monday":
			System.out.println("Monday, the day you go back to schooll and nobody likes");
			break;
		case "Tuesday":
			System.out.println("Tuesday is taco day");
			break;
		case "Wednesday":
			System.out.println("Wednesday is hump day");
			break;
		case "Thursday":
			System.out.println("Thursday, 5he day we code");
			break;
		case "Friday":
			System.out.println("Friday, the end of the school week");
			break;
		case "Saturday":
			System.out.println("Saturday, day of fun");
		}
	}
}
