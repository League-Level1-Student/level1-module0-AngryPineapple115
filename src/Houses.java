import java.awt.Color;

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

		drawFlatRoof();
		drawPointyRoof();
	}

	static void drawFlatRoof() {

		r2d2.setPenColor(Color.WHITE);
		r2d2.turn(270);
		r2d2.move(100);
		r2d2.turn(90);
		r2d2.move(40);
		r2d2.turn(90);
		r2d2.move(100);
		r2d2.setPenColor(Color.GREEN);
		r2d2.turn(270);
		r2d2.move(20);

	}

	static void drawPointyRoof() {

		r2d2.setPenColor(Color.WHITE);
		r2d2.turn(270);
		r2d2.move(100);
		r2d2.turn(315);
		r2d2.move(10);
		r2d2.turn(90);
		r2d2.move(10);
		r2d2.turn(315);
		r2d2.move(100);
		r2d2.setPenColor(Color.GREEN);
		r2d2.turn(270);
		r2d2.move(20);

	}
}