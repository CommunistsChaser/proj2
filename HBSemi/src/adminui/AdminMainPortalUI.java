package adminui;

import java.awt.Color;
import java.awt.Font;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AdminMainPortalUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame adminportal = new JFrame("�����������α׷�");
		adminportal.setBounds(300, 200, 825, 510);
		adminportal.setLayout(null);
		adminportal.setBackground(Color.WHITE);
		
		
		JMenuBar adminmenubar = new JMenuBar();
		adminportal.setJMenuBar(adminmenubar);
		
		JMenu main1 = new JMenu("�޴�1");
		adminmenubar.add(main1);
		JMenuItem item1_1 = new JMenuItem("1_1");
		main1.add(item1_1);

		adminmenubar.setVisible(true);
		
		JButton logout = new JButton("�α׾ƿ�");
		logout.setBounds(720, 25, 80, 30);
		adminportal.add(logout);
		
		
		JLabel title = new JLabel("�����������α׷�: ����������");
		title.setFont(new Font("Serif", Font.BOLD, 20));
		title.setBounds(30, 15, 300, 45);
		adminportal.add(title);
		
		
		JButton reservation = new JButton("��ȸ");
		reservation.setBounds(30,70,180,30);
		adminportal.add(reservation);
		
		JButton parkin = new JButton("���������");
		parkin.setBounds(30,100,180,30);
		adminportal.add(parkin);
		
		JButton parkout = new JButton("ȸ�����");
		parkout.setBounds(30,130,180,30);
		adminportal.add(parkout);
		
		JButton notice = new JButton("��������");
		notice.setBounds(30,160,180,30);
		adminportal.add(notice);
		

/////////////////////////////////////////////////////////////////////////////////////////////////		
		
		//���������â
		JPanel maincontentsprint = new JPanel();
		maincontentsprint.setLayout(null);
		maincontentsprint.setBounds(220, 70, 580, 340);
		maincontentsprint.setBackground(Color.white);
		adminportal.add(maincontentsprint);
		
		
		//�ϴ� �����޴� �־���� ���� Ȯ��. ŭ������ �޴� ��ư ������ ���⿡ �����޴� ���.
		
		JPanel menuitempanel = new JPanel();
		menuitempanel.setBounds(330,15,450,50);
		adminportal.add(menuitempanel);
		
		
		//������ȸ �����޴� �� �����޴� ��� �г�
		JPanel infoscanitempanel = new JPanel();
		infoscanitempanel.setBounds(0, 0, 450, 49);
		infoscanitempanel.setBackground(Color.white);
		
		JButton carinfo = new JButton("������ȸ");
		carinfo.setBounds(290, 10, 80, 30);
		infoscanitempanel.add(carinfo);
		
		JButton memberinfo = new JButton("ȸ����ȸ");
		memberinfo.setBounds(370,10,80,30);
		infoscanitempanel.add(memberinfo);
		
		
//		menuitempanel.add(infoscanitempanel);
		
		
//		�̿볻�� ��ȸ�ϴ� ���̺�
		
		JLabel carinfotabletitle = new JLabel("�̿� ���� ��ȸ");
		carinfotabletitle.setBounds(0, 5, 100, 30);
//		maincontentsprint.add(carinfotabletitle);
		
		Vector carinfoindex = new Vector<>();
		carinfoindex.add("��");
		carinfoindex.add("��");
		carinfoindex.add("��");
		carinfoindex.add("����-����");
		carinfoindex.add("����-����");
		carinfoindex.add("����");
		carinfoindex.add("����");
		carinfoindex.add("������ȣ");
		carinfoindex.add("��ȭ��ȣ");
	  
	  
	  
		Vector<Vector> carinfodata = new Vector<>();
		for(int i = 0; i < 50 ; i++)carinfodata.add(new Vector());

		JTable carinfotable = new JTable(carinfodata, carinfoindex);
		carinfotable.setLayout(null);
		JScrollPane carinfotablescroll = new JScrollPane(carinfotable);
		carinfotablescroll.setBounds(0,40, 568, 300);
	  
	  
