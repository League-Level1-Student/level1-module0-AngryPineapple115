import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JackInTheBox {

	public static void main(String[] args) {

		JFrame jack = new JFrame();

		JButton suprise = new JButton();

		jack.add(suprise);
		jack.setVisible(true);
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
}