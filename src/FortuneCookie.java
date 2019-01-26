import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FortuneCookie implements ActionListener {

	public FortuneCookie() {

	}

	static JFrame frame;
	static JButton button;

	public static void main(String[] args) {

		new FortuneCookie().showButton();

	}

	public void showButton() {

		frame = new JFrame();
		button = new JButton();
		FortuneCookie fc = new FortuneCookie();
		frame.setVisible(true);
		frame.add(button);
		button.addActionListener(this);

		int rand = new Random().nextInt(5);

		if (rand == 1) {

			button.setText("The fortune you seek is in another cookie.");

		} else if (rand == 2) {

			button.setText("A conclusion is simply the place where you got tired of thinking.");

		} else if (rand == 3) {

			button.setText("A foolish man listens to his heart. A wise man listens to cookies.");

		} else if (rand == 4) {

			button.setText("If a turtle doesn't have a shell, is it naked or homeless?");

		} else if (rand == 0) {

			button.setText("All fortunes are wrong except this one.");

		}

		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}