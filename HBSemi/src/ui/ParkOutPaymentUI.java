package ui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ParkOutPaymentUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//출차 요금계산 팝업 UI
		
		JFrame parkoutpayment = new JFrame("출차팝업창: 10*6");
		parkoutpayment.setBounds(300, 200, 284, 170);
		parkoutpayment.setLayout(null);
		parkoutpayment.setBackground(Color.WHITE);
		
		
		String paymentnoticement = " :"; // 금액 및 이미 결제하였습니다 받는 변수
		
		
		
		JLabel calculatefee = new JLabel("사용 요금" + paymentnoticement);
		calculatefee.setBounds(20, 20, 244, 30);
		parkoutpayment.add(calculatefee);
		
		
		/*
		
		여기에 금액 계산 메소드 넣기
		
		*/
		
		JButton paycommit = new JButton("확인 및 결제");
		paycommit.setBounds(80, 80, 124, 30);
		parkoutpayment.add(paycommit);
		
		/*
		
		여기에 확인 및 결제 버튼을 눌렀을 때 발생하는 이벤트 넣기
		
		*/

		parkoutpayment.setVisible(true);
        parkoutpayment.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
