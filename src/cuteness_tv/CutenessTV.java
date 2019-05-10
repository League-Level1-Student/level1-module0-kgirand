package cuteness_tv;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CutenessTV implements ActionListener {
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button1 = new JButton();
		frame.add(button1);
		frame.pack();
		button1.addActionListener(this);
		JButton button2 = new JButton();
		frame.add(button2);
		frame.pack();
		button2.addActionListener(this);
		JButton button3 = new JButton();
		frame.add(button3);
		frame.pack();
		button3.addActionListener(this);
	}
	
}