//		maincontentsprint.add(carinfotablescroll);
		
		
//		ȸ������ ��ȸ�ϴ� ���̺�
		
		JLabel memberinfotabletitle = new JLabel("ȸ�� ���� ��ȸ");
		memberinfotabletitle.setBounds(0, 5, 100, 30);
//		maincontentsprint.add(memberinfotabletitle);
		
		Vector memberinfoindex = new Vector<>();
		memberinfoindex.add("1");
		memberinfoindex.add("2");
		memberinfoindex.add("3");
		memberinfoindex.add("4");
		memberinfoindex.add("5");
		memberinfoindex.add("6");
		memberinfoindex.add("7");
		memberinfoindex.add("8");
		memberinfoindex.add("9");
		
		
		Vector<Vector> memberinfodata = new Vector<>();
		for(int i = 0 ; i < 50 ; i++)memberinfodata.add(new Vector());
		
		JTable memberinfotable = new JTable(memberinfodata, memberinfoindex);
		memberinfotable.setLayout(null);
		JScrollPane memberinfotablescroll = new JScrollPane(memberinfotable);
		memberinfotablescroll.setBounds(0,40,568,300);
		
//		maincontentsprint.add(memberinfotablescroll);
		
		
//		������Ʈ ��ȸ�ϴ� ���̺�
		
		JLabel blacklistinfotabletitle = new JLabel("������Ʈ ��ȸ");
		blacklistinfotabletitle.setBounds(0, 5, 100, 30);
//		maincontentsprint.add(blacklistinfotabletitle);
		
		Vector blacklistinfoindex = new Vector<>();
		blacklistinfoindex.add("1");
		blacklistinfoindex.add("2");
		blacklistinfoindex.add("3");
		blacklistinfoindex.add("4");
		blacklistinfoindex.add("5");
		blacklistinfoindex.add("6");
		blacklistinfoindex.add("7");
		blacklistinfoindex.add("8");
		blacklistinfoindex.add("9");
		
		
		Vector<Vector> blacklistinfodata = new Vector<>();
		for(int i = 0 ; i < 50 ; i++)blacklistinfodata.add(new Vector());
		
		JTable blacklistinfotable = new JTable(blacklistinfodata, blacklistinfoindex);
		blacklistinfotable.setLayout(null);
		JScrollPane blacklistinfotablescroll = new JScrollPane(blacklistinfotable);
		blacklistinfotablescroll.setBounds(0,40,568,300);
		
//		maincontentsprint.add(memberinfotablescroll);
		
		
		
		//��������� �����޴� �� �����޴� ��� �г�
		JPanel parkinglotmanagingitempanel = new JPanel();
		parkinglotmanagingitempanel.setBounds(0, 0, 450, 49);
		parkinglotmanagingitempanel.setBackground(Color.WHITE);
		
		JButton accesssetting = new JButton("��������");
		accesssetting.setBounds(370, 10, 80, 30);
		parkinglotmanagingitempanel.add(accesssetting);
		
		
		
//		UI �޾ƿ;��� ��¥ �ϳ� ���;� �ϰ�.
		
		
		
