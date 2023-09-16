package test.grid;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest extends JFrame {
	int rows = 4;
	int cols = 3;
	JButton[] btns = new JButton[rows * cols];
	String[] btlStrs = {"*", "0", "#"};
	
	public GridLayoutTest() {
		setLayout(new GridLayout(rows, cols));
		
		for (int i = 0; i < btns.length; i++) {
			if(i < 9) {
				btns[i] = new JButton(i+1+"");
			}
			else {
				btns[i] = new JButton(btlStrs[i-9]);
			}
			
			add(btns[i]);
		}
		
		
		setBounds(200, 250, 200, 250);
		setTitle("GridLayout 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
	}

	public static void main(String[] args) {
		new GridLayoutTest();
	}

}
