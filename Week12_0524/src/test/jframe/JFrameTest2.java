package test.jframe;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameTest2 extends JFrame{
	
	public JFrameTest2() {
		setTitle("JFrame Test");
		setSize(500, 400);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JFrameTest2();

	}

}
