package ui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ParkInUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame parkin = new JFrame("입차팝업창: 10*18");
		parkin.setBounds(600, 200, 284, 512);
		parkin.setLayout(null);
		parkin.setBackground(Color.WHITE);
		
		JLabel parkinment = new JLabel("주차 예약을 시작합니다.");
		parkinment.setBounds(20,15,224,30);
		parkin.add(parkinment);
		
		JLabel parkinline1label = new JLabel("-----------------------------------------------------");
		parkinline1label.setBounds(30,40,224,30);
		parkin.add(parkinline1label);
		
		JLabel parkindate = new JLabel("이용일시");
		parkindate.setBounds(20,65,80,30);
		parkin.add(parkindate);
		
		String [] parkinmonthArr = {
				"월","1","2","3","4","5","6","7","8","9","10","11","12"};
		JComboBox parkinmonth = new JComboBox<>(parkinmonthArr);
		parkinmonth.setBounds(30, 95, 50,30);
		parkin.add(parkinmonth);
		
		JLabel monthchar = new JLabel("월");
		monthchar.setBounds(80,95,30,30);
		parkin.add(monthchar);
		
		String [] parkindayArr = {
				"일","1","2","3","4","5","6","7","8","9","10",
				"11","12","13","14","15","16","17","18","19","20",
				"21","22","23","24","25","26","27","28","29","30","31"};
		
		JComboBox parkinday = new JComboBox<>(parkindayArr);
		parkinday.setBounds(110, 95, 50,30);
		parkin.add(parkinday);
		
		JLabel daychar = new JLabel("일");
		daychar.setBounds(160,95,30,30);
		parkin.add(daychar);
		
		
		
		String [] parkinhourArr = {
				"시","1","2","3","4","5","6","7","8","9","10",
				"11","12","13","14","15","16","17","18","19","20",
				"21","22","23","24"};
		
		String [] parkinminArr = {"분", "00", "30"};
		
		JComboBox parkinstarthour = new JComboBox<>(parkinhourArr);
		parkinstarthour.setBounds(30,135,40,30);
		parkin.add(parkinstarthour);
		
		JComboBox parkinendhour = new JComboBox<>(parkinhourArr);
		parkinendhour.setBounds(145,135,40,30);
		parkin.add(parkinendhour);
		
		
		JComboBox parkinstartmin = new JComboBox<>(parkinminArr);
		parkinstartmin.setBounds(85,135,40,30);
		parkin.add(parkinstartmin);
		
		JComboBox parkinendmin = new JComboBox<>(parkinminArr);
		parkinendmin.setBounds(200,135,40,30);
		parkin.add(parkinendmin);
		
		
		JLabel startdot = new JLabel(":");
		startdot.setBounds(75,135,30,30);
		parkin.add(startdot);
		
		JLabel enddot = new JLabel(":");
		enddot.setBounds(190,135,30,30);
		parkin.add(enddot);
		
		JLabel flowchar = new JLabel("~");
		flowchar.setBounds(130,135,30,30);
		parkin.add(flowchar);
		
		
		JLabel parkinspot = new JLabel("자리");
		parkinspot.setBounds(20,180,80,30);
		parkin.add(parkinspot);
		
		String [] parkinglotFloorArr = {
				"층","1","2","3"};
		
		JComboBox parkinglotfloor = new JComboBox<>(parkinglotFloorArr);
		parkinglotfloor.setBounds(30,210,40,30);
		parkin.add(parkinglotfloor);
		
		
		String [] parkinglotAreaArr = {
				"열","A","B"};
		
		JComboBox parkinglotarea = new JComboBox<>(parkinglotAreaArr);
		parkinglotarea.setBounds(80,210,40,30);
		parkin.add(parkinglotarea);
		
		String [] parkinglotboxArr = {
				"번","1","2","3","4","5","6","7","8","9","10",
				"11","12","13","14","15","16","17","18","19","20",
				"21","22","23","24"};
		
		JComboBox parkinglotbox = new JComboBox<>(parkinglotboxArr);
		parkinglotbox.setBounds(130,210,40,30);
		parkin.add(parkinglotbox);
		
		JButton parkingconfirm = new JButton("조회");
		parkingconfirm.setBounds(180,210,60,30);
		parkin.add(parkingconfirm);
		
		
		//아마 수업시간 끝나기 전까지는 예약 ui도 끝날 것 같아요.
		
		JButton parkingsearchwithmain = new JButton("주차장 현황 조회");
		parkingsearchwithmain.setBounds(60,250,164,30);
		parkin.add(parkingsearchwithmain);
		
		
		JLabel parkinline2label = new JLabel("-----------------------------------------------------");
		parkinline2label.setBounds(30,280,224,30);
		parkin.add(parkinline2label);
		
		
		JLabel personalinfolabel = new JLabel("인적사항 입력");
		personalinfolabel.setBounds(20,300,180,30);
		parkin.add(personalinfolabel);
		
		
		JLabel personalinfocarnumlabel = new JLabel("차량 번호");
		personalinfocarnumlabel.setBounds(30,330,180,30);
		parkin.add(personalinfocarnumlabel);
		
		JLabel personalinfonumlabel = new JLabel("전화번호");
		personalinfonumlabel.setBounds(30,360,180,30);
		parkin.add(personalinfonumlabel);
		
		
		JTextField personalinfocarnumfield1 = new JTextField("지역 00 모 0000");
		personalinfocarnumfield1.setBounds(110, 330, 134, 30);
		parkin.add(personalinfocarnumfield1);
		
		
		JTextField personalinfocarnumfield2 = new JTextField("영");
		personalinfocarnumfield2.setBounds(167, 330, 20, 30);
		parkin.add(personalinfocarnumfield2);
		
		JTextField personalinfocarnumfield3 = new JTextField("0000");
		personalinfocarnumfield3.setBounds(189, 330, 55, 30);
		parkin.add(personalinfocarnumfield3);
		
		JTextField personalinfonumfield = new JTextField();
		personalinfonumfield.setBounds(110, 360, 134, 30);
		parkin.add(personalinfonumfield);
		
		
		
		JButton parkingsubmit = new JButton("제출");
		parkingsubmit.setBounds(65,410,70,30);
		parkin.add(parkingsubmit);
		
		JButton parkingsubmitcancel = new JButton("취소");
		parkingsubmitcancel.setBounds(139,410,70,30);
		parkin.add(parkingsubmitcancel);
		
		
		parkin.setVisible(true);
        parkin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
