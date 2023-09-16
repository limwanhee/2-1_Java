package test.jframe;

import javax.swing.JFrame;

public class JFrameTest1 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		f.setTitle("JFrame 연습1");
		f.setSize(500, 300);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
