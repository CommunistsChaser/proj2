package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class PopUpUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//사이즈별 팝업창
		
		JFrame pop1 = new JFrame("팝업1: 10*12");
		pop1.setBounds(300, 200, 284, 340);
		pop1.setLayout(null);
		pop1.setBackground(Color.WHITE);
		
		JButton pop1ok = new JButton("확인");
		pop1ok.setBounds(80, 260, 60, 30);
		pop1.add(pop1ok);
		
		JButton pop1cancel = new JButton("취소");
		pop1cancel.setBounds(144, 260, 60, 30);
		pop1.add(pop1cancel);
		
		pop1.setVisible(true);
        pop1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		////////////////////////////////////////////
        JFrame pop15 = new JFrame("팝업1.5: 10*12");
		pop15.setBounds(300, 200, 340, 284);
		pop15.setLayout(null);
		pop15.setBackground(Color.WHITE);
		
		JButton pop15ok = new JButton("확인");
		pop15ok.setBounds(80, 260, 60, 30);
		pop15.add(pop15ok);
		
		JButton pop15cancel = new JButton("취소");
		pop15cancel.setBounds(144, 260, 60, 30);
		pop1.add(pop15cancel);
		
		pop15.setVisible(true);
        pop15.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		////////////////////////////////////////////
		
        JFrame pop2 = new JFrame("팝업2: 10*15");
		pop2.setBounds(600, 200, 284, 426);
		pop2.setLayout(null);
		pop2.setBackground(Color.WHITE);
		
		JButton pop2ok = new JButton("확인");
		pop2ok.setBounds(80, 346, 60, 30);
		pop2.add(pop2ok);
		
		JButton pop2cancel = new JButton("취소");
		pop2cancel.setBounds(144, 346, 60, 30);
		pop2.add(pop2cancel);
		
		pop2.setVisible(true);
        pop2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		////////////////////////////////////////////
        
        JFrame pop25 = new JFrame("팝업2.5: 10*18");
		pop25.setBounds(600, 200, 284, 512);
		pop25.setLayout(null);
		pop25.setBackground(Color.WHITE);
		
		JButton pop25ok = new JButton("확인");
		pop25ok.setBounds(80, 346, 60, 30);
		pop25.add(pop25ok);
		
		JButton pop25cancel = new JButton("취소");
		pop25cancel.setBounds(144, 346, 60, 30);
		pop25.add(pop25cancel);
		
		pop25.setVisible(true);
        pop25.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		////////////////////////////////////////////

        JFrame pop3 = new JFrame("팝업3: 20*15");
		pop3.setBounds(900, 200, 568, 426);
		pop3.setLayout(null);
		pop3.setBackground(Color.WHITE);
		
		JButton pop3ok = new JButton("확인");
		pop3ok.setBounds(222, 346, 60, 30);
		pop3.add(pop3ok);
		
		JButton pop3cancel = new JButton("취소");
		pop3cancel.setBounds(286, 346, 60, 30);
		pop3.add(pop3cancel);
		
		pop3.setVisible(true);
        pop3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
