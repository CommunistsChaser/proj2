package adminui;

import java.awt.Color;
import java.awt.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class AdminInfoScanningUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame infoscanning = new JFrame("조회: 20*15");
		infoscanning.setBounds(900, 200, 568, 426);
		infoscanning.setLayout(null);
		infoscanning.setBackground(Color.WHITE);
		
		
		
		JLabel infoscanningtitle = new JLabel("조회 메뉴");
		infoscanningtitle.setBounds(10,10,80,30);
		infoscanning.add(infoscanningtitle);
		
		JButton carinfoscanningbutton = new JButton("차량 조회");
		carinfoscanningbutton.setBounds(340, 10, 100, 30);
		infoscanning.add(carinfoscanningbutton);
		
		JButton userinfoscanningbutton = new JButton("회원 조회");
		userinfoscanningbutton.setBounds(440, 10, 100, 30);
		infoscanning.add(userinfoscanningbutton);
		
		
		JPanel upperpanel = new JPanel();
		upperpanel.setLayout(null);
		upperpanel.setBounds(0,50,568,188);
		upperpanel.setBackground(Color.WHITE);
		infoscanning.add(upperpanel);
		
		JPanel underpanel = new JPanel();
	
		underpanel.setBounds(0,238,568,188);
		underpanel.setBackground(Color.gray);
		infoscanning.add(underpanel);
		
		
	Vector index = new Vector<>();
		index.add("층");
		index.add("열");
		index.add("번");
		index.add("예약-시작");
		index.add("예약-종료");
		index.add("입차");
		index.add("출차");
		index.add("차량번호");
		index.add("전화번호");
	  
	  
	  
	  Vector<Vector> data = new Vector<>();
	  
	  for(int i =0; i<50;i++)data.add(new Vector());
	  //이거 맵+해즈넥스트로 못 할까?
	  
	

	  JTable tt = new JTable(data, index);
	  tt.setLayout(null);
	  JScrollPane ttJS = new JScrollPane(tt);
	  
	  ttJS.setBounds(0,100, 568, 188);
	  upperpanel.add(ttJS);
	  underpanel.add(ttJS);
		
		
		
		infoscanning.setVisible(true);
        infoscanning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
