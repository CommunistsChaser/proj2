package form;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ReservationMain {

	
	public ReservationMain() {
		// TODO Auto-generated constructor stub
	}
	
   public void work() {
      // TODO Auto-generated method stub
      
      JFrame reservation = new JFrame("주차예약창: 10*15");
      reservation.setBounds(600, 200, 284, 426);
      reservation.setLayout(null);
      reservation.setBackground(Color.WHITE);
      
      JLabel reservationment = new JLabel("주차 예약을 시작합니다.");
      reservationment.setBounds(20,20,224,30);
      reservation.add(reservationment);
      
      JLabel reservationline1label = new JLabel("-----------------------------------------------------");
      reservationline1label.setBounds(30,45,224,30);
      reservation.add(reservationline1label);
      
      JLabel reservationdate = new JLabel("이용일시");
      reservationdate.setBounds(30,70,80,30);
      reservation.add(reservationdate);
      
      String [] reservationmonthArr = {
            "월","1","2","3","4","5","6","7","8","9","10","11","12"};
      JComboBox reservationmonth = new JComboBox<>(reservationmonthArr);
      reservationmonth.setBounds(30, 100, 50,30);
      reservation.add(reservationmonth);
      
      JLabel monthchar = new JLabel("월");
      monthchar.setBounds(80,100,30,30);
      reservation.add(monthchar);
      
      String [] reservationdayArr = {
            "일","1","2","3","4","5","6","7","8","9","10",
            "11","12","13","14","15","16","17","18","19","20",
            "21","22","23","24","25","26","27","28","29","30","31"};
      
      JComboBox reservationday = new JComboBox<>(reservationdayArr);
      reservationday.setBounds(110, 100, 50,30);
      reservation.add(reservationday);
      
      JLabel daychar = new JLabel("일");
      daychar.setBounds(160,100,30,30);
      reservation.add(daychar);
      
      
      
      String [] reservationhourArr = {
            "시","1","2","3","4","5","6","7","8","9","10",
            "11","12","13","14","15","16","17","18","19","20",
            "21","22","23","24"};
      
      String [] reservationminArr = {"분", "00", "15", "30", "45"};
      
      JComboBox reservationstarthour = new JComboBox<>(reservationhourArr);
      reservationstarthour.setBounds(30,140,40,30);
      reservation.add(reservationstarthour);
      
      JComboBox reservationendhour = new JComboBox<>(reservationhourArr);
      reservationendhour.setBounds(150,140,40,30);
      reservation.add(reservationendhour);
      
      
      JComboBox reservationstartmin = new JComboBox<>(reservationminArr);
      reservationstartmin.setBounds(80,140,40,30);
      reservation.add(reservationstartmin);
      
      JComboBox reservationendmin = new JComboBox<>(reservationminArr);
      reservationendmin.setBounds(200,140,40,30);
      reservation.add(reservationendmin);
      
      
      JLabel startdot = new JLabel(":");
      startdot.setBounds(75,140,30,30);
      reservation.add(startdot);
      
      JLabel enddot = new JLabel(":");
      enddot.setBounds(155,140,30,30);
      reservation.add(enddot);
      
      JLabel flowchar = new JLabel("~");
      flowchar.setBounds(130,140,30,30);
      reservation.add(flowchar);
      
      
      JLabel reservationspot = new JLabel("자리");
      reservationspot.setBounds(30,200,80,30);
      reservation.add(reservationspot);
      
      String [] parkinglotFloorArr = {
            "층","1","2","3"};
      
      JComboBox parkinglotfloor = new JComboBox<>(parkinglotFloorArr);
      parkinglotfloor.setBounds(30,230,40,30);
      reservation.add(parkinglotfloor);
      
      
      String [] parkinglotAreaArr = {
            "열","A","B"};
      
      JComboBox parkinglotarea = new JComboBox<>(parkinglotAreaArr);
      parkinglotarea.setBounds(80,230,40,30);
      reservation.add(parkinglotarea);
      
      String [] parkinglotboxArr = {
            "번","1","2","3","4","5","6","7","8","9","10",
            "11","12","13","14","15","16","17","18","19","20",
            "21","22","23","24"};
      
      JComboBox parkinglotbox = new JComboBox<>(parkinglotboxArr);
      parkinglotbox.setBounds(130,230,40,30);
      reservation.add(parkinglotbox);
      
      JButton parkingconfirm = new JButton("조회");
      parkingconfirm.setBounds(180,230,60,30);
      reservation.add(parkingconfirm);
      
      
      //아마 수업시간 끝나기 전까지는 예약 ui도 끝날 것 같아요.
      
      JButton parkingsearchwithmain = new JButton("메인에서 자리 선택");
      parkingsearchwithmain.setBounds(60,270,164,30);
      reservation.add(parkingsearchwithmain);
      
      
      
      JButton parkingsubmit = new JButton("제출");
      parkingsubmit.setBounds(65,340,70,30);
      reservation.add(parkingsubmit);
      
      JButton parkingsubmitcancel = new JButton("취소");
      parkingsubmitcancel.setBounds(139,340,70,30);
      reservation.add(parkingsubmitcancel);
      
      
      reservation.setVisible(true);
       
   }

}