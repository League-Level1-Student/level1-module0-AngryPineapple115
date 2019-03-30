import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {

	JButton jba = new JButton();
	JButton jbb = new JButton();
	JButton jbc = new JButton();
	JButton jbd = new JButton();

	public static void main(String[] args) {

		SoundEffectsMachine sem = new SoundEffectsMachine();
		sem.setup();

	}

	public void setup() {

		JFrame jf = new JFrame();
		JPanel jp = new JPanel();
		jp.add(jba);
		jp.add(jbb);
		jp.add(jbc);
		jp.add(jbd);
		jf.add(jp);
		jba.setText("Airplane Landing");
		jbb.setText("Service Bell");
		jbc.setText("Old Car");
		jbd.setText("Service Bell");
		jba.addActionListener(this);
		jf.add(jp);
		jf.pack();
		jf.setTitle("Sound Effects Machine");
		jf.setVisible(true);

	}

	private void playSound(String fileName) {

		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();

	}

	public void actionPerformed(ActionEvent e) {

		JButton pressed = (JButton) e.getSource();

		if (jba == pressed) {

			playSound("file:///Users/league/Desktop/airplane.png");

		}

		if (jbb == pressed) {

			playSound("file:///Users/league/Desktop/servicebell.png");

		}

		if (jbc == pressed) {

			playSound("file:///Users/league/Desktop/oldcar.png");

		}

		if (jbd == pressed) {

			playSound("file:///Users/league/Desktop/oldcar.png");

		}
	}
}