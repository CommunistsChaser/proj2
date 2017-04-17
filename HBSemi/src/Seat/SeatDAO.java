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
	
	public List<SeatDTO> getlist()	{ // ��ü ����� �����´�.
		
		// �ʿ��� ���� : ��ü����� �������� -> �ڸ�status�� �б�
		// �ڸ������� status������ �о�;��Ѵ�. �̰� �Ƹ��� �� �ʿ��� �̺�Ʈ�� �ɾ�ξ�� ���� ������?
		// �׸��� ���� ���� ���� �ִ� ��Ȳ�� ����ȭ�鿡 �ִ� ��Ȳ�̾�� �Ѵ�.
		
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
	
	
	
public List<SeatDTO> getlistFloor(String floor)	{ //�ش�Ǵ� ���� ��ü ����� �����´�.
		
		// �ʿ��� ���� : ��ü����� �������� -> �ڸ�status�� �б�
		// �ڸ������� status������ �о�;��Ѵ�. �̰� �Ƹ��� �� �ʿ��� �̺�Ʈ�� �ɾ�ξ�� ���� ������?
		// �׸��� ���� ���� ���� �ִ� ��Ȳ�� ����ȭ�鿡 �ִ� ��Ȳ�̾�� �Ѵ�.
		// ��Ȳ�� ��ȸ�Ͽ� ������ �Ϸ��� ��쿡�� swing�� ���� ������ �ٲپ� �־�� �Ѵ�.
		// �׸��� ������ �Ϸ�� ������ DB�� �ٽ� ������Ʈ�� �����־�� �Ѵ�.
		
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
