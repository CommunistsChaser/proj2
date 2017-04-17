package Seat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SeatDAO {

	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	String url = "localhost:1521:orcl";
	String id = "hr";
	String pw = "hr";
	String sql = null;
	
	public SeatDAO() {
		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@"+url, id, pw);
			stmt = con.createStatement();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void close(){
		
		if(rs!=null) try {rs.close();} catch (SQLException e) {}
		if(stmt!=null) try {stmt.close();} catch (SQLException e) {}	
		if(con!=null) try {con.close();} catch (SQLException e) {}

	} 
	
	public List<SeatDTO> getlist()	{ // 전체 목록을 가져온다.
		
		// 필요한 순서 : 전체목록을 가져오기 -> 자리status값 읽기
		// 자리에대한 status값들을 읽어와야한다. 이건 아마도 폼 쪽에서 이벤트를 걸어두어야 하지 않을까?
		// 그리고 폼은 예약 폼에 있는 현황과 메인화면에 있는 현황이어야 한다.
		
		List<SeatDTO> res = new ArrayList();
		
		
		try {
			sql = "select * from seat"; 
			System.out.println("spl:"+sql);
			rs= stmt.executeQuery(sql);
			
			while(rs.next())	{
				SeatDTO dto = new SeatDTO();
				
				dto.setFloor(rs.getString("floor"));
				dto.setArea(rs.getString("area"));
				dto.setNo(rs.getString("no"));
				dto.setReserno(rs.getString("reserno"));
				dto.setEnterno(rs.getString("enterno"));
				dto.setUser(rs.getString("user"));
				dto.setTime(rs.getString("time"));
				dto.setProfit(rs.getString("profit"));
				dto.setStatus(rs.getString("status"));
				
				res.add(dto);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally	{
			close();
		}
		
		return res;
		
	}
	
	
	
public List<SeatDTO> getlistFloor(String floor)	{ //해당되는 층의 전체 목록을 가져온다.
		
		// 필요한 순서 : 전체목록을 가져오기 -> 자리status값 읽기
		// 자리에대한 status값들을 읽어와야한다. 이건 아마도 폼 쪽에서 이벤트를 걸어두어야 하지 않을까?
		// 그리고 폼은 예약 폼에 있는 현황과 메인화면에 있는 현황이어야 한다.
		// 현황을 조회하여 예약을 완료한 경우에는 swing의 라벨의 배경색도 바꾸어 주어야 한다.
		// 그리고 예약이 완료된 다음에 DB에 다시 업데이트를 시켜주어야 한다.
		
		List<SeatDTO> res = new ArrayList();
		
		
		try {
			sql = "select * from seat where floor='"+floor+"'"; 
			System.out.println("spl:"+sql);
			rs= stmt.executeQuery(sql);
			
			while(rs.next())	{
				SeatDTO dto = new SeatDTO();
				
				dto.setFloor(rs.getString("floor"));
				dto.setArea(rs.getString("area"));
				dto.setNo(rs.getString("no"));
				dto.setReserno(rs.getString("reserno"));
				dto.setEnterno(rs.getString("enterno"));
				dto.setUser(rs.getString("user"));
				dto.setTime(rs.getString("time"));
				dto.setProfit(rs.getString("profit"));
				dto.setStatus(rs.getString("status"));
				
				res.add(dto);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally	{
			close();
		}
		
		return res;
		
	}

}
