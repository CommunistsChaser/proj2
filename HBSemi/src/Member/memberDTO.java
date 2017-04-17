package Member;

public class memberDTO {
	
	String carnum=null, tel=null, name=null, id=null, 
			pw=null, status=null, black=null;

	public memberDTO()	{}
	
	public memberDTO(String carnum, String tel, String name, String id, String pw, String status,
			String black) {
		super();
		this.carnum = carnum;
		this.tel = tel;
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.status = status;
		this.black = black;
	}

	public String getCarnum() {
		return carnum;
	}

	public void setCarnum(String carnum) {
		this.carnum = carnum;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBlack() {
		return black;
	}

	public void setBlack(String black) {
		this.black = black;
	}

	@Override
	public String toString() {
		return "memberDTO [carnum=" + carnum + ", tel=" + tel + ", name=" + name + ", id=" + id + ", pw=" + pw
				+ ", status=" + status + ", black=" + black + "]";
	}
	
	
}
