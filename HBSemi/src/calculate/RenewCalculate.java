package calculate;

public class RenewCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int unitprice = 1000;
		double [] dcrateArr = {0.05, 0.1, 0.2}; //할인률 파트
		double dcrate = 0;
		
		int starttime = 959;//시간부분은 크게 고칠 필요가 없었음.
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
		
		double price = nettime*unitprice;
		
		
		System.out.println("할인없음: "+price);
		
		dcrate += dcrateArr[1];		
		
		System.out.println("할인: "+dcrate);

		System.out.println("할인 적용 뒤 금액: "+price*(1-dcrate));
		
		dcrate -= 0.05;
		
		System.out.println("할인: "+dcrate);
		
		System.out.println("다중할인 적용: "+price*(1-dcrate));
		
	}

}
