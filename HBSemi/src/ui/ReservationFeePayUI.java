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
		
		JFrame reservationfee = new JFrame("����ݰ���â: 10*12");
		reservationfee.setBounds(300, 200, 284, 340);
		reservationfee.setLayout(null);
		reservationfee.setBackground(Color.WHITE);
		
		
		JLabel reservationfeement1 = new JLabel("�����(10%)�� �����մϴ�");
		reservationfeement1.setBounds(30,15,224,40);
		reservationfee.add(reservationfeement1);
		
		
		String reservationprice = "0";
		
		
		JLabel reservationfeeprice = new JLabel("�����ݾ�: " + reservationprice + " ��");
		reservationfeeprice.setBounds(30,60,224,40);
		reservationfee.add(reservationfeeprice);		
		
		//������� ������ �� ������
		
		JLabel reservationline1label = new JLabel("-----------------------------------------------------");
		reservationline1label.setBounds(30,110,224,30);
		reservationfee.add(reservationline1label);
		
		
		JLabel reservationfeement2 = new JLabel("������ ���ҷ� �����Ͻðڽ��ϱ�?");
		reservationfeement2.setBounds(30,130,224,40);
		reservationfee.add(reservationfeement2);
		
		ButtonGroup rfpyesnobg = new ButtonGroup();
		
		
		JRadioButton reservationpayyes = new JRadioButton("��", true);
		reservationpayyes.setBounds(70,170,65,30);
		rfpyesnobg.add(reservationpayyes);
		reservationfee.add(reservationpayyes);
		
		JRadioButton reservationpayno = new JRadioButton("�ƴϿ�");
		reservationpayno.setBounds(134,170,70,30);
		rfpyesnobg.add(reservationpayno);
		reservationfee.add(reservationpayno);

		

		//�����ݾ� ��� ��Ʈ.
		//////////////////////////////////////////////////////////////////////
		////////////////////////�����ʿ�!!!!!!//////////////////////////////////
		//////////////////////////////////////////////////////////////////////
		int time = 1;
		int unitprice = 1000;
		double [] percentArr = {0.1, 1};
		double percent = percentArr[0];
		
		reservationprice = time * unitprice * percent + "";
		if(time*unitprice*percent < 2000) reservationprice = 2000 + "";
	//	if(reservationpayyes == true) percent = percentArr[1];
		
		
			
		JButton reservationfeeok = new JButton("Ȯ��");
		reservationfeeok.setBounds(80, 260, 60, 30);
		reservationfee.add(reservationfeeok);
		
		JButton reservationfeecancel = new JButton("���");
		reservationfeecancel.setBounds(144, 260, 60, 30);
		reservationfee.add(reservationfeecancel);
		
		reservationfee.setVisible(true);
		reservationfee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
