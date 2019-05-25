import javax.swing.JOptionPane;

public class MethodsTwo {

	public static void main(String[] args) {

		findThePresent();
		doPigsEat();
		getMyLuckyNumber();
		howManyEggs();

	}

	static void findThePresent() {
		String present = JOptionPane.showInputDialog(null,
				"What present do you want for Christmas?\n\nThis is from a computer and definitely not from a human.");

		System.out.println("Your friend wants " + present + " for christmas.");
	}

	static void doPigsEat() {
		String edible = JOptionPane.showInputDialog("Enter a food that you think are edible to pigs.");
		if (edible.equalsIgnoreCase("roots")) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
	}

	static void getMyLuckyNumber() {
		String lucky = JOptionPane.showInputDialog("What is your lucky number?");
		System.out.println("The lucky number is " + lucky + ".");
	}

	static void howManyEggs() {
		String mom = JOptionPane.showInputDialog("How many eggs does Mom need?");
		String dad = JOptionPane.showInputDialog("How many eggs does dad need?");
		String baby = JOptionPane.showInputDialog("How many eggs does the baby need?");
		int momint = Integer.parseInt(mom);
		int dadint = Integer.parseInt(dad);
		int babyint = Integer.parseInt(baby);
		int totaleggs = momint + dadint + babyint;
		JOptionPane.showMessageDialog(null, "The whole family needs " + totaleggs + ".");
		System.out.println("The whole family needs " + totaleggs + ".");
	}
}