//		menuitempanel.add(parkinglotmanagingitempanel);
		
		
		//ȸ����� �����޴� �� �����޴� ��� �г�
		JPanel accountingitempanel = new JPanel();
		accountingitempanel.setBounds(0, 0, 450, 49);
		accountingitempanel.setBackground(Color.WHITE);
		
		JButton infoperyear = new JButton("���� ��ȸ");
		infoperyear.setBounds(130,70,80,30);
		accountingitempanel.add(infoperyear);
		
		JButton infopermonth = new JButton("���� ��ȸ");
		infopermonth.setBounds(210,70,80,30);
		accountingitempanel.add(infopermonth);
		
		JButton infoperweek = new JButton("�ֺ� ��ȸ");
		infoperweek.setBounds(290,70,80,30);
		accountingitempanel.add(infoperweek);
		
		JButton infoperday = new JButton("�Ϻ� ��ȸ");
		infoperday.setBounds(370,70,80,30);
		accountingitempanel.add(infoperday);
		
		menuitempanel.add(accountingitempanel);
		
		
		JLabel accountingtabletitle = new JLabel("ȸ�� ����");
		accountingtabletitle.setBounds(0, 5, 100, 30);
		maincontentsprint.add(accountingtabletitle);
		
		
		Vector accountingindex = new Vector<>();
		accountingindex.add("debnum");
		accountingindex.add("����(����)");
		accountingindex.add("���� �ݾ�");
		accountingindex.add("���");
		accountingindex.add("crdnum");
		accountingindex.add("�뺯(����)");
		accountingindex.add("�뺯 �ݾ�");
		accountingindex.add("���");
		accountingindex.add("���");
		
		
		Vector<Vector> accountingdata = new Vector<>();
		for(int i = 0 ; i < 50 ; i++)accountingdata.add(new Vector());
		
		JTable accountingtable = new JTable(accountingdata, accountingindex);
		accountingtable.setLayout(null);
		JScrollPane accountingtablescroll = new JScrollPane(accountingtable);
		accountingtablescroll.setBounds(0,40,568,300);
		
		
		maincontentsprint.add(accountingtablescroll);
		

/////////////////////////////////////////////////////////////////////////////////////////////		
		
		
		//��������
		JPanel noticeitempanel = new JPanel();
		noticeitempanel.setBounds(0, 0, 450, 49);
		
		JButton addnotice = new JButton("���� ���");
		addnotice.setBounds(370, 70, 80, 30);
		noticeitempanel.add(addnotice);
		
		JButton deletenotice = new JButton("���� ����");
		deletenotice.setBounds(290, 70, 80, 30);
		noticeitempanel.add(deletenotice);
		
//		menuitempanel.add(noticeitempanel);
		
		
		JTextArea noticecontentsfield = new JTextArea("������ �Է��ϼ���. (�ִ� 512����)");
		noticecontentsfield.setBounds(0, 0, 290, 340);
		noticecontentsfield.setLineWrap(true);
		maincontentsprint.add(noticecontentsfield);
		
		JButton sendthisnotice = new JButton("�� ������ ����մϴ�.");
		sendthisnotice.setBounds(25, 300, 250, 30);
//		noticecontentsfield.add(sendthisnotice);

		
		JPanel noticeprintfield = new JPanel();
		noticeprintfield.setBackground(Color.LIGHT_GRAY);
		noticeprintfield.setBounds(290, 0, 290, 340);
//		maincontentsprint.add(noticeprintfield);
		
		
		JLabel noticetext = new JLabel("���ÿ������ÿ���");
		noticetext.setBounds(0, 0, 290, 340);
//		maincontentsprint.add(noticetext);
		// ���⿡ �ؽ�Ʈ�� �޾ƿ����� �ߴµ� �ϴ� �ȵŵ� ����.
		
		
//////////////////////////////////////////////////////////////////////////////////		
		
		
		
		
		JTextField jtf = new JTextField();
		jtf.setBounds(30, 360, 180, 50);
		jtf.setBackground(Color.white);
		adminportal.add(jtf);
		
		
		JButton btsend = new JButton("��");//����Ű
		btsend.setBounds(140,10,30,30);
		jtf.add(btsend);
		
		JPanel jpchat = new JPanel();
		jpchat.setBounds(30, 195, 180, 165);
		jpchat.setBackground(Color.WHITE);
		adminportal.add(jpchat);
		
		
		
		
		
		
		
		adminportal.setVisible(true);
        adminportal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
