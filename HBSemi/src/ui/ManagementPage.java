package ui;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class ManagementPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String managingtitle = "����������: 20*15";
		
		
		
		JFrame managingpage = new JFrame(managingtitle);
		managingpage.setBounds(900, 200, 568, 426);
		managingpage.setLayout(null);
		managingpage.setBackground(Color.WHITE);
		
		
		JLabel managingpagetitle = new JLabel("����������");
		managingpagetitle.setBounds(20,10,80,30);
		managingpage.add(managingpagetitle);
		
		
		
		JButton membermanagement = new JButton("����ڰ���");
		membermanagement.setBounds(30,50,90,30);
		managingpage.add(membermanagement);
		
		JButton accountingmanagement = new JButton("ȸ�����");
		accountingmanagement.setBounds(120,50,90,30);
		managingpage.add(accountingmanagement);
		
		JButton parkinglotmanagement = new JButton("��������");
		parkinglotmanagement.setBounds(210,50,90,30);
		managingpage.add(parkinglotmanagement);
		
		
		JButton manageprintbutton = new JButton("���");
		manageprintbutton.setBounds(460, 50, 70, 30);
		managingpage.add(manageprintbutton);
		
		JButton managesavebutton = new JButton("����");
		managesavebutton.setBounds(390, 50, 70, 30);
		managingpage.add(managesavebutton);
		
		
		//�⺻â
		JPanel managepagemain = new JPanel();
		managepagemain.setBounds(30,80,500,280);
		managepagemain.setBackground(Color.DARK_GRAY);
		
		
		//����ڰ���
		JPanel membermanagementmain = new JPanel();
		membermanagementmain.setLayout(null);
		membermanagementmain.setBounds(30, 80, 500, 280);
		membermanagementmain.setBackground(Color.GREEN);
		
		JButton normalmemberinfoview = new JButton("ȸ����ȸ");
		normalmemberinfoview.setBounds(0, 0, 80, 30);
		membermanagementmain.add(normalmemberinfoview);
		
		JButton workermemberinfoview = new JButton("��ȸ����ȸ");
		workermemberinfoview.setBounds(0, 30, 80, 30);
		membermanagementmain.add(workermemberinfoview);
		
		
		JPanel infoprintboard = new JPanel(); //���� ���� â��.
		infoprintboard.setLayout(null);
		infoprintboard.setBounds(80, 0, 420, 280);
		infoprintboard.setBackground(Color.WHITE);
		
		
		
		
		membermanagementmain.add(infoprintboard);

		
		//ȸ�����
		JPanel accountingmanagementmain = new JPanel();
		accountingmanagementmain.setLayout(null);
		accountingmanagementmain.setBounds(30, 80, 500, 280);
		accountingmanagementmain.setBackground(Color.RED);
		
		JButton yearread = new JButton("��");
		yearread.setBounds(0,0,50,30);
		accountingmanagementmain.add(yearread);
		
		JButton monthread = new JButton("��");
		monthread.setBounds(0,30,50,30);
		accountingmanagementmain.add(monthread);
		
		JButton weekread = new JButton("��");
		weekread.setBounds(0,60,50,30);
		accountingmanagementmain.add(weekread);
		
		JButton dayread = new JButton("��");
		dayread.setBounds(0,90,50,30);
		accountingmanagementmain.add(dayread);
		
		JPanel accountinginfoprintboard = new JPanel(); //���� ���� â��.
		accountinginfoprintboard.setLayout(null);
		accountinginfoprintboard.setBounds(50, 0, 450, 280);
		accountinginfoprintboard.setBackground(Color.YELLOW);
		accountingmanagementmain.add(accountinginfoprintboard);
		
		
		JPanel accountingdebitsideboard = new JPanel();
		accountingdebitsideboard.setLayout(null);
		accountingdebitsideboard.setBounds(0, 0, 190, 280);
		accountingdebitsideboard.setBackground(Color.GREEN);
		accountinginfoprintboard.add(accountingdebitsideboard);
		
		JPanel accountingdebitsidetitleboard = new JPanel();
		accountingdebitsidetitleboard.setLayout(null);
		accountingdebitsidetitleboard.setBounds(0, 0, 120, 280);
		accountingdebitsidetitleboard.setBackground(Color.GRAY);
		accountingdebitsideboard.add(accountingdebitsidetitleboard);
		
		JPanel accountingdebitsideamountboard = new JPanel();
		accountingdebitsideamountboard.setLayout(null);
		accountingdebitsideamountboard.setBounds(120, 0, 70, 280);
		accountingdebitsideamountboard.setBackground(Color.WHITE);
		accountingdebitsideboard.add(accountingdebitsideamountboard);
		
		
		JPanel accountingcreditsideboard = new JPanel();
		accountingcreditsideboard.setLayout(null);
		accountingcreditsideboard.setBounds(190, 0, 190, 280);
		accountingcreditsideboard.setBackground(Color.YELLOW);
		accountinginfoprintboard.add(accountingcreditsideboard);
		
		
		JPanel accountingcreditsidetitleboard = new JPanel();
		accountingcreditsidetitleboard.setLayout(null);
		accountingcreditsidetitleboard.setBounds(0, 0, 120, 280);
		accountingcreditsidetitleboard.setBackground(Color.GRAY);
		accountingcreditsideboard.add(accountingcreditsidetitleboard);
		
		JPanel accountingcreditsideamountboard = new JPanel();
		accountingcreditsideamountboard.setLayout(null);
		accountingcreditsideamountboard.setBounds(120, 0, 70, 280);
		accountingcreditsideamountboard.setBackground(Color.WHITE);
		accountingcreditsideboard.add(accountingcreditsideamountboard);
		
		//���������
		JPanel parkinglotmanagementmain = new JPanel();
		parkinglotmanagementmain.setLayout(null);
		parkinglotmanagementmain.setBounds(30, 80, 500, 280);
		parkinglotmanagementmain.setBackground(Color.BLUE);
		
		JRadioButton maintainancejrb = new JRadioButton("��������", true);
		maintainancejrb.setBounds(0, 0, 80, 30);
		parkinglotmanagementmain.add(maintainancejrb);
		
		JRadioButton seteventjrb = new JRadioButton("�̺�Ʈ");
		seteventjrb.setBounds(80,0,80,30);
		parkinglotmanagementmain.add(seteventjrb);
		
		ButtonGroup parkinglotmanagementbg = new ButtonGroup();
		parkinglotmanagementbg.add(maintainancejrb);
		parkinglotmanagementbg.add(seteventjrb);
		
		
		
		
		managepagemain = membermanagementmain;
	//	managepagemain = accountingmanagementmain;
	//	managepagemain = parkinglotmanagementmain;
		
		
		
		managingpage.add(managepagemain);
		
		
		managingpage.setVisible(true);
        managingpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
		
	}

}
