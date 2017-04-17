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
		
		JFrame parkin = new JFrame("�����˾�â: 10*18");
		parkin.setBounds(600, 200, 284, 512);
		parkin.setLayout(null);
		parkin.setBackground(Color.WHITE);
		
		JLabel parkinment = new JLabel("���� ������ �����մϴ�.");
		parkinment.setBounds(20,15,224,30);
		parkin.add(parkinment);
		
		JLabel parkinline1label = new JLabel("-----------------------------------------------------");
		parkinline1label.setBounds(30,40,224,30);
		parkin.add(parkinline1label);
		
		JLabel parkindate = new JLabel("�̿��Ͻ�");
		parkindate.setBounds(20,65,80,30);
		parkin.add(parkindate);
		
		String [] parkinmonthArr = {
				"��","1","2","3","4","5","6","7","8","9","10","11","12"};
		JComboBox parkinmonth = new JComboBox<>(parkinmonthArr);
		parkinmonth.setBounds(30, 95, 50,30);
		parkin.add(parkinmonth);
		
		JLabel monthchar = new JLabel("��");
		monthchar.setBounds(80,95,30,30);
		parkin.add(monthchar);
		
		String [] parkindayArr = {
				"��","1","2","3","4","5","6","7","8","9","10",
				"11","12","13","14","15","16","17","18","19","20",
				"21","22","23","24","25","26","27","28","29","30","31"};
		
		JComboBox parkinday = new JComboBox<>(parkindayArr);
		parkinday.setBounds(110, 95, 50,30);
		parkin.add(parkinday);
		
		JLabel daychar = new JLabel("��");
		daychar.setBounds(160,95,30,30);
		parkin.add(daychar);
		
		
		
		String [] parkinhourArr = {
				"��","1","2","3","4","5","6","7","8","9","10",
				"11","12","13","14","15","16","17","18","19","20",
				"21","22","23","24"};
		
		String [] parkinminArr = {"��", "00", "30"};
		
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
		
		
		JLabel parkinspot = new JLabel("�ڸ�");
		parkinspot.setBounds(20,180,80,30);
		parkin.add(parkinspot);
		
		String [] parkinglotFloorArr = {
				"��","1","2","3"};
		
		JComboBox parkinglotfloor = new JComboBox<>(parkinglotFloorArr);
		parkinglotfloor.setBounds(30,210,40,30);
		parkin.add(parkinglotfloor);
		
		
		String [] parkinglotAreaArr = {
				"��","A","B"};
		
		JComboBox parkinglotarea = new JComboBox<>(parkinglotAreaArr);
		parkinglotarea.setBounds(80,210,40,30);
		parkin.add(parkinglotarea);
		
		String [] parkinglotboxArr = {
				"��","1","2","3","4","5","6","7","8","9","10",
				"11","12","13","14","15","16","17","18","19","20",
				"21","22","23","24"};
		
		JComboBox parkinglotbox = new JComboBox<>(parkinglotboxArr);
		parkinglotbox.setBounds(130,210,40,30);
		parkin.add(parkinglotbox);
		
		JButton parkingconfirm = new JButton("��ȸ");
		parkingconfirm.setBounds(180,210,60,30);
		parkin.add(parkingconfirm);
		
		
		//�Ƹ� �����ð� ������ �������� ���� ui�� ���� �� ���ƿ�.
		
		JButton parkingsearchwithmain = new JButton("������ ��Ȳ ��ȸ");
		parkingsearchwithmain.setBounds(60,250,164,30);
		parkin.add(parkingsearchwithmain);
		
		
		JLabel parkinline2label = new JLabel("-----------------------------------------------------");
		parkinline2label.setBounds(30,280,224,30);
		parkin.add(parkinline2label);
		
		
		JLabel personalinfolabel = new JLabel("�������� �Է�");
		personalinfolabel.setBounds(20,300,180,30);
		parkin.add(personalinfolabel);
		
		
		JLabel personalinfocarnumlabel = new JLabel("���� ��ȣ");
		personalinfocarnumlabel.setBounds(30,330,180,30);
		parkin.add(personalinfocarnumlabel);
		
		JLabel personalinfonumlabel = new JLabel("��ȭ��ȣ");
		personalinfonumlabel.setBounds(30,360,180,30);
		parkin.add(personalinfonumlabel);
		
		
		JTextField personalinfocarnumfield1 = new JTextField("���� 00 �� 0000");
		personalinfocarnumfield1.setBounds(110, 330, 134, 30);
		parkin.add(personalinfocarnumfield1);
		
		
		JTextField personalinfocarnumfield2 = new JTextField("��");
		personalinfocarnumfield2.setBounds(167, 330, 20, 30);
		parkin.add(personalinfocarnumfield2);
		
		JTextField personalinfocarnumfield3 = new JTextField("0000");
		personalinfocarnumfield3.setBounds(189, 330, 55, 30);
		parkin.add(personalinfocarnumfield3);
		
		JTextField personalinfonumfield = new JTextField();
		personalinfonumfield.setBounds(110, 360, 134, 30);
		parkin.add(personalinfonumfield);
		
		
		
		JButton parkingsubmit = new JButton("����");
		parkingsubmit.setBounds(65,410,70,30);
		parkin.add(parkingsubmit);
		
		JButton parkingsubmitcancel = new JButton("���");
		parkingsubmitcancel.setBounds(139,410,70,30);
		parkin.add(parkingsubmitcancel);
		
		
		parkin.setVisible(true);
        parkin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
