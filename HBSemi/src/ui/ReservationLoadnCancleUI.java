package ui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ReservationLoadnCancleUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� ��ȸ�� ĵ�� �ֱ�.
		
		
		JFrame reservationloadncancel = new JFrame("�˾�2.5: 10*18");
		reservationloadncancel.setBounds(600, 200, 284, 426);
		reservationloadncancel.setLayout(null);
		reservationloadncancel.setBackground(Color.WHITE);
		
		
		JLabel reservationloadncanceltitle = new JLabel("������ȸ");
		reservationloadncanceltitle.setBounds(20,10,244,30);
		reservationloadncancel.add(reservationloadncanceltitle);
		
		JLabel reservationloadncancelline1 = new JLabel("----------------------------------------------------");
		reservationloadncancelline1.setBounds(30, 40, 244, 30);
		reservationloadncancel.add(reservationloadncancelline1);
		
		
		JLabel reservationloadment = new JLabel("���೻��");
		reservationloadment.setBounds(20,70,244,30);
		reservationloadncancel.add(reservationloadment);
		
		
		String nullvalue = "__";
		String startmonth, startday, starthour, startmin, endmonth, endday, endhour, endmin, floor, area, number;
		startmonth = nullvalue;
		startday = nullvalue;
		starthour = nullvalue;
		startmin = nullvalue;
		endmonth = nullvalue;
		endday = nullvalue;
		endhour = nullvalue;
		endmin = nullvalue;
		floor = nullvalue;
		area = nullvalue;
		number = nullvalue;
		
		
		
		
		JLabel reservationstarttext = new JLabel
				(startmonth+"��"+startday+"��"+starthour+"��"+startmin+"�� ����");
		reservationstarttext.setBounds(30, 110, 244, 30);
		
		JLabel reservationendtext = new JLabel
				(endmonth+"��"+endday+"��"+endhour+"��"+endmin+"�� ����");
		reservationendtext.setBounds(100, 140, 144, 30);
		
		
		JLabel reservationsite = new JLabel
				(floor+"��"+area+"��"+number+"�� �� ����.");
		reservationsite.setBounds(30, 190, 244,30);
		
		
		
		JButton reservationcancel = new JButton("���� ����ϱ�");
		reservationcancel.setBounds(50, 255, 184, 40);
		
		reservationloadncancel.add(reservationstarttext);	
		reservationloadncancel.add(reservationendtext);
		reservationloadncancel.add(reservationsite);
		reservationloadncancel.add(reservationcancel);
		
		
		
		
		reservationloadncancel.setVisible(true);
		reservationloadncancel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
