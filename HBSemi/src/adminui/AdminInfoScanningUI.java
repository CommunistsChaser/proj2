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
		
		JFrame infoscanning = new JFrame("��ȸ: 20*15");
		infoscanning.setBounds(900, 200, 568, 426);
		infoscanning.setLayout(null);
		infoscanning.setBackground(Color.WHITE);
		
		
		
		JLabel infoscanningtitle = new JLabel("��ȸ �޴�");
		infoscanningtitle.setBounds(10,10,80,30);
		infoscanning.add(infoscanningtitle);
		
		JButton carinfoscanningbutton = new JButton("���� ��ȸ");
		carinfoscanningbutton.setBounds(340, 10, 100, 30);
		infoscanning.add(carinfoscanningbutton);
		
		JButton userinfoscanningbutton = new JButton("ȸ�� ��ȸ");
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
		index.add("��");
		index.add("��");
		index.add("��");
		index.add("����-����");
		index.add("����-����");
		index.add("����");
		index.add("����");
		index.add("������ȣ");
		index.add("��ȭ��ȣ");
	  
	  
	  
	  Vector<Vector> data = new Vector<>();
	  
	  for(int i =0; i<50;i++)data.add(new Vector());
	  //�̰� ��+����ؽ�Ʈ�� �� �ұ�?
	  
	

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
