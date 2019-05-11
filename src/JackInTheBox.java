import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JackInTheBox implements ActionListener {

	public static void main(String[] args) {
		new JackInTheBox().createUI();
	}

	JFrame jack = new JFrame();
	JButton suprise = new JButton();

	Dimension ButtonSize = new Dimension(300, 300);

	int counter = 0;

	public void createUI() {

		jack.add(suprise);
		jack.setVisible(true);
		jack.setTitle("Jack in the Box");
		suprise.setText("Press me...");
		suprise.addActionListener(this);
		jack.setPreferredSize(ButtonSize);
		jack.pack();

	}

	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();

		if (buttonPressed == suprise) {
			counter = counter + 1;
		}
		if (counter == 5) {
			showPicture("jackInTheBox.png");
			playSound("homer-woohoo.wav");
			counter = 0;
		}

		suprise.setVisible(true);

		jack.setPreferredSize(ButtonSize);
		jack.pack();

	}

	private void playSound(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void showPicture(String fileName) {
		try {
			JLabel imageLabel = createLabelImage(fileName);
			JFrame frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(imageLabel);
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private JLabel createLabelImage(String fileName) {
		try {
			URL imageURL = getClass().getResource(fileName);
			if (imageURL == null) {
				System.err.println("Could not find image " + fileName);
				return new JLabel();
			} else {
				Icon icon = new ImageIcon(imageURL);
				JLabel imageLabel = new JLabel(icon);
				return imageLabel;
			}
		} catch (Exception e) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
	}
}