package calculate;

public class CalculateFee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double [][] rateArr = {
				
				{0.8, 1.0, 1.2, 1.5}, //������
				{0.9, 1} //����ȸ��, �Ϲ�ȸ��		
		
		};
		
		/*
		���� ���...... 1:45~ 8:15���� �̿��Ѵ� ġ��?
		�ѽú��� �ϰ��� �ݱ��� �����ð� �� �̿��� ��.
			
			�߰��� �ؾ� �� ��.
			
			1. �����̶� �����ϱ�.
			
			
			�̺�Ʈ�� ����� �� �� �Է��Ҽ� �ִ� �ð���?
			�������, ���ؽ�Ʈ�� �޾ƿͼ� ����.
			
		*/
		
		int starttime = 959;
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
		
		double price;
		price = nettime * rateArr[0][2] * rateArr[1][0]*1000;
		
		
		System.out.println(price);
		
		
		
	}

}
