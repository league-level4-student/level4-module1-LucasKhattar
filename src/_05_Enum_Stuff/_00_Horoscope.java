package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	public static void main(String[] args) {
		
	}
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	void zodiacGetter(enum Zodiac) {
		String number = JOptionPane.showInputDialog(null, "Give Me A Number 1 - 12 And I Will Tell Your Fourtune...");
		int num = Integer.parseInt(number);
		switch(num) {
		case 1:{
			Zodiac
		}
		}
	}
	// 3. Make a main method to test your method
	
}
