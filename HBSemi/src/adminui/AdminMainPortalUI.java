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
		JFrame adminportal = new JFrame("주차관리프로그램");
		adminportal.setBounds(300, 200, 825, 510);
		adminportal.setLayout(null);
		adminportal.setBackground(Color.WHITE);
		
		
		JMenuBar adminmenubar = new JMenuBar();
		adminportal.setJMenuBar(adminmenubar);
		
		JMenu main1 = new JMenu("메뉴1");
		adminmenubar.add(main1);
		JMenuItem item1_1 = new JMenuItem("1_1");
		main1.add(item1_1);

		adminmenubar.setVisible(true);
		
		JButton logout = new JButton("로그아웃");
		logout.setBounds(720, 25, 80, 30);
		adminportal.add(logout);
		
		
		JLabel title = new JLabel("주차관리프로그램: 관리페이지");
		title.setFont(new Font("Serif", Font.BOLD, 20));
		title.setBounds(30, 15, 300, 45);
		adminportal.add(title);
		
		
		JButton reservation = new JButton("조회");
		reservation.setBounds(30,70,180,30);
		adminportal.add(reservation);
		
		JButton parkin = new JButton("주차장관리");
		parkin.setBounds(30,100,180,30);
		adminportal.add(parkin);
		
		JButton parkout = new JButton("회계관리");
		parkout.setBounds(30,130,180,30);
		adminportal.add(parkout);
		
		JButton notice = new JButton("공지사항");
		notice.setBounds(30,160,180,30);
		adminportal.add(notice);
		

/////////////////////////////////////////////////////////////////////////////////////////////////		
		
		//콘텐츠출력창
		JPanel maincontentsprint = new JPanel();
		maincontentsprint.setLayout(null);
		maincontentsprint.setBounds(220, 70, 580, 340);
		maincontentsprint.setBackground(Color.white);
		adminportal.add(maincontentsprint);
		
		
		//일단 하위메뉴 넣어놓을 공간 확보. 큼지막한 메뉴 버튼 누르면 여기에 하위메뉴 출력.
		
		JPanel menuitempanel = new JPanel();
		menuitempanel.setBounds(330,15,450,50);
		adminportal.add(menuitempanel);
		
		
		//정보조회 하위메뉴 및 하위메뉴 담는 패널
		JPanel infoscanitempanel = new JPanel();
		infoscanitempanel.setBounds(0, 0, 450, 49);
		infoscanitempanel.setBackground(Color.white);
		
		JButton carinfo = new JButton("차량조회");
		carinfo.setBounds(290, 10, 80, 30);
		infoscanitempanel.add(carinfo);
		
		JButton memberinfo = new JButton("회원조회");
		memberinfo.setBounds(370,10,80,30);
		infoscanitempanel.add(memberinfo);
		
		
//		menuitempanel.add(infoscanitempanel);
		
		
//		이용내역 조회하는 테이블
		
		JLabel carinfotabletitle = new JLabel("이용 내역 조회");
		carinfotabletitle.setBounds(0, 5, 100, 30);
//		maincontentsprint.add(carinfotabletitle);
		
		Vector carinfoindex = new Vector<>();
		carinfoindex.add("층");
		carinfoindex.add("열");
		carinfoindex.add("번");
		carinfoindex.add("예약-시작");
		carinfoindex.add("예약-종료");
		carinfoindex.add("입차");
		carinfoindex.add("출차");
		carinfoindex.add("차량번호");
		carinfoindex.add("전화번호");
	  
	  
	  
		Vector<Vector> carinfodata = new Vector<>();
		for(int i = 0; i < 50 ; i++)carinfodata.add(new Vector());

		JTable carinfotable = new JTable(carinfodata, carinfoindex);
		carinfotable.setLayout(null);
		JScrollPane carinfotablescroll = new JScrollPane(carinfotable);
		carinfotablescroll.setBounds(0,40, 568, 300);
	  
	  
//		maincontentsprint.add(carinfotablescroll);
		
		
//		회원정보 조회하는 테이블
		
		JLabel memberinfotabletitle = new JLabel("회원 정보 조회");
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
		
		
//		블랙리스트 조회하는 테이블
		
		JLabel blacklistinfotabletitle = new JLabel("블랙리스트 조회");
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
		
		
		
		//주차장관리 하위메뉴 및 하위메뉴 담는 패널
		JPanel parkinglotmanagingitempanel = new JPanel();
		parkinglotmanagingitempanel.setBounds(0, 0, 450, 49);
		parkinglotmanagingitempanel.setBackground(Color.WHITE);
		
		JButton accesssetting = new JButton("접근제한");
		accesssetting.setBounds(370, 10, 80, 30);
		parkinglotmanagingitempanel.add(accesssetting);
		
		
		
