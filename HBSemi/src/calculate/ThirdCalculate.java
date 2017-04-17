package calculate;

public class ThirdCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int unitprice = 1000;
		double [] dcrateArr = {0.05, 0.1, 0.2}; //할인률 파트
		double dcrate = 0;
		
		int starttime = 2011;//시간부분은 크게 고칠 필요가 없었음.
		int endtime = 959;
		
		double startdate = 1111;
		int starthour = starttime/100;

		double enddate = 1112;
		int endhour = endtime/100;
		// 11/11 20:11 ~ 11/12 9:59
		
		int startmin = starttime%100;
		int endmin = endtime%100;
		
		double nethour = endhour - starthour;
		double netmin = (endmin - startmin)*5/3;
		double nettime = nethour+ (netmin/100);
		double netday = enddate-startdate;
		double daytime = 24*netday;
		double totaltime;
		
		totaltime = daytime + nettime;
		
		System.out.println(nettime);
		System.out.println(totaltime);
		
		
	}

}
