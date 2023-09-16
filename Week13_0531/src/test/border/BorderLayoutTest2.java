package test.border;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutTest2 extends JFrame {
	
	public BorderLayoutTest2() {		
		Color[] colors = {Color.red, Color.orange, Color.blue, new Color(0, 33, 135), new Color(110, 47, 149)};
		String[] btnStrs = {"사과", "딸기", "포도", "키위", "참외"};
		String[] locStrs = {"North", "Center", "South", "West", "East"};
		JButton[] btnArr = new JButton[btnStrs.length];		
		JPanel[] pans = new JPanel[3];
		
		for (int i = 0; i < pans.length; i++) {
			pans[i] = new JPanel();
			
			if (i % 2 == 0) {
				pans[i].setBackground(Color.pink);
			}
			add(pans[i], locStrs[i]);
		}
		
		for (int i = 0; i < btnArr.length; i++) {
			btnArr[i] = new JButton(btnStrs[i]);
			btnArr[i].setBackground(colors[i]);
			btnArr[i].setForeground(Color.white);
		}
		
		pans[0].add(btnArr[0]); pans[0].add(btnArr[1]);
		pans[1].add(btnArr[2]);
		pans[2].add(btnArr[3]); pans[2].add(btnArr[4]);
		
		
		
		setTitle("BorderLayoutTest 연습");
		setSize(400, 150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new BorderLayoutTest2();

	}

}
