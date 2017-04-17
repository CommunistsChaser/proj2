package calculate;

public class CalculateFee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double [][] rateArr = {
				
				{0.8, 1.0, 1.2, 1.5}, //차종별
				{0.9, 1} //직원회원, 일반회원		
		
		};
		
		/*
		예를 들면...... 1:45~ 8:15까지 이용한다 치면?
		한시부터 일곱시 반까지 여섯시간 반 이용한 셈.
			
			추가로 해야 할 일.
			
			1. 스윙이랑 연결하기.
			
			
			이벤트를 만들면 들어갈 때 입력할수 있는 시간을?
			멤버변수, 겟텍스트로 받아와서 연산.
			
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
		
		
		System.out.println("-----------------단순시간계산------------------");
		System.out.println(endhour-starthour);
		System.out.println(endmin - startmin);
		
		
		
		System.out.println(nethour);
		System.out.println(netmin);
		System.out.println(nettime);
		
		
		//대형차를 몰고 온 직원 회원이 13:45부터 20:15분까지 이용했을 경우,
		
		double price;
		price = nettime * rateArr[0][2] * rateArr[1][0]*1000;
		
		
		System.out.println(price);
		
		
		
	}

}
