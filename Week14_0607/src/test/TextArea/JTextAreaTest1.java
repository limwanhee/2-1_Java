package test.TextArea;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import test.nulllayout.NullLayoutTest;

public class JTextAreaTest1 extends JFrame {
	String[] lblStrs = {"작성자: ", "글제목: ", "내용: " };
	String[] locs = {"North", "Center", "South"};
	int[] cols = {7, 20, 30};
	JPanel[] pans = new JPanel[lblStrs.length];
	JLabel[] lbls = new JLabel[lblStrs.length];
	JTextField[] tfs = new JTextField[lblStrs.length-1];
	JTextArea ta = new JTextArea(7, cols[2]);
	
	public JTextAreaTest1() {
		for (int i = 0; i < lblStrs.length; i++) {
			pans[i] = new JPanel();
			lbls[i] = new JLabel(lblStrs[i]);
			
			if(i < 2) {
				tfs[i] = new JTextField(cols[i]);
				pans[i].add(tfs[i]);
			}
			else {
				pans[i].add(ta);
			}
			
			pans[i].add(lbls[i]);
			add(pans[i], locs[i]);
		}
		
		setBounds(200, 250, 500, 250);
		setTitle("JTextField 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JTextAreaTest1();
	}
}
