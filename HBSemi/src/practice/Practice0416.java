package practice;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



class Form implements ActionListener   {
   String name;
   JFrame jf;
   JButton bt1, bt2, bt3, bt4;
   JLabel lb1, lb2, lb3, lb4;
   boolean b1=false, b2=false, b3=false, b4=false;
   
   Form (String name)   {
      jf = new JFrame(name);
      jf.setBounds(100, 100, 600, 600);
      jf.setLayout(new GridLayout(2,1));
      
      JPanel p1 = new JPanel();
      p1.setLayout(new GridLayout(4,1));      
      
      lb1 = new JLabel("1번 기능");
      lb2 = new JLabel("2번 기능");
      lb3 = new JLabel("3번 기능");
      lb4 = new JLabel("4번 기능");
      p1.add(lb1);
      p1.add(lb2);
      p1.add(lb3);
      p1.add(lb4);
      
      JPanel p2 = new JPanel();
      p2.setLayout(new FlowLayout());
      bt1 = new JButton("1번");
      bt1.addActionListener(this);
      bt2 = new JButton("2번");
      bt2.addActionListener(this);
      bt3 = new JButton("3번");
      bt3.addActionListener(this);
      bt4 = new JButton("4번");
      bt4.addActionListener(this);
      p2.add(bt1);
      p2.add(bt2);
      p2.add(bt3);
      p2.add(bt4);
      
      jf.add(p1);
      jf.add(p2);
      
   
      jf.setVisible(true);
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   @Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      
      JButton btn = (JButton)e.getSource();
      
      switch(btn.getText())   {
      case "1번":   if(b1)   {
         b1 = false;
         lb1.setText("기능 1 Off");
         
      }else {
         b1 = true;
         lb1.setText("기능 1 On");
      
      }
      System.out.println("1번 버튼 이벤트 진입");
               break;
               
      case "2번":   if(b2)      {
         b2 = false;
         lb2.setText("기능 2 Off");
      }
      else {
         b2 = true;   
         lb2.setText("기능2 On");
      }
      System.out.println("2번 버튼 이벤트 진입");
      break;
      
      case "3번":   if(b3)      {
         b3 = false;
         lb3.setText("기능 3 Off");
      }
      else {
         b3 = true;   
         lb3.setText("기능3 On");
      }
      System.out.println("3번 버튼 이벤트 진입");
      break;
      
      case "4번":   if(b4)      {
         b4 = false;
         lb4.setText("기능 4 Off");
      }
      else {
         b4 = true;   
         lb4.setText("기능4 On");
      }
      System.out.println("4번 버튼 이벤트 진입");
      break;
      }
      
      
   }
   
     
}

class CalDate extends Thread   {
   
   Form f;
   CalDate(Form f)   {
      this.f = f;
      
   }
   
   @Override
   public void run() {
      // TODO Auto-generated method stub
      
      SimpleDateFormat fm1 = new SimpleDateFormat("yyyy년 MM월 dd일 aa kk:mm:ss");
      
      while(true)   {
         Date now = new Date();
   
         String day = fm1.format(now);
         
         f.jf.setTitle(day);
         
         try {
            sleep(1000);
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
      
   }
   
}

class Fun1 extends Thread   {
   Form f;
   boolean sign1=true;
   
   Fun1(Form f)   {
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

class Fun2 extends Thread   {
   Form f;
   boolean sign2=true;
   
   Fun2(Form f)   {
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

class Fun3 extends Thread   {
   Form f;
   boolean sign3=true;
   
   Fun3(Form f)   {
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

class Fun4 extends Thread   {
   Form f;
   boolean sign4=true;
   
   Fun4(Form f)   {
      this.f = f;
      sign4=f.b4;
   }
   
   @Override
   public void run() {
      // TODO Auto-generated method stub
      
      while(sign4)   {
         sign4=f.b4;
         try {
            sleep(1000);
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
         
      }
   }
   
}   



public class Practice0416 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

      Form a = new Form("연습1");
      CalDate d = new CalDate(a);
      Fun1 f1 = new Fun1(a);
      Fun2 f2 = new Fun2(a);
      Fun3 f3 = new Fun3(a);
      Fun4 f4 = new Fun4(a);
      
      
      d.start();
      
      
      f1.start();
      f2.start();
      f3.start();
      f4.start();
      
   }

}
