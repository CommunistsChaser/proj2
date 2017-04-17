package form;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginUI {
	
	FindInfoUI find;
	
	public LoginUI() {
		// TODO Auto-generated constructor stub
		find = new FindInfoUI();
	}
	
	
	class FindAction implements ActionListener	{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			find.work();
		}
		
	}
	
   public void work() {
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
      login.add(findinfobutton);
      findinfobutton.addActionListener(new FindAction());
      
      
      login.setVisible(true);
      
      
   }

}