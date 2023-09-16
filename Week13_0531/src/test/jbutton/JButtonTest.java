package test.jbutton;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonTest extends JFrame {
	

	
	public JButtonTest(){
		setLayout(new FlowLayout());
		JButton btn1 = new JButton("전송");
		JButton btn2 = new JButton("취소");
		
		btn1.setBackground(new Color(165, 102, 255));
		btn1.setForeground(Color.WHITE);
		
		btn2.setBackground(Color.black);
		btn2.setForeground(Color.WHITE);
		
		add(btn1);
		add(btn2);
		
		setTitle("JButton 연습");
		setSize(300, 100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JButtonTest();

	}

}
