package form;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Member.memberDAO;
import Member.memberDTO;



public class JoinUI {

	
	JFrame join;
	
	JTextField namefield, phonenumberfield, idfield, 
				carfield1, carfield2, carfield3,
				pwfield, pwconfirmfield,
				askworkernumberfield;
	
	JRadioButton joinyes;
	
	JButton joinsubmit, joinsubmitcancel;
	
	String name, tel, id, carnum1, carnum2, carnum3, carnum, pw, status, black=null;
	
	class JoinAction implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		carnum1 = carfield1.getText()+"";
		carnum2 = carfield2.getText()+"";
		carnum3 = carfield3.getText()+"";
		
		carnum = carnum1 + carnum2 + carnum3; //¿Ï·á
		
		
		
		
		
		tel  = phonenumberfield.getText();
		name = namefield.getText(); //¿Ï·á
		id  = idfield.getText();			
		
		//¹øÈ£ÆÇ
		if (Pattern.matches("[0-9]{2}", carnum1)&&
			Pattern.matches("[°¡|³ª|´Ù|¶ó|¸¶|°Å|³Ê|´õ|·¯|¸Ó|¹ö|¼­|¾î|Àú|°í|³ë|µµ|·Î|¸ð|º¸|¼Ò|¿À|Á¶|±¸|´©|µÎ|·ç|¹«|ºÎ|¼ö|¿ì|ÁÖ|¹Ù|»ç|¾Æ|ÀÚ|Çã]", carnum2)&&
			Pattern.matches("[0-9]{4}", carnum3)) carnum = carnum1+carnum2+carnum3;
		else carnum = null;
		
		//ÀÌ¸§
		if (Pattern.matches("[°¡-ÆR]{2,5}", name)) name = namefield.getText();
		else name = null;
		
		//ÀüÈ­¹øÈ£
		if (Pattern.matches("[010]-[0-9]{4}-[0-9]{4}", phonenumberfield.getText())||
				Pattern.matches("[010][0-9]{8}", phonenumberfield.getText())	
				)
			tel = phonenumberfield.getText();
		
		//01079003348 È®ÀÎ 010-7900-3348 È®ÀÎ
		else phonenumberfield = null;
		
		//¾ÆÀÌµð
		if (Pattern.matches("[0-9a-z]{4,8}", id))
			id = idfield.getText();
		else id = null;
		//1as, 1xh23, asdfgqwerty È®ÀÎ
		//ºñ¹ø
			if (!pwfield.getText().equals(pwconfirmfield.getText()))	{
				//°æ°íÃ¢ ¶ç¿ì±â
			
				return;
			}else	{
				pw = pwfield.getText();
			}
			
			/*if(name==null||id==null||pw==null||carnum==null||tel==null){
				//°æ°íÃ¢ ¶ç¿ì±â
			
				return;
			}else	{
				
			}*/
			

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
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		}
	} 
	
   public void work() {
	   // TODO Auto-generated method stub
	      
	      join = new JFrame("È¸¿ø°¡ÀÔÃ¢: 10*18");
	      join.setBounds(600, 200, 284, 512);
	      join.setLayout(null);
	      join.setBackground(Color.WHITE);
	      
	      JLabel jointitle = new JLabel("È¸¿ø°¡ÀÔ");
//	      jointitle.setFont(new Font("Serif", Font.BOLD, 20));
	      jointitle.setBounds(20,10,80,40);
	      join.add(jointitle);
	      
	      JLabel joinline1label = new JLabel("-----------------------------------------------------");
	      joinline1label.setBounds(30,55,224,30);
	      join.add(joinline1label);
	      
	      JLabel namelabel = new JLabel("ÀÌ¸§");
	      namelabel.setBounds(30,85,80,30);
	      join.add(namelabel);
	      
	      namefield = new JTextField("¸¶´Ã¿À¸®");
	      namefield.setBounds(110, 85, 134, 30);
	      join.add(namefield);
	      
	      
	      JLabel phonelabel = new JLabel("ÀüÈ­¹øÈ£");
	      phonelabel.setBounds(30,115,80,30);
	      join.add(phonelabel);
	      
	      phonenumberfield = new JTextField("-¸¦ »©°í ÀÔ·ÂÇÏ¼¼¿ä");
	      phonenumberfield.setBounds(110, 115, 134, 30);
	      join.add(phonenumberfield);
	      
	      
	      JLabel idlabel = new JLabel("ID");
	      idlabel.setBounds(30,155,80,30);
	      join.add(idlabel);
	      
	      idfield = new JTextField();
	      idfield.setBounds(110, 155, 134, 30);
	      join.add(idfield);
	      
	      JLabel pwlabel = new JLabel("PW");
	      pwlabel.setBounds(30,185,80,30);
	      join.add(pwlabel);
	      
	      pwfield = new JTextField();
	      pwfield.setBounds(110, 185, 134, 30);
	      join.add(pwfield);
	      
	      
	      JLabel pwconfirmlabel = new JLabel("PW ÀçÈ®ÀÎ");
	      pwconfirmlabel.setBounds(30,215,80,30);
	      join.add(pwconfirmlabel);
	      
	      pwconfirmfield = new JTextField();
	      pwconfirmfield.setBounds(110, 215, 134, 30);
	      join.add(pwconfirmfield);
	      
	      
	      JLabel carlabel = new JLabel("Â÷·®Á¤º¸");
	      carlabel.setBounds(30,255,80,30);
	      join.add(carlabel);
	      
	      carfield1 = new JTextField("00");
	      carfield1.setBounds(110, 255, 55, 30);
	      join.add(carfield1);
	      
	      
	      carfield2 = new JTextField("¿µ");
	      carfield2.setBounds(167, 255, 20, 30);
	      join.add(carfield2);
	      
	      carfield3 = new JTextField("0000");
	      carfield3.setBounds(189, 255, 55, 30);
	      join.add(carfield3);
	      
	      JLabel infofixline1label = new JLabel("-----------------------------------------------------");
	      infofixline1label.setBounds(30,295,224,30);
	      join.add(infofixline1label);
	      
	      
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