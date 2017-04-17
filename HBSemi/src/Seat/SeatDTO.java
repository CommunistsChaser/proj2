package Seat;

public class SeatDTO {
	
	String floor, area, no, reserno, enterno,user, time, profit, status;
	
	public SeatDTO()	{}
	
	public SeatDTO(String floor, String area, String no, String reserno, String enterno, String user, String time,
			String profit, String status) {
		super();
		this.floor = floor;
		this.area = area;
		this.no = no;
		this.reserno = reserno;
		this.enterno = enterno;
		this.user = user;
		this.time = time;
		this.profit = profit;
		this.status = status;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getReserno() {
		return reserno;
	}

	public void setReserno(String reserno) {
		this.reserno = reserno;
	}

	public String getEnterno() {
		return enterno;
	}

	public void setEnterno(String enterno) {
		this.enterno = enterno;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getProfit() {
		return profit;
	}

	public void setProfit(String profit) {
		this.profit = profit;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "SeatDTO [floor=" + floor + ", area=" + area + ", no=" + no + ", reserno=" + reserno + ", enterno="
				+ enterno + ", user=" + user + ", time=" + time + ", profit=" + profit + ", status=" + status + "]";
	}


	
	
}
