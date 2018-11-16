package _00_Intro_To_Templates;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class goatCarSimulator implements ActionListener {
	public static void main(String[] args) {
		goatCarSimulator gcs = new goatCarSimulator();
		gcs.Runner();
	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton door1 = new JButton();
	JButton door2 = new JButton();
	JButton door3 = new JButton();
	Random rand = new Random();

	void Runner() {
		frame.add(panel);
		panel.add(door1);
		panel.add(door2);
		panel.add(door3);
		door1.addActionListener(this);
		door2.addActionListener(this);
		door3.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}

	int num = rand.nextInt(3);

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(door1)) {
			
		}
		
		else if (e.getSource().equals(door2)) {

		}
		
		else if (e.getSource().equals(door3)) {

		}
	}
}
