package ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JoinUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		�ʿ�����: 
		
		*/
		
		JFrame join = new JFrame("ȸ������â: 10*18");
		join.setBounds(600, 200, 284, 512);
		join.setLayout(null);
		join.setBackground(Color.WHITE);
		
		JLabel jointitle = new JLabel("ȸ������");
//		jointitle.setFont(new Font("Serif", Font.BOLD, 20));
		jointitle.setBounds(20,10,80,40);
		join.add(jointitle);
		
		JLabel joinline1label = new JLabel("-----------------------------------------------------");
		joinline1label.setBounds(30,35,224,30);
		join.add(joinline1label);
		
		JLabel namelabel = new JLabel("�̸�");
		namelabel.setBounds(30,65,80,30);
		join.add(namelabel);
		
		JTextField namefield = new JTextField("���ÿ���");
		namefield.setBounds(110, 65, 134, 30);
		join.add(namefield);
		
		
		String namechar = namefield.getText();
		System.out.println(namechar);
		
		JLabel phonelabel = new JLabel("��ȭ��ȣ");
		phonelabel.setBounds(30,95,80,30);
		join.add(phonelabel);
		
		JTextField phonenumberfield = new JTextField();
		phonenumberfield.setBounds(110, 95, 134, 30);
		join.add(phonenumberfield);
		
		/*
		���Խ� ��� ��.
		
		
		*/
		JLabel idlabel = new JLabel("ID");
		idlabel.setBounds(30,135,80,30);
		join.add(idlabel);
		
		JTextField idfield = new JTextField();
		idfield.setBounds(110, 135, 134, 30);
		join.add(idfield);
		
		JLabel pwlabel = new JLabel("PW");
		pwlabel.setBounds(30,165,80,30);
		join.add(pwlabel);
		
		JTextField pwfield = new JTextField();
		pwfield.setBounds(110, 165, 134, 30);
		join.add(pwfield);
		
		
		JLabel pwconfirmlabel = new JLabel("PW ��Ȯ��");
		pwconfirmlabel.setBounds(30,195,80,30);
		join.add(pwconfirmlabel);
		
		JTextField pwconfirmfield = new JTextField();
		pwconfirmfield.setBounds(110, 195, 134, 30);
		join.add(pwconfirmfield);
		
		
		
		
		JLabel carlabel = new JLabel("��������");
		carlabel.setBounds(30,235,80,30);
		join.add(carlabel);
		
		JTextField carfield1 = new JTextField("���� 00");
		carfield1.setBounds(110, 235, 55, 30);
		join.add(carfield1);
		
		
		JTextField carfield2 = new JTextField("��");
		carfield2.setBounds(167, 235, 20, 30);
		join.add(carfield2);
		
		JTextField carfield3 = new JTextField("0000");
		carfield3.setBounds(189, 235, 55, 30);
		join.add(carfield3);
		
		
		
		JLabel askworkernumber = new JLabel("������ȣ�� �Է��ϼ���(����)");
		askworkernumber.setBounds(30,280,200,30);
		join.add(askworkernumber);
		
		
		String num = null;
		
		JTextField askworkernumberfield = new JTextField(num);
		askworkernumberfield.setBounds(30, 310, 214, 30);
		join.add(askworkernumberfield);
		
		String numadded = askworkernumberfield.getText();
		num += numadded;
		askworkernumberfield.setText(num);
		
		System.out.println(num);
		
		
		JLabel pollabel = new JLabel("�������� ��޹�ħ�� �����մϴ�.");
		pollabel.setBounds(30,345,224,30);
		join.add(pollabel);
		
		JRadioButton joinyes = new JRadioButton("��", true);
		joinyes.setBounds(70,370,65,30);
		join.add(joinyes);
		
		JRadioButton joinno = new JRadioButton("�ƴϿ�");
		joinno.setBounds(134,370,70,30);
		join.add(joinno);
		
		ButtonGroup joinyesno = new ButtonGroup();
		joinyesno.add(joinyes);
		joinyesno.add(joinno);
		
		
		JButton joinsubmit = new JButton("����");
		joinsubmit.setBounds(65,410,65,30);
		join.add(joinsubmit);
		
		JButton joinsubmitcancel = new JButton("���");
		joinsubmitcancel.setBounds(139,410,70,30);
		join.add(joinsubmitcancel);
		
		
		join.setVisible(true);
        join.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
