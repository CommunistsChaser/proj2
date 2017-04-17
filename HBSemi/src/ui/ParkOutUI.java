package ui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ParkOutUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//차 번호만 입력하면 요금이 나오고, 결제.
		//팝업 제외한 출차 UI
		
		JFrame parkout = new JFrame("출차팝업창: 10*12");
		parkout.setBounds(300, 200, 284, 340);
		parkout.setLayout(null);
		parkout.setBackground(Color.WHITE);
		
		
		JLabel parkoutnoticelabel = new JLabel("출차 절차를 진행합니다.");
		parkoutnoticelabel.setBounds(20, 20, 260, 30);
		parkout.add(parkoutnoticelabel);
		
		
		JLabel parkoutcarnuminputlabel = new JLabel("차량번호");
		parkoutcarnuminputlabel.setBounds(30, 60, 80, 30);
		parkout.add(parkoutcarnuminputlabel);
		
		JTextField personalinfocarnumfield1 = new JTextField("지역 00 영 0000");
		personalinfocarnumfield1.setBounds(110, 60, 134, 30);
		parkout.add(personalinfocarnumfield1);
		
		JButton payforthefee = new JButton("결제하기");
		payforthefee.setBounds(92,115,100,30);
		parkout.add(payforthefee);
		
		
		
		String paycheckment = null; //멘트 띄우는 변수
		
		JLabel paycheck = new JLabel(paycheckment);
		paycheck.setBounds(30, 150, 224, 30);
		parkout.add(paycheck);
		
		/*
		  if(~~==true)
		  paycheckment = "결제가 완료되었음.";
		 */
		
		
		
		JLabel parkoutaskingmentlabel = new JLabel("모든 절차를 마치고 출차를 진행합니다.");
		parkoutaskingmentlabel.setBounds(25, 180, 260, 30);
		parkout.add(parkoutaskingmentlabel);
		
		
		
		
		
		
		
		JButton parkoutok = new JButton("확인");
		parkoutok.setBounds(80, 230, 60, 30);
		parkout.add(parkoutok);
		
		JButton parkoutcancel = new JButton("취소");
		parkoutcancel.setBounds(144, 230, 60, 30);
		parkout.add(parkoutcancel);
		
		parkout.setVisible(true);
        parkout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}

}
