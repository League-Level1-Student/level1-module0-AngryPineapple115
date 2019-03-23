import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine {

	public static void main(String[] args) {

		JFrame jf = new JFrame();
		JPanel jp = new JPanel();
		JButton jba = new JButton();
		JButton jbb = new JButton();
		JButton jbc = new JButton();
		JButton jbd = new JButton();
		jp.add(jba);
		jp.add(jbb);
		jp.add(jbc);
		jp.add(jbd);
		jf.add(jp);
		jba.setText("Airplane Landing");
		jbb.setText("Service Bell");
		jbc.setText("Old Car");
		jbd.setText("Muscle Car");
		jf.add(jp);
		jf.pack();
		jf.setTitle("Sound Effects Machine");
		jf.setVisible(true);

		if (jba == pressed) {

		}
		if (jbb == pressed) {

		}
		if (jbc == pressed) {

		}
		if (jbd == pressed) {

		}

	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}
}