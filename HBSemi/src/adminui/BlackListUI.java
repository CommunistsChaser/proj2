package adminui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BlackListUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame blacklistmainpage = new JFrame("������Ʈ: 20*15");
		blacklistmainpage.setBounds(900, 200, 568, 426);
		blacklistmainpage.setLayout(null);
		blacklistmainpage.setBackground(Color.WHITE);
		
		
		JLabel blacklistmainpagetitle = new JLabel("������Ʈ");
		blacklistmainpagetitle.setBounds(10, 10, 100, 50);
		blacklistmainpage.add(blacklistmainpagetitle);
		
		
		JButton blacklistmainpageprint = new JButton("");
		blacklistmainpageprint.setBounds(200, 20, 80, 30);
		blacklistmainpage.add(blacklistmainpageprint);
		
		JButton blacklistmainpageok = new JButton("Ȯ��");
		blacklistmainpageok.setBounds(222, 346, 60, 30);
		blacklistmainpage.add(blacklistmainpageok);
		
		JButton blacklistmainpagecancel = new JButton("���");
		blacklistmainpagecancel.setBounds(286, 346, 60, 30);
		blacklistmainpage.add(blacklistmainpagecancel);
		
		blacklistmainpage.setVisible(true);
        blacklistmainpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
