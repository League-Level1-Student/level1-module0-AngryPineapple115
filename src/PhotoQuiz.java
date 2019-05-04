
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will make sure the program exits when you
																	// close the window

		// 1. find an image on the internet, and put its URL in a String variable (from
		// your browser, right click on the image, and select “Copy Image Address”)
		int score = 0;
		// 2. create a variable of type "Component" that will hold your image
		Component imageAdressOne;
		// 3. use the "createImage()" method below to initialize your Component
		imageAdressOne = createImage("https://i.ytimg.com/vi/rjo2Lj7Ql5s/maxresdefault.jpg");
		// 4. add the image to the quiz window
		quizWindow.add(imageAdressOne);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String elmo = JOptionPane.showInputDialog("Who is this?");
		// 7. print "CORRECT" if the user gave the right answer
		if (elmo.equalsIgnoreCase("Elmo")) {
			System.out.println("CORRECT");
			score = score + 1;
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			System.out.println("INCORRECT");
		}
		// 9. remove the component from the quiz window (you may not see the effect of
		// this until step 12)
		quizWindow.remove(imageAdressOne);
		// 10. find another image and create it (might take more than one line of code)
		Component imageAdressTwo;
		imageAdressTwo = createImage("https://i.kym-cdn.com/news_feeds/icons/mobile/000/028/882/be0.jpg");
		// 11. add the second image to the quiz window
		quizWindow.add(imageAdressTwo);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String otamatone = JOptionPane.showInputDialog("What 'instrument' is the angry white thing called?");
		if (otamatone.equalsIgnoreCase("Otamatone")) {
			System.out.println("CORRECT");
			score = score + 1;
		}

		// 14+ check answer, say if correct or incorrect, etc.
		else {
			System.out.println("INCORRECT");
		}
		JOptionPane.showMessageDialog(null, "Your final score is " + score + ".");
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
