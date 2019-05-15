package cuteness_tv;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
JButton button1 = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();
	public void showButton() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		panel.add(button1);
		frame.pack();
		button1.addActionListener(this);
		panel.add(button2);
		frame.pack();
		button2.addActionListener(this);
		panel.add(button3);
		frame.pack();
		button3.addActionListener(this);
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
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	if(e.getSource()==button1) {
		showDucks();
	}
	if(e.getSource()==button2) {
		showFrog();
	}
	if(e.getSource()==button3) {
		showFluffyUnicorns();
	}
	}
}
