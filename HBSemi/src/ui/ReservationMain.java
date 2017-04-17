package ui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ReservationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame reservation = new JFrame("��������â: 10*15");
		reservation.setBounds(600, 200, 284, 426);
		reservation.setLayout(null);
		reservation.setBackground(Color.WHITE);
		
		JLabel reservationment = new JLabel("���� ������ �����մϴ�.");
		reservationment.setBounds(20,20,224,30);
		reservation.add(reservationment);
		
		JLabel reservationline1label = new JLabel("-----------------------------------------------------");
		reservationline1label.setBounds(30,45,224,30);
		reservation.add(reservationline1label);
		
		JLabel reservationdate = new JLabel("�̿��Ͻ�");
		reservationdate.setBounds(20,70,80,30);
		reservation.add(reservationdate);
		
		String [] reservationmonthArr = {
				"��","1","2","3","4","5","6","7","8","9","10","11","12"};
		String [] reservationdayArr = {
				"��","1","2","3","4","5","6","7","8","9","10",
				"11","12","13","14","15","16","17","18","19","20",
				"21","22","23","24","25","26","27","28","29","30","31"};
		
		String [] reservationhourArr = {
				"��","1","2","3","4","5","6","7","8","9","10",
				"11","12","13","14","15","16","17","18","19","20",
				"21","22","23","24"};
		
		String [] reservationminArr = {"��", "00", "30"};
		
		
		////����
		
		JComboBox reservationstartmonth = new JComboBox<>(reservationmonthArr);
		reservationstartmonth.setBounds(30, 100, 40,30);
		reservation.add(reservationstartmonth);
		
		JLabel startmonthchar = new JLabel("/");
		startmonthchar.setBounds(74,100,10,30);
		reservation.add(startmonthchar);
		

		JComboBox reservationstartday = new JComboBox<>(reservationdayArr);
		reservationstartday.setBounds(82, 100, 40,30);
		reservation.add(reservationstartday);
		
		JLabel startdaychar = new JLabel("/");
		startdaychar.setBounds(125,100,25,30);
		reservation.add(startdaychar);
		
		
		JComboBox reservationstarthour = new JComboBox<>(reservationhourArr);
		reservationstarthour.setBounds(138,100,40,30);
		reservation.add(reservationstarthour);
		
		JLabel reservationstarttimedoubledot = new JLabel(":");
		reservationstarttimedoubledot.setBounds(183, 100, 10, 30);
		reservation.add(reservationstarttimedoubledot);
		
		
		JComboBox reservationstartmin = new JComboBox<>(reservationminArr);
		reservationstartmin.setBounds(190,100,40,30);
		reservation.add(reservationstartmin);
		
		JLabel flowchar = new JLabel("~");
		flowchar.setBounds(235,100,30,30);
		reservation.add(flowchar);
		
		
		
		////��
		
		JComboBox reservationendmonth = new JComboBox<>(reservationmonthArr);
		reservationendmonth.setBounds(53, 140, 40,30);
		reservation.add(reservationendmonth);
		
		JLabel endmonthchar = new JLabel("/");
		endmonthchar.setBounds(100,140,10,30);
		reservation.add(endmonthchar);
		

		JComboBox reservationendday = new JComboBox<>(reservationdayArr);
		reservationendday.setBounds(105, 140, 40,30);
		reservation.add(reservationendday);
		
		JLabel enddaychar = new JLabel("/");
		enddaychar.setBounds(150,140,25,30);
		reservation.add(enddaychar);
		
		
		JComboBox reservationendhour = new JComboBox<>(reservationhourArr);
		reservationendhour.setBounds(160,140,40,30);
		reservation.add(reservationendhour);
		
		JLabel reservationendtimedoubledot = new JLabel(":");
		reservationendtimedoubledot.setBounds(203, 140, 10, 30);
		reservation.add(reservationendtimedoubledot);
		
		JComboBox reservationendmin = new JComboBox<>(reservationminArr);
		reservationendmin.setBounds(210,140,40,30);
		reservation.add(reservationendmin);
		
		
		
		
		
	
		
		
		JLabel reservationspot = new JLabel("�ڸ�");
		reservationspot.setBounds(20,200,80,30);
		reservation.add(reservationspot);
		
		String [] parkinglotFloorArr = {
				"��","1","2","3"};
		
		JComboBox parkinglotfloor = new JComboBox<>(parkinglotFloorArr);
		parkinglotfloor.setBounds(30,230,40,30);
		reservation.add(parkinglotfloor);
		
		
		String [] parkinglotAreaArr = {
				"��","A","B"};
		
		JComboBox parkinglotarea = new JComboBox<>(parkinglotAreaArr);
		parkinglotarea.setBounds(80,230,40,30);
		reservation.add(parkinglotarea);
		
		String [] parkinglotboxArr = {
				"��","1","2","3","4","5","6","7","8","9","10",
				"11","12","13","14","15","16","17","18","19","20",
				"21","22","23","24"};
		
		JComboBox parkinglotbox = new JComboBox<>(parkinglotboxArr);
		parkinglotbox.setBounds(130,230,40,30);
		reservation.add(parkinglotbox);
		
		JButton parkingconfirm = new JButton("��ȸ");
		parkingconfirm.setBounds(180,230,60,30);
		reservation.add(parkingconfirm);
		
		
		//�Ƹ� �����ð� ������ �������� ���� ui�� ���� �� ���ƿ�.
		
		JButton parkingsearchwithmain = new JButton("���ο��� �ڸ� ����");
		parkingsearchwithmain.setBounds(60,270,164,30);
		reservation.add(parkingsearchwithmain);
		
		
		
		JButton parkingsubmit = new JButton("����");
		parkingsubmit.setBounds(65,330,70,30);
		reservation.add(parkingsubmit);
		
		JButton parkingsubmitcancel = new JButton("���");
		parkingsubmitcancel.setBounds(139,330,70,30);
		reservation.add(parkingsubmitcancel);
		
		
		reservation.setVisible(true);
        reservation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
