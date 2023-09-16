package test.nulllayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NullLayoutTest extends JFrame {
	int[] x = {60, 20, 100, 60};
	int[] y = {10, 30, 30, 50};
	JButton[] btns = new JButton[x.length];
	
	public NullLayoutTest() {
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton(i + 1 + "");
			btns[i].setBounds(x[i], y[i], 60, 30);
			add(btns[i]);
		}
		
		
		setLayout(null);
		setBounds(200, 250, 300, 250);
		setTitle("배치관리자가 없을 때 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new NullLayoutTest();
	}

}
