package ui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ReservationLoadnCancleUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//예약 조회랑 캔슬 넣기.
		
		
		JFrame reservationloadncancel = new JFrame("팝업2.5: 10*18");
		reservationloadncancel.setBounds(600, 200, 284, 426);
		reservationloadncancel.setLayout(null);
		reservationloadncancel.setBackground(Color.WHITE);
		
		
		JLabel reservationloadncanceltitle = new JLabel("예약조회");
		reservationloadncanceltitle.setBounds(20,10,244,30);
		reservationloadncancel.add(reservationloadncanceltitle);
		
		JLabel reservationloadncancelline1 = new JLabel("----------------------------------------------------");
		reservationloadncancelline1.setBounds(30, 40, 244, 30);
		reservationloadncancel.add(reservationloadncancelline1);
		
		
		JLabel reservationloadment = new JLabel("예약내역");
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
				(startmonth+"월"+startday+"일"+starthour+"시"+startmin+"분 부터");
		reservationstarttext.setBounds(30, 110, 244, 30);
		
		JLabel reservationendtext = new JLabel
				(endmonth+"월"+endday+"일"+endhour+"시"+endmin+"분 까지");
		reservationendtext.setBounds(100, 140, 144, 30);
		
		
		JLabel reservationsite = new JLabel
				(floor+"층"+area+"열"+number+"번 에 예약.");
		reservationsite.setBounds(30, 190, 244,30);
		
		
		
		JButton reservationcancel = new JButton("예약 취소하기");
		reservationcancel.setBounds(50, 255, 184, 40);
		
		reservationloadncancel.add(reservationstarttext);	
		reservationloadncancel.add(reservationendtext);
		reservationloadncancel.add(reservationsite);
		reservationloadncancel.add(reservationcancel);
		
		
		
		
		reservationloadncancel.setVisible(true);
		reservationloadncancel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
