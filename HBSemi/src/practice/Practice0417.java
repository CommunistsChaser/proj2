package practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class practice0417form implements ActionListener
{
	boolean bl1, bl2, bl3, bl4;
	String res = "";
	JLabel result;
	
	practice0417form(int a, int b){
	JFrame jf = new JFrame();
	jf.setBounds(300, 200, 400, 250);
	jf.setLayout(null);
	
	JTextField num1 = new JTextField();
	num1.setBounds(50, 50, 50, 50);
	jf.add(num1);
	
	JLabel calc = new JLabel("(_)");
	calc.setBounds(100, 50, 50, 50);
	jf.add(calc);
	
	JTextField num2 = new JTextField();
	num2.setBounds(150, 50, 50, 50);
	jf.add(num2);
	
	
	result = new JLabel("");
	result.setBounds(100, 100, 100, 50);
	jf.add(result);
	
	JButton b1 = new JButton("+");
	b1.setBounds(250, 0, 50, 50);
	b1.addActionListener(this);
	jf.add(b1);
	
	JButton b2 = new JButton("-");
	b2.setBounds(250, 50, 50, 50);
	b2.addActionListener(this);
	jf.add(b2);
	
	JButton b3 = new JButton("*");
	b3.setBounds(250, 100, 50, 50);
	b3.addActionListener(this);
	jf.add(b3);
	
	JButton b4 = new JButton("/");
	b4.setBounds(250, 150, 50, 50);
	b4.addActionListener(this);
	jf.add(b4);
	
	
	jf.setVisible(true);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		JButton but = (JButton)e.getSource();
		
		switch(but.getText())
		{
		case "+" : if(bl1){
			bl1 = false;
			result.setText("");
		}else{
			bl1 = true;
			result.setText("a+b");
		}
			
		case "-" : if(bl2){
			bl2 = false;
			result.setText("");
		}else{
			bl2 = true;
			result.setText("a-b");
		}
		
		case "*" : if(bl3){
			bl3 = false;
			result.setText("");
		}else{
			bl3 = true;
			result.setText("a*b");
		}
			
		case "/" : if(bl4){
			bl4 = false;
			result.setText("");
		}else{
			bl4 = true;
			result.setText("a/b");
		}
			
		}
		
	}
	
}

class PracticeButton1 extends Thread   {
	   Form f;
	   boolean sign1=true;
	   
	   PracticeButton1(Form f)   {
	      this.f = f;
	      sign1=f.b1;
	   }
	   
	   @Override
	   public void run() {
	      // TODO Auto-generated method stub
	      
	      while(sign1)   {
	         sign1=f.b1;
	         try {
	            sleep(1000);
	         } catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	         }
	         
	      }
	   }
	   
	}   

	class PracticeButton2 extends Thread   {
	   Form f;
	   boolean sign2=true;
	   
	   PracticeButton2(Form f)   {
	      this.f = f;
	      sign2=f.b2;
	   }
	   
	   @Override
	   public void run() {
	      // TODO Auto-generated method stub
	      
	      while(sign2)   {
	         sign2=f.b2;
	         try {
	            sleep(1000);
	         } catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	         }
	         
	      }
	   }
	   
	}   

	class PracticeButton3 extends Thread   {
	   Form f;
	   boolean sign3=true;
	   
	   PracticeButton3(Form f)   {
	      this.f = f;
	      sign3=f.b3;
	   }
	   
	   @Override
	   public void run() {
	      // TODO Auto-generated method stub
	      
	      while(sign3)   {
	         sign3=f.b3;
	         try {
	            sleep(1000);
	         } catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	         }
	         
	      }
	   }
	   
	}   

	class PracticeButton4 extends Thread   {
	   Form f;
	   boolean sign4=true;
	   
	   PracticeButton4(Form f)   {
	      this.f = f;
	      sign4=f.b4;
	   }
	} 

public class Practice0417 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Form f = new Form("¿¬½À1");
		
		PracticeButton1 b1 = new PracticeButton1(f);
	    PracticeButton2 b2 = new PracticeButton2(f);
	    PracticeButton3 b3 = new PracticeButton3(f);
	    PracticeButton4 b4 = new PracticeButton4(f);
	    
	    b1.start();
	    b2.start();
	    b3.start();
	    b4.start();
		

	}

}
