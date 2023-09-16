package test.jpanel;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelTest extends JFrame {
	
	public JPanelTest() {
		setLayout(null); //기본배치관리자인 borderlayout이 제거됨
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		
		p1.setBackground(Color.YELLOW);
	//  p1.setLocation(0, 0);
	//  p1.setSize(500, 150);
		p1.setBounds(0, 0, 500, 150);
		
		p2.setBackground(Color.MAGENTA);
		p2.setLocation(0, 170);
		p2.setSize(500, 150);
		
		JButton btn1 = new JButton("전송");
		JButton btn2 = new JButton("취소");
		
		p2.add(btn1);
		p2.add(btn2);
		
		add(p1);
		add(p2);
		
		setTitle("JPanel 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 200, 500, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JPanelTest();

	}

}
