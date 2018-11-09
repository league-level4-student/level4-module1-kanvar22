package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
public static void main(String[] args) {
	horoscope(Zodiac.ARIES);
	horoscope(Zodiac.TAURUS);
	horoscope(Zodiac.GEMINI);
	horoscope(Zodiac.CANCER);
	horoscope(Zodiac.LEO);
	horoscope(Zodiac.LIBRA);
	horoscope(Zodiac.SCORPIO);
	horoscope(Zodiac.SAGITTARIUS);
	horoscope(Zodiac.CAPRICORN);
	horoscope(Zodiac.AQUARIUS);
	horoscope(Zodiac.PISCES);
	horoscope(Zodiac.VIRGO);
}
	
	static void horoscope (Zodiac z) {
		switch(z) {
			case ARIES:{
				JOptionPane.showMessageDialog(null, "You will die early");
				break;
			}
			case TAURUS:{
				JOptionPane.showMessageDialog(null, "You will get married at the age 16");
				break;
			}
			case GEMINI:{
				JOptionPane.showMessageDialog(null, "You will get married at the age 25");
				break;
			}
			case CANCER:{
				JOptionPane.showMessageDialog(null, "You will have 5 kids");
				break;
			}
			case LEO:{
				JOptionPane.showMessageDialog(null, "You will die at an early age");
				break;
			}
			case VIRGO:{
				JOptionPane.showMessageDialog(null, "You will be sucsessful");
				break;
			}
			case LIBRA:{
				JOptionPane.showMessageDialog(null, "You will become a billionaire");
				break;
			}
			case SCORPIO:{
				JOptionPane.showMessageDialog(null, "You will have back luch on your next test");
				break;
			}
			case SAGITTARIUS:{
				JOptionPane.showMessageDialog(null, "You will never get into college");
				break;
			}
			case CAPRICORN:{
				JOptionPane.showMessageDialog(null, "You will get onto the Golden State Warriors basktball team");
				break;
			}
			case AQUARIUS:{
				JOptionPane.showMessageDialog(null, "You will drink hot chocolate some time in your future");
				break;
			}
			case PISCES:{
				JOptionPane.showMessageDialog(null, "You will go to Chipotle in 2 days");
				break;
			}
	}
	}
	// 3. Make a main method to test your method
	
}
