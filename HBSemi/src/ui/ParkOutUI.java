package ui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ParkOutUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�� ��ȣ�� �Է��ϸ� ����� ������, ����.
		//�˾� ������ ���� UI
		
		JFrame parkout = new JFrame("�����˾�â: 10*12");
		parkout.setBounds(300, 200, 284, 340);
		parkout.setLayout(null);
		parkout.setBackground(Color.WHITE);
		
		
		JLabel parkoutnoticelabel = new JLabel("���� ������ �����մϴ�.");
		parkoutnoticelabel.setBounds(20, 20, 260, 30);
		parkout.add(parkoutnoticelabel);
		
		
		JLabel parkoutcarnuminputlabel = new JLabel("������ȣ");
		parkoutcarnuminputlabel.setBounds(30, 60, 80, 30);
		parkout.add(parkoutcarnuminputlabel);
		
		JTextField personalinfocarnumfield1 = new JTextField("���� 00 �� 0000");
		personalinfocarnumfield1.setBounds(110, 60, 134, 30);
		parkout.add(personalinfocarnumfield1);
		
		JButton payforthefee = new JButton("�����ϱ�");
		payforthefee.setBounds(92,115,100,30);
		parkout.add(payforthefee);
		
		
		
		String paycheckment = null; //��Ʈ ���� ����
		
		JLabel paycheck = new JLabel(paycheckment);
		paycheck.setBounds(30, 150, 224, 30);
		parkout.add(paycheck);
		
		/*
		  if(~~==true)
		  paycheckment = "������ �Ϸ�Ǿ���.";
		 */
		
		
		
		JLabel parkoutaskingmentlabel = new JLabel("��� ������ ��ġ�� ������ �����մϴ�.");
		parkoutaskingmentlabel.setBounds(25, 180, 260, 30);
		parkout.add(parkoutaskingmentlabel);
		
		
		
		
		
		
		
		JButton parkoutok = new JButton("Ȯ��");
		parkoutok.setBounds(80, 230, 60, 30);
		parkout.add(parkoutok);
		
		JButton parkoutcancel = new JButton("���");
		parkoutcancel.setBounds(144, 230, 60, 30);
		parkout.add(parkoutcancel);
		
		parkout.setVisible(true);
        parkout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}

}
