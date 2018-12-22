import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {

	static Robot r2d2 = new Robot();

	public static void main(String[] args) {

		r2d2.moveTo(50, 550);
		r2d2.hide();
		r2d2.setSpeed(20);
		r2d2.setPenWidth(8);
		r2d2.penDown();
		r2d2.setWindowColor(Color.BLACK);
		r2d2.turn(90);

		String sizea = JOptionPane.showInputDialog("Enter a number between 1 and 300.");

		int sizeb = Integer.parseInt(sizea);

		drawPointyRoof(sizea);
		drawFlatRoof(sizea);

	}

	static void drawFlatRoof(int height) {

		r2d2.setWindowColor(Color.BLACK);
		r2d2.setPenColor(Color.GREEN);
		r2d2.move(40);
		r2d2.turn(270);
		r2d2.setPenColor(Color.WHITE);
		r2d2.move(height);
		r2d2.turn(90);
		r2d2.move(40);
		r2d2.turn(90);
		r2d2.move(height);
		r2d2.setPenColor(Color.GREEN);
		r2d2.turn(270);
		r2d2.move(40);

	}

	static void drawPointyRoof(int height) {

		r2d2.setWindowColor(Color.BLACK);
		r2d2.setPenColor(Color.WHITE);
		r2d2.turn(270);
		r2d2.move(height);
		r2d2.turn(45);
		r2d2.move(35);
		r2d2.turn(90);
		r2d2.move(35);
		r2d2.turn(45);
		r2d2.move(height);
		r2d2.setPenColor(Color.GREEN);
		r2d2.turn(270);
		r2d2.move(20);

	}

	static void drawHouse(String height) {

		int size = 0;

		if (height.equalsIgnoreCase("small")) {

			size = 60;

		}

		else if (height.equalsIgnoreCase("medium")) {

			size = 120;

		}

		else if (height.equalsIgnoreCase("large")) {

			size = 250;

		}

		else {

			JOptionPane.showMessageDialog(null, "ERROR");

		}

		if (size >= 250 && size > 1) {

			drawFlatRoof(size);

		}

		else if (size < 250) {

			drawPointyRoof(size);
		}
	}
}