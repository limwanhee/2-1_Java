package test.jlabel;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelTest2 extends JFrame {
	private JLabel lb1, lb2;
	
	public JLabelTest2() {
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		lb1 = new JLabel("유한대학교");
		lb2 = new JLabel("컴퓨터소프트웨어공학과");
	
		lb1.setBackground(Color.GREEN);
		lb2.setBackground(Color.GREEN);
		lb1.setOpaque(true);
		lb2.setOpaque(true);
		
		add(lb1);
		add(lb2);
		
		setTitle("JLabel 연습");
		setSize(300, 100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JLabelTest2();

	}

}
