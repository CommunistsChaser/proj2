package adminui;

import java.awt.Color;
import java.awt.Font;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class AdminMainPageUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame adminmainpage = new JFrame("관리자 메인 화면");
		adminmainpage.setLayout(null);
		adminmainpage.setBounds(300, 200, 284, 340);
		
		
		JLabel adminmainpagetitle = new JLabel("관리페이지");
		adminmainpagetitle.setBounds(20, 10, 244, 30);
		adminmainpage.add(adminmainpagetitle);
		//조회 주차관리 회계관리 공지
		
		JButton infoscanningbutton = new JButton("조회");
		infoscanningbutton.setBounds(0,50,284,60);
		adminmainpage.add(infoscanningbutton);
		
		JButton parkinglotmanagingbutton = new JButton("주차장 관리");
		parkinglotmanagingbutton.setBounds(0, 120, 284, 60);
		adminmainpage.add(parkinglotmanagingbutton);
		
		JButton accountingbutton = new JButton("회계관리");
		accountingbutton.setBounds(0, 190, 284, 60);
		adminmainpage.add(accountingbutton);
		
		JButton noticebutton = new JButton("공지");
		noticebutton.setBounds(0, 260, 284, 60);
		adminmainpage.add(noticebutton);
		
		
		
		
		

		adminmainpage.setVisible(true);
        adminmainpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


