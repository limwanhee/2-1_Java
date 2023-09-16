package test.jlabel;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelTest extends JFrame {
	private JLabel lb1, lb2;
	
	public JLabelTest() {
		lb1 = new JLabel("유한대학교", JLabel.CENTER);
		lb2 = new JLabel("컴퓨터소프트웨어공학과", JLabel.CENTER);
		
		add(lb1, "North");
		add(lb2, "Center");
		
		setTitle("JLabel 연습");
		setSize(300, 100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JLabelTest();

	}

}
