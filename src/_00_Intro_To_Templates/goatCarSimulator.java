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

	JFrame doors = new JFrame();
	JPanel panel = new JPanel();
	JButton door1 = new JButton();
	JButton door2 = new JButton();
	JButton door3 = new JButton();
	Random rand = new Random();

	void Runner() {
		doors.add(panel);
		panel.add(door1);
		panel.add(door2);
		panel.add(door3);
		door1.addActionListener(this);
		door2.addActionListener(this);
		door3.addActionListener(this);
		doors.setVisible(true);
		doors.pack();
	}

	int num = rand.nextInt(3);

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Random rand2 = new Random();
		rand2.nextInt(2);
		if (e.getSource().equals(door1)) {
			
		}

		else if (e.getSource().equals(door2)) {

		}

		else if (e.getSource().equals(door3)) {

		}
	}
}
