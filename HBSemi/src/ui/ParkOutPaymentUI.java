package ui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ParkOutPaymentUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� ��ݰ�� �˾� UI
		
		JFrame parkoutpayment = new JFrame("�����˾�â: 10*6");
		parkoutpayment.setBounds(300, 200, 284, 170);
		parkoutpayment.setLayout(null);
		parkoutpayment.setBackground(Color.WHITE);
		
		
		String paymentnoticement = " :"; // �ݾ� �� �̹� �����Ͽ����ϴ� �޴� ����
		
		
		
		JLabel calculatefee = new JLabel("��� ���" + paymentnoticement);
		calculatefee.setBounds(20, 20, 244, 30);
		parkoutpayment.add(calculatefee);
		
		
		/*
		
		���⿡ �ݾ� ��� �޼ҵ� �ֱ�
		
		*/
		
		JButton paycommit = new JButton("Ȯ�� �� ����");
		paycommit.setBounds(80, 80, 124, 30);
		parkoutpayment.add(paycommit);
		
		/*
		
		���⿡ Ȯ�� �� ���� ��ư�� ������ �� �߻��ϴ� �̺�Ʈ �ֱ�
		
		*/

		parkoutpayment.setVisible(true);
        parkoutpayment.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
