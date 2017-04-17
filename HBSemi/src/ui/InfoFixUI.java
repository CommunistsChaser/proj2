package ui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InfoFixUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame infofix = new JFrame("회원정보수정창: 10*18");
		infofix.setBounds(600, 200, 284, 512);
		infofix.setLayout(null);
		infofix.setBackground(Color.WHITE);
		
		JLabel infofixtitle = new JLabel("회원정보수정");
//		infofixtitle.setFont(new Font("Serif", Font.BOLD, 20));
		infofixtitle.setBounds(20,10,80,40);
		infofix.add(infofixtitle);
		
		JLabel infofixline1label = new JLabel("-----------------------------------------------------");
		infofixline1label.setBounds(30,40,224,30);
		infofix.add(infofixline1label);
		
		
		String name = "못바꾸는정보1";
		JLabel infofixnamelabel = new JLabel("이름: " + name);
		infofixnamelabel.setBounds(30,70,200,30);
		infofix.add(infofixnamelabel);
		
		String id = "못바꾸는정보2";
		JLabel infofixidlabel = new JLabel("ID: " + id);
		infofixidlabel.setBounds(30,105,200,30);
		infofix.add(infofixidlabel);
		
		JLabel infofixphonelabel = new JLabel("전화번호");
		infofixphonelabel.setBounds(30,140,80,30);
		infofix.add(infofixphonelabel);
		
		JTextField infofixphonenumberfield = new JTextField("확인 누르면 이 번호로 수정");
		infofixphonenumberfield.setBounds(110, 140, 134, 30);
		infofix.add(infofixphonenumberfield);
		
		
		
		JButton infofixsubmit = new JButton("수정");
		infofixsubmit.setBounds(65,410,65,30);
		infofix.add(infofixsubmit);
		
		JButton infofixsubmitcancel = new JButton("취소");
		infofixsubmitcancel.setBounds(139,410,70,30);
		infofix.add(infofixsubmitcancel);
		
		infofix.setVisible(true);
        infofix.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
