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
		
		carnum = carnum1 + carnum2 + carnum3; //�Ϸ�
		
		
		
		
		
		tel  = phonenumberfield.getText();
		name = namefield.getText(); //�Ϸ�
		id  = idfield.getText();			
		
		//��ȣ��
		if (Pattern.matches("[0-9]{2}", carnum1)&&
			Pattern.matches("[��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��]", carnum2)&&
			Pattern.matches("[0-9]{4}", carnum3)) carnum = carnum1+carnum2+carnum3;
		else carnum = null;
		
		//�̸�
		if (Pattern.matches("[��-�R]{2,5}", name)) name = namefield.getText();
		else name = null;
		
		//��ȭ��ȣ
		if (Pattern.matches("[010]-[0-9]{4}-[0-9]{4}", phonenumberfield.getText())||
				Pattern.matches("[010][0-9]{8}", phonenumberfield.getText())	
				)
			tel = phonenumberfield.getText();
		
		//01079003348 Ȯ�� 010-7900-3348 Ȯ��
		else phonenumberfield = null;
		
		//���̵�
		if (Pattern.matches("[0-9a-z]{4,8}", id))
			id = idfield.getText();
		else id = null;
		//1as, 1xh23, asdfgqwerty Ȯ��
		//���
			if (!pwfield.getText().equals(pwconfirmfield.getText()))	{
				//���â ����
			
				return;
			}else	{
				pw = pwfield.getText();
			}
			
			/*if(name==null||id==null||pw==null||carnum==null||tel==null){
				//���â ����
			
				return;
			}else	{
				
			}*/
			

			/*Ȯ�ο����� ���*/
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
	      
	      join = new JFrame("ȸ������â: 10*18");
	      join.setBounds(600, 200, 284, 512);
	      join.setLayout(null);
	      join.setBackground(Color.WHITE);
	      
	      JLabel jointitle = new JLabel("ȸ������");
//	      jointitle.setFont(new Font("Serif", Font.BOLD, 20));
	      jointitle.setBounds(20,10,80,40);
	      join.add(jointitle);
	      
	      JLabel joinline1label = new JLabel("-----------------------------------------------------");
	      joinline1label.setBounds(30,55,224,30);
	      join.add(joinline1label);
	      
	      JLabel namelabel = new JLabel("�̸�");
	      namelabel.setBounds(30,85,80,30);
	      join.add(namelabel);
	      
	      namefield = new JTextField("���ÿ���");
	      namefield.setBounds(110, 85, 134, 30);
	      join.add(namefield);
	      
	      
	      JLabel phonelabel = new JLabel("��ȭ��ȣ");
	      phonelabel.setBounds(30,115,80,30);
	      join.add(phonelabel);
	      
	      phonenumberfield = new JTextField("-�� ���� �Է��ϼ���");
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
	      
	      
	      JLabel pwconfirmlabel = new JLabel("PW ��Ȯ��");
	      pwconfirmlabel.setBounds(30,215,80,30);
	      join.add(pwconfirmlabel);
	      
	      pwconfirmfield = new JTextField();
	      pwconfirmfield.setBounds(110, 215, 134, 30);
	      join.add(pwconfirmfield);
	      
	      
	      JLabel carlabel = new JLabel("��������");
	      carlabel.setBounds(30,255,80,30);
	      join.add(carlabel);
	      
	      carfield1 = new JTextField("00");
	      carfield1.setBounds(110, 255, 55, 30);
	      join.add(carfield1);
	      
	      
	      carfield2 = new JTextField("��");
	      carfield2.setBounds(167, 255, 20, 30);
	      join.add(carfield2);
	      
	      carfield3 = new JTextField("0000");
	      carfield3.setBounds(189, 255, 55, 30);
	      join.add(carfield3);
	      
	      JLabel infofixline1label = new JLabel("-----------------------------------------------------");
	      infofixline1label.setBounds(30,295,224,30);
	      join.add(infofixline1label);
	      
	      
	      JLabel pollabel = new JLabel("�������� ��޹�ħ�� �����մϴ�.");
	      pollabel.setBounds(30,345,224,30);
	      join.add(pollabel);
	      
	      JRadioButton joinyes = new JRadioButton("��", true);
	      joinyes.setBounds(70,370,65,30);
	      join.add(joinyes);
	      
	      JRadioButton joinno = new JRadioButton("�ƴϿ�");
	      joinno.setBounds(134,370,70,30);
	      join.add(joinno);
	      
	      ButtonGroup joinyesno = new ButtonGroup();
	      joinyesno.add(joinyes);
	      joinyesno.add(joinno);
	      
	      
	      joinsubmit = new JButton("����");
	      joinsubmit.setBounds(65,410,65,30);
	      join.add(joinsubmit);
	      joinsubmit.addActionListener(new JoinAction());
	      
	      joinsubmitcancel = new JButton("���");
	      joinsubmitcancel.setBounds(139,410,70,30);
	      join.add(joinsubmitcancel);
	      
	      join.setVisible(true);


   }
   
   
   

}