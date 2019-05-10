package fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
public void showButton() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	JButton button = new JButton();
	frame.add(button);
	frame.pack();
	button.addActionListener(this);
	actionPerformed();
}
public void actionPerformed() {
	int rand = new Random().nextInt(5);
	if(rand==4) {
		JOptionPane.showMessageDialog(null, "Be nice");
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
public static void main(String[] args) {
	new FortuneCookie().showButton();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}

}
