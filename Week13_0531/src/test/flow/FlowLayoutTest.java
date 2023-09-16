package test.flow;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutTest extends JFrame {
	
	public FlowLayoutTest() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 15, 25));
		
		Color[] colors = {Color.red, Color.orange, Color.yellow, Color.GREEN, Color.blue, new Color(0, 33, 135), new Color(110, 47, 149)};
		String[] btnStrs = {"사과", "딸기", "포도", "수박", "키위", "오렌지", "참외"};
		JButton[] btnArr = new JButton[btnStrs.length];
		
		for (int i = 0; i < btnArr.length; i++) {
			btnArr[i] = new JButton(btnStrs[i]);
			btnArr[i].setBackground(colors[i]);
			btnArr[i].setForeground(Color.white);
			add(btnArr[i]);
		}
		
		setTitle("FlowLayout 연습");
		setSize(300, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
	new FlowLayoutTest();	

	}

}
