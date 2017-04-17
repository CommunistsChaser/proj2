package form;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;


public class MainUI {


	JFrame jf;
	JPanel jpboard ;
	JoinUI joinUi;
	LoginUI loginUi;
	ReservationMain reserUi;
	
	
	
	JButton login;
	JButton join;
	JButton reservation;
	JMenu reserv;
	
	public MainUI(JoinUI joinUi, LoginUI loginUi, ReservationMain reserUi) {
		// TODO Auto-generated constructor stub
		
		this.joinUi = joinUi;
		this.loginUi = loginUi;
		this.reserUi = reserUi;
		
		work();
	}
	
	class LoginAction implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			loginUi.work();
		}
	}
	
	class JoinAction implements ActionListener	{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			joinUi.work();
		}
	}
	
	class ReserAction implements ActionListener	{
 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			reserUi.work();
		}
		
	}
	
	
	class BalnkAction implements MouseListener	{
		
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			JLabel label = (JLabel)e.getSource();
			String location = label.getText();
			System.out.println("위치:"+location);
			
			JDialog dia = new JDialog(jf,location + "현황조회",false);
			dia.setBounds(100,100,100,300);
			dia.setLayout(new BorderLayout());
			JLabel l = new JLabel(location);
			dia.add(l, BorderLayout.CENTER);
			dia.setVisible(true);
			
		}
		
	
		public void mouseEntered(MouseEvent e) {}
	
		public void mouseExited(MouseEvent e) {}

		public void mousePressed(MouseEvent e) {}
		
		public void mouseReleased(MouseEvent e) {}
	
	}
	
	
	
   public void work() {
      // TODO Auto-generated method stub
      
      jf = new JFrame("주차관리프로그램");
      jf.setBounds(300, 200, 825, 510);
      jf.setLayout(null);
      jf.setBackground(Color.WHITE);
      
      JMenuBar jmb = new JMenuBar();
      jf.setJMenuBar(jmb);
      
      ////////////////////////////////////////////
      
      JMenu main1 = new JMenu("메뉴1");
      jmb.add(main1);
      JMenuItem item1_1 = new JMenuItem("1_1");
      main1.add(item1_1);
      JMenuItem item1_2 = new JMenuItem("1_2");
      main1.add(item1_2);
      JMenuItem item1_3 = new JMenuItem("1_3");
      main1.add(item1_3);
      
      
      JMenu main2 = new JMenu("메뉴2");
      jmb.add(main2);
      JMenuItem item2_1 = new JMenuItem("2_1");
      main2.add(item2_1);
      JMenuItem item2_2 = new JMenuItem("2_2");
      main2.add(item2_2);
      
      JMenu main3 = new JMenu("메뉴3");
      jmb.add(main3);
      JMenuItem item3_1 = new JMenuItem("3_1");
      main3.add(item3_1);

      jmb.setVisible(true);
      
      ///////////////////////////////////////////
      
      JLabel title = new JLabel("주차관리프로그램");
      title.setFont(new Font("Serif", Font.BOLD, 20));
      title.setBounds(30, 15, 180, 45);
      jf.add(title);
      
      /////////////////////////////////////////// 버튼들
      
      join = new JButton("회원가입");
      join.setBounds(700, 15, 80, 30);
      jf.add(join);
      join.addActionListener(new JoinAction());
      
      login = new JButton("로그인");
      login.setBounds(620, 15, 80, 30);
      jf.add(login);
      login.addActionListener(new LoginAction());
      
      
      
      
      
      reservation = new JButton("예약하기");
      reservation.setBounds(30,60,180,30);
     
      
      jf.add(reservation);
      reservation.addActionListener(new ReserAction());
      
      
      
      JButton parkin = new JButton("입차");
      parkin.setBounds(30,90,180,30);
      jf.add(parkin);
      
      JButton parkout = new JButton("출차");
      parkout.setBounds(30,120,180,30);
      jf.add(parkout);
      
      JButton notice = new JButton("공지사항");
      notice.setBounds(30,150,180,30);
      jf.add(notice);
      
      //////////////////////////////////////////// 채팅창
      
      JTextField jtf = new JTextField();
      jtf.setBounds(30, 360, 180, 50);
      jtf.setBackground(Color.white);
      jf.add(jtf);
      
      
      
      JButton btsend = new JButton("▶");//엔터키
      btsend.setBounds(140,10,30,30);
      jtf.add(btsend);
      
      JPanel jpchat = new JPanel();
      jpchat.setBounds(30, 195, 180, 165);
      jpchat.setBackground(Color.WHITE);
      jf.add(jpchat);
      
      ////////////////////////////////////////////메인보드
      
      //이하 주차장 UI
      
      jpboard = new JPanel();
      jpboard.setBounds(225,60,555,350);
      jpboard.setLayout(null);
      jpboard.setBackground(Color.white);
      
      /*JPanel aaa = new JPanel();
      aaa.setBounds(240,60,555,350);
      aaa.setBackground(Color.gray);
      */
      
      
      JButton fstfl = new JButton("1층");
      fstfl.setBounds(0, 0, 80, 30);
      jpboard.add(fstfl);
      
      JButton sndfl = new JButton("2층");
      sndfl.setBounds(80, 0, 80, 30);
      jpboard.add(sndfl);
      
      JButton trdfl = new JButton("3층");
      trdfl.setBounds(160, 0, 80, 30);
      jpboard.add(trdfl);
      
      JPanel exit = new JPanel();
      exit.setBounds(515, 135, 30, 120);
      jpboard.add(exit);
      
      for(int i=1; i<=10; i++)	{
    	  String name = "a"+i;
    	  JLabel label = new JLabel(name);
    	  label.setBorder(new LineBorder(Color.black));
    	  label.setBounds(10+50*(i-1), 50, 40, 70);
    	  label.setOpaque(true);
    	  label.setBackground(Color.white);
    	  label.addMouseListener(new BalnkAction());
    	  jpboard.add(label);
      }
      
      
     /* JLabel a1 = new JLabel("아아아아아");
      a1.setBorder(new LineBorder(Color.black));
      a1.setBounds(10,50,40,70);
      a1.setOpaque(true);
      a1.setBackground(Color.BLUE);
      jpboard.add(a1);
     
      
      JLabel a2 = new JLabel();
      a2.setBorder(new LineBorder(Color.black));
      a2.setBounds(60,50,40,70);
      a2.setOpaque(true);
      a2.setBackground(Color.BLUE);
      jpboard.add(a2);
      
      JLabel a3 = new JLabel();
      a3.setBounds(110,50,40,70);
      a3.setBackground(Color.RED);
      jpboard.add(a3);
      
      JLabel a4 = new JLabel();
      a4.setBounds(160,50,40,70);
      a4.setBackground(Color.BLUE);
      jpboard.add(a4);
      
      JLabel a5 = new JLabel();
      a5.setBounds(210,50,40,70);
      a5.setBackground(Color.RED);
      jpboard.add(a5);
      
      JLabel a6 = new JLabel();
      a6.setBounds(260,50,40,70);
      a6.setBackground(Color.BLUE);
      jpboard.add(a6);
      
      JLabel a7 = new JLabel();
      a7.setBounds(310,50,40,70);
      a7.setBackground(Color.RED);
      jpboard.add(a7);
      
      JLabel a8 = new JLabel();
      a8.setBounds(360,50,40,70);
      a8.setBackground(Color.RED);
      jpboard.add(a8);
      
      JLabel a9 = new JLabel();
      a9.setBounds(410,50,40,70);
      a9.setBackground(Color.RED);
      jpboard.add(a9);
      
      JLabel a10 = new JLabel();
      a10.setBounds(460,50,40,70);
      a10.setBackground(Color.RED);
      jpboard.add(a10);*/
      
      
      for(int i=1; i<=10; i++)	{
    	  String name = "b"+i;
    	  JLabel label = new JLabel(name);
    	  label.setBorder(new LineBorder(Color.black));
    	  label.setBounds(10+50*(i-1), 265, 40, 70);
    	  label.setOpaque(true);
    	  label.setBackground(Color.white);
    	  label.addMouseListener(new BalnkAction());
    	  jpboard.add(label);
      }
      
     /* JPanel b1 = new JPanel();
      b1.setBounds(10,265,40,70);
      b1.setBackground(Color.BLUE);
      jpboard.add(b1);
      
      JPanel b2 = new JPanel();
      b2.setBounds(60,265,40,70);
      b2.setBackground(Color.RED);
      jpboard.add(b2);
      
      JPanel b3 = new JPanel();
      b3.setBounds(110,265,40,70);
      b3.setBackground(Color.BLUE);
      jpboard.add(b3);
      
      JPanel b4 = new JPanel();
      b4.setBounds(160,265,40,70);
      b4.setBackground(Color.BLUE);
      jpboard.add(b4);
      
      JPanel b5 = new JPanel();
      b5.setBounds(210,265,40,70);
      b5.setBackground(Color.RED);
      jpboard.add(b5);
      
      JPanel b6 = new JPanel();
      b6.setBounds(260,265,40,70);
      b6.setBackground(Color.RED);
      jpboard.add(b6);
      
      JPanel b7 = new JPanel();
      b7.setBounds(310,265,40,70);
      b7.setBackground(Color.BLUE);
      jpboard.add(b7);
      
      JPanel b8 = new JPanel();
      b8.setBounds(360,265,40,70);
      b8.setBackground(Color.RED);
      jpboard.add(b8);
      
      JPanel b9 = new JPanel();
      b9.setBounds(410,265,40,70);
      b9.setBackground(Color.BLUE);
      jpboard.add(b9);
      
      JPanel b10 = new JPanel();
      b10.setBounds(460,265,40,70);
      b10.setBackground(Color.RED);
      jpboard.add(b10);
      */
      
      
      //기존 보드에 새로운 보드를 대입해서 화면전환.
      
      //jpboard = aaa;

      jf.add(jpboard);
      
      ////////////////////////////////////////////
      
      ////////////////////////////////////////////
      
      jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

}	