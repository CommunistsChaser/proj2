package calculate;

public class RenewCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int unitprice = 1000;
		double [] dcrateArr = {0.05, 0.1, 0.2}; //���η� ��Ʈ
		double dcrate = 0;
		
		int starttime = 959;//�ð��κ��� ũ�� ��ĥ �ʿ䰡 ������.
		int endtime = 2011;
		
		int starthour = starttime/100;
		int endhour = endtime/100;
		
		int startmin = starttime%100;
		int endmin = endtime%100;
		
		double nethour = endhour - starthour;
		double netmin = (endmin - startmin)*5/3;
		double nettime = nethour+ (netmin/100);
		
		
		System.out.println(starthour);
		System.out.println(endhour);
		System.out.println(startmin);
		System.out.println(endmin);
		
		
		System.out.println("-----------------�ܼ��ð����------------------");
		System.out.println(endhour-starthour);
		System.out.println(endmin - startmin);
		
		
		 
		System.out.println(nethour);
		System.out.println(netmin);
		System.out.println(nettime);
		
		
		//�������� ���� �� ���� ȸ���� 13:45���� 20:15�б��� �̿����� ���,
		
		double price = nettime*unitprice;
		
		
		System.out.println("���ξ���: "+price);
		
		dcrate += dcrateArr[1];		
		
		System.out.println("����: "+dcrate);

		System.out.println("���� ���� �� �ݾ�: "+price*(1-dcrate));
		
		dcrate -= 0.05;
		
		System.out.println("����: "+dcrate);
		
		System.out.println("�������� ����: "+price*(1-dcrate));
		
	}

}
