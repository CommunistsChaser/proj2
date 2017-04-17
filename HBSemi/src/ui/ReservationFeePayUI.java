package ui;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class ReservationFeePayUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame reservationfee = new JFrame("예약금결제창: 10*12");
		reservationfee.setBounds(300, 200, 284, 340);
		reservationfee.setLayout(null);
		reservationfee.setBackground(Color.WHITE);
		
		
		JLabel reservationfeement1 = new JLabel("예약금(10%)을 결제합니다");
		reservationfeement1.setBounds(30,15,224,40);
		reservationfee.add(reservationfeement1);
		
		
		String reservationprice = "0";
		
		
		JLabel reservationfeeprice = new JLabel("결제금액: " + reservationprice + " 원");
		reservationfeeprice.setBounds(30,60,224,40);
		reservationfee.add(reservationfeeprice);		
		
		//예약금을 설정할 때 재정의
		
		JLabel reservationline1label = new JLabel("-----------------------------------------------------");
		reservationline1label.setBounds(30,110,224,30);
		reservationfee.add(reservationline1label);
		
		
		JLabel reservationfeement2 = new JLabel("전액을 선불로 결제하시겠습니까?");
		reservationfeement2.setBounds(30,130,224,40);
		reservationfee.add(reservationfeement2);
		
		ButtonGroup rfpyesnobg = new ButtonGroup();
		
		
		JRadioButton reservationpayyes = new JRadioButton("예", true);
		reservationpayyes.setBounds(70,170,65,30);
		rfpyesnobg.add(reservationpayyes);
		reservationfee.add(reservationpayyes);
		
		JRadioButton reservationpayno = new JRadioButton("아니오");
		reservationpayno.setBounds(134,170,70,30);
		rfpyesnobg.add(reservationpayno);
		reservationfee.add(reservationpayno);

		

		//결제금액 계산 파트.
		//////////////////////////////////////////////////////////////////////
		////////////////////////수정필요!!!!!!//////////////////////////////////
		//////////////////////////////////////////////////////////////////////
		int time = 1;
		int unitprice = 1000;
		double [] percentArr = {0.1, 1};
		double percent = percentArr[0];
		
		reservationprice = time * unitprice * percent + "";
		if(time*unitprice*percent < 2000) reservationprice = 2000 + "";
	//	if(reservationpayyes == true) percent = percentArr[1];
		
		
			
		JButton reservationfeeok = new JButton("확인");
		reservationfeeok.setBounds(80, 260, 60, 30);
		reservationfee.add(reservationfeeok);
		
		JButton reservationfeecancel = new JButton("취소");
		reservationfeecancel.setBounds(144, 260, 60, 30);
		reservationfee.add(reservationfeecancel);
		
		reservationfee.setVisible(true);
		reservationfee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
