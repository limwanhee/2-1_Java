package test.textfield;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import test.nulllayout.NullLayoutTest;

public class JTextFieldTest1 extends JFrame {
	String[] lblStrs = {"성명: ", "전화: ", "주소: " };
	String[] locs = {"North", "Center", "South"};
	int[] cols = {10, 20, 30};
	JPanel[] pans = new JPanel[lblStrs.length];
	JLabel[] lbls = new JLabel[lblStrs.length];
	JTextField[] tfs = new JTextField[lblStrs.length];
	
	public JTextFieldTest1() {
		for (int i = 0; i < lblStrs.length; i++) {
			pans[i] = new JPanel(new FlowLayout(FlowLayout.LEFT));
			lbls[i] = new JLabel(lblStrs[i]);
			tfs[i] = new JTextField(cols[i]);
			pans[i].add(lbls[i]);
			pans[i].add(tfs[i]);
			add(pans[i], locs[i]);
		}
		
		setBounds(200, 250, 500, 130);
		setTitle("JTextField 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JTextFieldTest1();
	}
}
