package ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginUI{
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame login = new JFrame("로그인: 10*12");
		login.setBounds(300, 200, 284, 340);
		login.setLayout(null);
		login.setBackground(Color.WHITE);
		
		
		JLabel loginment = new JLabel("로그인");
		loginment.setBounds(20,20,224,30);
		login.add(loginment);
		
		
		JLabel idlabel = new JLabel("ID");
		idlabel.setBounds(30,70,224,30);
		login.add(idlabel);
		
		JTextField idfield = new JTextField("주민제의 간장볼링");
		idfield.setBounds(60, 70, 104, 30);
		login.add(idfield);
		
		JLabel pwlabel = new JLabel("PW");
		pwlabel.setBounds(30,100,224,30);
		login.add(pwlabel);
		
		JTextField pwfield = new JTextField();
		pwfield.setBounds(60, 100, 104, 30);
		login.add(pwfield);
		
		JButton commit = new JButton("로그인");
		commit.setBounds(170,70,75,60);
		login.add(commit);
		
		
		JLabel findinfoment = new JLabel("ID/PW가 기억나지 않으신가요?");
		findinfoment.setBounds(30,200,224,30);
		login.add(findinfoment);
		
		JButton findinfobutton = new JButton("ID/PW 찾기");
		findinfobutton.setBounds(30,230,224,30);
		findinfobutton.addActionListener(new ActionListener() {
			   @Override
			   public void actionPerformed(ActionEvent e) {
			      // handle button ActionEvent & display dialog...    
			   }
			});
		login.add(findinfobutton);
		
		
		login.setVisible(true);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public LoginUI()
	{
		JFrame findinfo = new JFrame("회원정보찾기: 12*10");
		findinfo.setBounds(300, 200, 340, 284);
		findinfo.setLayout(null);
		findinfo.setBackground(Color.WHITE);
		
		
		
		JLabel findidtitle = new JLabel("ID 찾기");
		findidtitle.setBounds(10,15,80,30);
		findinfo.add(findidtitle);
		
		
		JLabel insertnamelabel = new JLabel("이름");
		insertnamelabel.setBounds(20,50,80,30);
		findinfo.add(insertnamelabel);
		
		JTextField insertnamefield = new JTextField("");
		insertnamefield.setBounds(80,50,80,30);
		findinfo.add(insertnamefield);
		
		JLabel inserttellabel = new JLabel("전화번호");
		inserttellabel.setBounds(20,80,80,30);
		findinfo.add(inserttellabel);
		
		JTextField inserttelfield = new JTextField("");
		inserttelfield.setBounds(80,80,80,30);
		findinfo.add(inserttelfield);
		
		
		
		///////////////////////////////////////////////////////////
		
		
		JLabel findpwtitle = new JLabel("PW 찾기");
		findpwtitle.setBounds(165,15,80,30);
		findinfo.add(findpwtitle);
		
		
		JLabel insertnamelabel2 = new JLabel("아이디");
		insertnamelabel2.setBounds(175,50,80,30);
		findinfo.add(insertnamelabel2);
		
		JTextField insertnamefield2 = new JTextField("");
		insertnamefield2.setBounds(235,50,80,30);
		findinfo.add(insertnamefield2);
		
		JLabel inserttellabel2 = new JLabel("전화번호");
		inserttellabel2.setBounds(175,80,80,30);
		findinfo.add(inserttellabel2);
		
		JTextField inserttelfield2 = new JTextField("");
		inserttelfield2.setBounds(235,80,80,30);
		findinfo.add(inserttelfield2);
		
		
		JButton findinfoconfirm = new JButton("조회하기");
		findinfoconfirm.setBounds(100, 120, 140, 30);
		findinfo.add(findinfoconfirm);
		
		
		
		String foundinfo = "id/pw를 받는 창입니다.";//조회한 정보(id, pw) 받을 변수
		
		JLabel searchedinfo = new JLabel("조회되었음: "+ foundinfo);
		searchedinfo.setBounds(20, 160, 280, 30);
		findinfo.add(searchedinfo);
		
		
		JLabel inputinfoask = new JLabel("로그인 화면에 입력하시겠습니까?");
		inputinfoask.setBounds(20, 200, 200, 30);
		findinfo.add(inputinfoask);
		
		
		
		JButton findinfook = new JButton("확인");
		findinfook.setBounds(240, 200, 60, 30);
		findinfo.add(findinfook);
		
		
		
		findinfo.setVisible(true);
        findinfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

}
