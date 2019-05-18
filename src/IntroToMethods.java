import javax.swing.JOptionPane;

public class IntroToMethods {

	public static void main(String[] args) {

		weRock();
		rocker();
		truth();
		echo();
		repeat();
		theBest();
		sum();

	}

	private static void weRock() {

		System.out.println("The League Rocks");

	}

	private static void rocker() {

		String name = JOptionPane.showInputDialog("What is your name?");
		System.out.println(name + " rocks.");

	}

	private static void truth() {

		String robthomas = JOptionPane.showInputDialog(null, "Enter a name...");

		if (robthomas.equalsIgnoreCase("Justin Bieber")) {
			System.out.println(robthomas + " is annoying.");
		}

		else {
			System.out.println(robthomas + " is awesome.");
		}
	}

	private static void echo() {

		String echo = JOptionPane.showInputDialog("Enter any text you want...");
		System.out.println(echo + " " + echo);

	}

	private static void repeat() {

		String repeat = JOptionPane.showInputDialog("Enter any text you want...");
		String repeatnumber = JOptionPane.showInputDialog("Enter a number from 1-10.");
		int repeatstring = Integer.parseInt(repeatnumber);
		for (int i = 0; i < repeatstring; i++) {
			System.out.print(repeat + " ");
		}
		System.out.println();
	}

	private static void theBest() {

		System.out.println("James Gosling");

	}

	private static void sum() {

		String numberonestring = JOptionPane.showInputDialog("Enter a number...");
		String numbertwostring = JOptionPane.showInputDialog("Enter one more number...");
		int numberoneint = Integer.parseInt(numberonestring);
		int numbertwoint = Integer.parseInt(numbertwostring);
		int sum = numberoneint + numbertwoint;
		System.out.println(sum);

	}
}