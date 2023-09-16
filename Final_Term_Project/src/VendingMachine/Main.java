package VendingMachine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class Main extends JFrame implements ActionListener {
    String[] labelName = {"0", "자판기", "내 돈", "동전투입구"};
    JLabel[] jlArr = new JLabel[labelName.length];
    Font labelBaseFont = new Font("굴림", Font.BOLD, 20);
    String[] btnName = {"<html><body style='text-align:center;'>2000원<br>아이스티</body></html>",
                         "<html><body style='text-align:center;'>1000원<br>사과주스</body></html>",
                         "<html><body style='text-align:center;'>1500원<br>사이다</body></html>",
                         "<html><body style='text-align:center;'>1000원<br>핫식스</body></html>",
                         "<html><body style='text-align:center;'>800원<br>코코팜</body></html>",
                         "<html><body style='text-align:center;'>900원<br>코카콜라</body></html>",
                         "10원", "50원", "백원", "5백원", "천원", "5천원", "만원", "5만원", "반환"};
    JButton[] jbtnArr = new JButton[btnName.length];

    String[] panelName = {"productPanel", "moneyPanel"};
    JPanel[] jPanelArr = new JPanel[panelName.length];

    public void setValue(){
        for(int i = 0; i < jbtnArr.length; i++){
            jbtnArr[i] = new JButton(btnName[i]);
            jbtnArr[i].addActionListener(this);
            add(jbtnArr[i]);

            if(i <= 5){
                jbtnArr[i].setBackground(Color.RED);
            }
        }

        for(int i = 0; i < jlArr.length; i++){
            jlArr[i] = new JLabel(labelName[i]);
            add(jlArr[i]);
        }

        for(int i = 0; i < jPanelArr.length; i++){
            jPanelArr[i] = new JPanel();
            add(jPanelArr[i]);

            if(i == 0){
                jPanelArr[i].setBounds(1,1,225,250);
                jPanelArr[i].add(jbtnArr[0]);
                jPanelArr[i].add(jbtnArr[1]);
                jPanelArr[i].add(jbtnArr[2]);
                jPanelArr[i].add(jbtnArr[3]);
                jPanelArr[i].add(jbtnArr[4]);
                jPanelArr[i].add(jbtnArr[5]);

            }
            else if(i == 1){
                jPanelArr[i].setBounds(220,300,260,100);
                jPanelArr[i].add(jbtnArr[6]);
                jPanelArr[i].add(jbtnArr[7]);
                jPanelArr[i].add(jbtnArr[8]);
                jPanelArr[i].add(jbtnArr[9]);
                jPanelArr[i].add(jbtnArr[10]);
                jPanelArr[i].add(jbtnArr[11]);
                jPanelArr[i].add(jbtnArr[12]);
                jPanelArr[i].add(jbtnArr[13]);
                jPanelArr[i].add(jbtnArr[14]);
            }
        }
    }

    public void checkMoney(){
        int mymoney = Integer.parseInt(jlArr[0].getText());

        if(mymoney >= 2000){
            jbtnArr[0].setBackground(Color.GREEN);
        }
        else{
            jbtnArr[0].setBackground(Color.RED);
        }

        if(mymoney >= 1500){
            jbtnArr[2].setBackground(Color.GREEN);
        }
        else{
            jbtnArr[2].setBackground(Color.RED);
        }

        if(mymoney >= 1000){
            jbtnArr[1].setBackground(Color.GREEN);
            jbtnArr[3].setBackground(Color.GREEN);
        }
        else{
            jbtnArr[1].setBackground(Color.RED);
            jbtnArr[3].setBackground(Color.RED);
        }

        if(mymoney >= 900){
            jbtnArr[5].setBackground(Color.GREEN);
        }
        else{
            jbtnArr[5].setBackground(Color.RED);
        }

        if(mymoney >= 800){
            jbtnArr[4].setBackground(Color.GREEN);
        }
        else{
            jbtnArr[4].setBackground(Color.RED);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int count = Integer.parseInt(jlArr[0].getText());

        if(e.getSource() == jbtnArr[6]){                // 내 돈 증가
            count += 10;
            jlArr[0].setText(String.valueOf(count));
            checkMoney();
        }
        else if (e.getSource() == jbtnArr[7]) {
            count += 50;
            jlArr[0].setText(String.valueOf(count));
            checkMoney();
        }

        else if (e.getSource() == jbtnArr[8]) {
            count += 100;
            jlArr[0].setText(String.valueOf(count));
            checkMoney();
        }

        else if (e.getSource() == jbtnArr[9]) {
            count += 500;
            jlArr[0].setText(String.valueOf(count));
            checkMoney();
        }

        else if (e.getSource() == jbtnArr[10]) {
            count += 1000;
            jlArr[0].setText(String.valueOf(count));
            checkMoney();
        }

        else if (e.getSource() == jbtnArr[11]) {
            count += 5000;
            jlArr[0].setText(String.valueOf(count));
            checkMoney();
        }

        else if (e.getSource() == jbtnArr[12]) {
            count += 10000;
            jlArr[0].setText(String.valueOf(count));
            checkMoney();
        }
        else if (e.getSource() == jbtnArr[13]){
            count += 50000;
            jlArr[0].setText(String.valueOf(count));
            checkMoney();
        }
        else if (e.getSource() == jbtnArr[14] && count > 0){
            jlArr[0].setText(String.valueOf(0));
            checkMoney();
        }

        if(e.getSource() == jbtnArr[0] && count >= 2000){           // 내 돈 감소
            count -= 2000;
            jlArr[0].setText(String.valueOf(count));
            checkMoney();
        }

        if(e.getSource() == jbtnArr[1] && count >= 1000 || e.getSource() == jbtnArr[3] && count >= 1000){
            count -= 1000;
            jlArr[0].setText(String.valueOf(count));
            checkMoney();
        }

        if(e.getSource() == jbtnArr[2] && count >= 1500){
            count -= 1500;
            jlArr[0].setText(String.valueOf(count));
            checkMoney();
        }

        if(e.getSource() == jbtnArr[4] && count >= 800){
            count -= 800;
            jlArr[0].setText(String.valueOf(count));
            checkMoney();
        }

        if(e.getSource() == jbtnArr[5] && count >= 900){
            count -= 900;
            jlArr[0].setText(String.valueOf(count));
            checkMoney();
        }
    }

    public Main(){
        setValue();

        jPanelArr[0].setLayout(new GridLayout(3, 2, 20, 25));
        jPanelArr[1].setLayout(new GridLayout(3,3, 5, 10));

        jlArr[1].setBounds(315, 50, 300, 40);
        jlArr[1].setFont(labelBaseFont);

        jlArr[2].setBounds(315, 150, 300, 40);
        jlArr[2].setFont(labelBaseFont);

        jlArr[3].setBounds(315, 250, 300, 40);
        jlArr[3].setFont(labelBaseFont);

        jlArr[0].setBounds(335, 185, 300, 40);
        jlArr[0].setFont(labelBaseFont);

        setSize(500, 500);
        setTitle("음료수 자판기");
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Main();
    }

}
