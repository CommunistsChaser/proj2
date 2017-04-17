package regex;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Member.memberDAO;
import Member.memberDTO;


public class JoinRegex {

	
	JFrame join;
	
	JTextField namefield, phonenumberfield, idfield, 
				carfield1, carfield2, carfield3,
				pwfield, pwconfirmfield,
				askworkernumberfield;
	
	JRadioButton joinyes;
	
	JButton joinsubmit, joinsubmitcancel;
	
	String name, tel, id, carnum, pw, status, black=null;
	
	class JoinAction implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			/*carnum = carfield1.getText()+" "+carfield2.getText()+" "
					+carfield3.getText();*/
			
			if(carfield1.getText().equals("[°¡-ÆR]{0,2}[00-99]{2}")&&
			carfield2.getText().equals("[°¡-ÆR]{1}")&&		
			carfield3.getText().equals("[0000-9999]{4}")) 
			carnum = carfield1.getText()+" "+carfield2.getText()+" "+carfield3.getText();
			
			
			tel  = phonenumberfield.getText();
			
			
			
			
			
			
			name = namefield.getText();
			
			id  = idfield.getText();
			
			if(idfield.getText().equals("[]"))
			
			
			if (!pwfield.getText().equals(pwconfirmfield.getText()))	{
				//°æ°íÃ¢ ¶ç¿ì±â
				return;
			}else	{
				pw = pwfield.getText();
			}

			status = askworkernumberfield.getText();
			
			/*È®ÀÎ¿ëÀ¸·Î Ãâ·Â*/
			System.out.println("name:"+name );
			System.out.println("tel:"+tel );
			System.out.println("id:"+id );
			System.out.println("pw:"+pw);
			System.out.println("carnum:"+carnum );
			System.out.println("status:"+status);
			System.out.println("black:"+black);
			

			
			memberDAO memberdao;
			try {
				memberdao = new memberDAO();
				memberdao.insert(new memberDTO(carnum, tel, name, id, pw, status, black));
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		}
	} 
	
   public void work() {
	   // TODO Auto-generated method stub
	      
	      /*
	      ÇÊ¿äÁ¤º¸: 
	      
	      */
	      
	      join = new JFrame("È¸¿ø°¡ÀÔÃ¢: 10*18");
	      join.setBounds(600, 200, 284, 512);
	      join.setLayout(null);
	      join.setBackground(Color.WHITE);
	      
	      JLabel jointitle = new JLabel("È¸¿ø°¡ÀÔ");
//	      jointitle.setFont(new Font("Serif", Font.BOLD, 20));
	      jointitle.setBounds(20,10,80,40);
	      join.add(jointitle);
	      
	      JLabel joinline1label = new JLabel("-----------------------------------------------------");
	      joinline1label.setBounds(30,35,224,30);
	      join.add(joinline1label);
	      
	      JLabel namelabel = new JLabel("ÀÌ¸§");
	      namelabel.setBounds(30,65,80,30);
	      join.add(namelabel);
	      
	      namefield = new JTextField("¸¶´Ã¿À¸®");
	      namefield.setBounds(110, 65, 134, 30);
	      join.add(namefield);
	      
	      
	      String namechar = namefield.getText();
	      System.out.println(namechar);
	      
	      JLabel phonelabel = new JLabel("ÀüÈ­¹øÈ£");
	      phonelabel.setBounds(30,95,80,30);
	      join.add(phonelabel);
	      
	      phonenumberfield = new JTextField();
	      phonenumberfield.setBounds(110, 95, 134, 30);
	      join.add(phonenumberfield);
	      
	      /*
	      Á¤±Ô½Ä ½á¾ß ÇÔ.
	      
	      
	      */
	      JLabel idlabel = new JLabel("ID");
	      idlabel.setBounds(30,135,80,30);
	      join.add(idlabel);
	      
	      idfield = new JTextField();
	      idfield.setBounds(110, 135, 134, 30);
	      join.add(idfield);
	      
	      JLabel pwlabel = new JLabel("PW");
	      pwlabel.setBounds(30,165,80,30);
	      join.add(pwlabel);
	      
	      pwfield = new JTextField();
	      pwfield.setBounds(110, 165, 134, 30);
	      join.add(pwfield);
	      
	      
	      JLabel pwconfirmlabel = new JLabel("PW ÀçÈ®ÀÎ");
	      pwconfirmlabel.setBounds(30,195,80,30);
	      join.add(pwconfirmlabel);
	      
	      pwconfirmfield = new JTextField();
	      pwconfirmfield.setBounds(110, 195, 134, 30);
	      join.add(pwconfirmfield);
	      
	      
	      
	      
	      JLabel carlabel = new JLabel("Â÷·®Á¤º¸");
	      carlabel.setBounds(30,235,80,30);
	      join.add(carlabel);
	      
	      carfield1 = new JTextField("Áö¿ª 00");
	      carfield1.setBounds(110, 235, 55, 30);
	      join.add(carfield1);
	      
	      
	      carfield2 = new JTextField("¿µ");
	      carfield2.setBounds(167, 235, 20, 30);
	      join.add(carfield2);
	      
	      carfield3 = new JTextField("0000");
	      carfield3.setBounds(189, 235, 55, 30);
	      join.add(carfield3);
	      
	      
	      
	      JLabel pollabel = new JLabel("°³ÀÎÁ¤º¸ Ãë±Þ¹æÄ§¿¡ µ¿ÀÇÇÕ´Ï´Ù.");
	      pollabel.setBounds(30,345,224,30);
	      join.add(pollabel);
	      
	      JRadioButton joinyes = new JRadioButton("¿¹", true);
	      joinyes.setBounds(70,370,65,30);
	      join.add(joinyes);
	      
	      JRadioButton joinno = new JRadioButton("¾Æ´Ï¿À");
	      joinno.setBounds(134,370,70,30);
	      join.add(joinno);
	      
	      ButtonGroup joinyesno = new ButtonGroup();
	      joinyesno.add(joinyes);
	      joinyesno.add(joinno);
	      
	      
	      joinsubmit = new JButton("Á¦Ãâ");
	      joinsubmit.setBounds(65,410,65,30);
	      join.add(joinsubmit);
	      joinsubmit.addActionListener(new JoinAction());
	      
	      joinsubmitcancel = new JButton("Ãë¼Ò");
	      joinsubmitcancel.setBounds(139,410,70,30);
	      join.add(joinsubmitcancel);
	      
	      
	      join.setVisible(true);



      
   }
   
   
   

}