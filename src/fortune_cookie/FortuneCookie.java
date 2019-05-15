package fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {	
	JButton button = new JButton("click for fortune");
public void showButton() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	System.out.println("rand");
	frame.add(button);
	frame.pack();
	button.addActionListener(this);
}

public static void main(String[] args) {
	new FortuneCookie().showButton();
}
@Override
public void actionPerformed(ActionEvent e) {
	int rand = new Random().nextInt(5);

	if(rand==4) {
		JOptionPane.showMessageDialog(null, "Someone likes you");
	}
	else if(rand==3) {
		JOptionPane.showMessageDialog(null, "Someone hates you");
	}
	else if(rand==2) {
		JOptionPane.showMessageDialog(null, "Someone doesn't hate you");
	}
	else if(rand==1) {
		JOptionPane.showMessageDialog(null, "Someone absolutely hates you");
	}
	else if(rand==0) {
		JOptionPane.showMessageDialog(null, "Somone doesn't absolutely hate you");
	}
	
}

}
