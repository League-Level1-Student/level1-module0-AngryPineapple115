import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {

	JButton jba = new JButton();
	JButton jbb = new JButton();
	JButton jbc = new JButton();

	public static void main(String[] args) {

		CutenessTV ctv = new CutenessTV();
		ctv.setup();

	}

	public void setup() {

		JFrame jf = new JFrame();
		jf.setTitle("Cuteness TV");
		JPanel jp = new JPanel();
		jba.setText("Ducks");
		jbb.setText("Frogs");
		jbc.setText("Fluffy Unicorns");
		jp.add(jba);
		jp.add(jbb);
		jp.add(jbc);
		jf.add(jp);
		jf.pack();
		jf.setVisible(true);
		jba.addActionListener(this);
		jbb.addActionListener(this);
		jbc.addActionListener(this);

	}

	void showDucks() {
		playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
		playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
		playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI(videoID);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void actionPerformed(ActionEvent e) {

		JButton buttonPressed = (JButton) e.getSource();

		if (jba == buttonPressed) {

			showDucks();

		}

		if (jbb == buttonPressed) {

			showFrog();

		}

		if (jbc == buttonPressed) {

			showFluffyUnicorns();

		}

	}
}