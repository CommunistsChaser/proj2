package ui;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FindInfoUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		JButton findIDconfirm = new JButton("ID 조회하기");
		findIDconfirm.setBounds(80,120, 80, 30);
		findinfo.add(findIDconfirm);
		
		
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
		
		JButton findPWconfirm = new JButton("PW 조회하기");
		findPWconfirm.setBounds(235, 120, 80, 30);
		findinfo.add(findPWconfirm);
		
		
		
		
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