//		UI 받아와야함 날짜 하나 들어와야 하고.
		
		
		
//		menuitempanel.add(parkinglotmanagingitempanel);
		
		
		//회계관리 하위메뉴 및 하위메뉴 담는 패널
		JPanel accountingitempanel = new JPanel();
		accountingitempanel.setBounds(0, 0, 450, 49);
		accountingitempanel.setBackground(Color.WHITE);
		
		JButton infoperyear = new JButton("연별 조회");
		infoperyear.setBounds(130,70,80,30);
		accountingitempanel.add(infoperyear);
		
		JButton infopermonth = new JButton("월별 조회");
		infopermonth.setBounds(210,70,80,30);
		accountingitempanel.add(infopermonth);
		
		JButton infoperweek = new JButton("주별 조회");
		infoperweek.setBounds(290,70,80,30);
		accountingitempanel.add(infoperweek);
		
		JButton infoperday = new JButton("일별 조회");
		infoperday.setBounds(370,70,80,30);
		accountingitempanel.add(infoperday);
		
		menuitempanel.add(accountingitempanel);
		
		
		JLabel accountingtabletitle = new JLabel("회계 관리");
		accountingtabletitle.setBounds(0, 5, 100, 30);
		maincontentsprint.add(accountingtabletitle);
		
		
		Vector accountingindex = new Vector<>();
		accountingindex.add("debnum");
		accountingindex.add("차변(매출)");
		accountingindex.add("차변 금액");
		accountingindex.add("비고");
		accountingindex.add("crdnum");
		accountingindex.add("대변(지출)");
		accountingindex.add("대변 금액");
		accountingindex.add("비고");
		accountingindex.add("결산");
		
		
		Vector<Vector> accountingdata = new Vector<>();
		for(int i = 0 ; i < 50 ; i++)accountingdata.add(new Vector());
		
		JTable accountingtable = new JTable(accountingdata, accountingindex);
		accountingtable.setLayout(null);
		JScrollPane accountingtablescroll = new JScrollPane(accountingtable);
		accountingtablescroll.setBounds(0,40,568,300);
		
		
		maincontentsprint.add(accountingtablescroll);
		

/////////////////////////////////////////////////////////////////////////////////////////////		
		
		
		//공지사항
		JPanel noticeitempanel = new JPanel();
		noticeitempanel.setBounds(0, 0, 450, 49);
		
		JButton addnotice = new JButton("공지 등록");
		addnotice.setBounds(370, 70, 80, 30);
		noticeitempanel.add(addnotice);
		
		JButton deletenotice = new JButton("공지 삭제");
		deletenotice.setBounds(290, 70, 80, 30);
		noticeitempanel.add(deletenotice);
		
//		menuitempanel.add(noticeitempanel);
		
		
		JTextArea noticecontentsfield = new JTextArea("공지를 입력하세요. (최대 512글자)");
		noticecontentsfield.setBounds(0, 0, 290, 340);
		noticecontentsfield.setLineWrap(true);
		maincontentsprint.add(noticecontentsfield);
		
		JButton sendthisnotice = new JButton("이 공지를 등록합니다.");
		sendthisnotice.setBounds(25, 300, 250, 30);
//		noticecontentsfield.add(sendthisnotice);

		
		JPanel noticeprintfield = new JPanel();
		noticeprintfield.setBackground(Color.LIGHT_GRAY);
		noticeprintfield.setBounds(290, 0, 290, 340);
//		maincontentsprint.add(noticeprintfield);
		
		
		JLabel noticetext = new JLabel("마늘오리마늘오리");
		noticetext.setBounds(0, 0, 290, 340);
//		maincontentsprint.add(noticetext);
		// 여기에 텍스트를 받아오려고 했는데 일단 안돼도 보냄.
		
		
//////////////////////////////////////////////////////////////////////////////////		
		
		
		
		
		JTextField jtf = new JTextField();
		jtf.setBounds(30, 360, 180, 50);
		jtf.setBackground(Color.white);
		adminportal.add(jtf);
		
		
		JButton btsend = new JButton("▶");//엔터키
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
