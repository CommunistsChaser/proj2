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
		
		JFrame adminmainpage = new JFrame("������ ���� ȭ��");
		adminmainpage.setLayout(null);
		adminmainpage.setBounds(300, 200, 284, 340);
		
		
		JLabel adminmainpagetitle = new JLabel("����������");
		adminmainpagetitle.setBounds(20, 10, 244, 30);
		adminmainpage.add(adminmainpagetitle);
		//��ȸ �������� ȸ����� ����
		
		JButton infoscanningbutton = new JButton("��ȸ");
		infoscanningbutton.setBounds(0,50,284,60);
		adminmainpage.add(infoscanningbutton);
		
		JButton parkinglotmanagingbutton = new JButton("������ ����");
		parkinglotmanagingbutton.setBounds(0, 120, 284, 60);
		adminmainpage.add(parkinglotmanagingbutton);
		
		JButton accountingbutton = new JButton("ȸ�����");
		accountingbutton.setBounds(0, 190, 284, 60);
		adminmainpage.add(accountingbutton);
		
		JButton noticebutton = new JButton("����");
		noticebutton.setBounds(0, 260, 284, 60);
		adminmainpage.add(noticebutton);
		
		
		
		
		

		adminmainpage.setVisible(true);
        adminmainpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


