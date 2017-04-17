package Member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class memberDAO {

	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	String url = "localhost:1521:orcl";
	String id = "hr";
	String pw = "hr";
	String sql = null;
	
	public memberDAO() throws ClassNotFoundException	{
		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@"+url, id, pw);
			stmt = con.createStatement();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int insert(memberDTO dto) {	// 회원가입시 DB에 회원정보 추가
		
		int res = 0;
		
		sql = "insert into member"+
				"(carnum,tel,name,id,pw,status,black)" +
				"values ('"+
				dto.carnum+"','"+
				dto.tel+"','"+
				dto.name+"','"+
				dto.id+"','"+
				dto.pw+"','"+
				dto.status+"','"+
				dto.black+"')";
		
		System.out.println(sql);
				
		try {
			res = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}
	
	void close(){
		
		if(rs!=null) try {rs.close();} catch (SQLException e) {}
		if(stmt!=null) try {stmt.close();} catch (SQLException e) {}	
		if(con!=null) try {con.close();} catch (SQLException e) {}

	} 
	
	public memberDTO findingId(String name, String tel)	{
		
		memberDTO res = null;
		try {
			
			sql = "select * from member where name = '"+name+"' and tel = '"+tel+"'";
			System.out.println(sql);
			
			rs = stmt.executeQuery(sql);
			
			if(rs.next())
			{
				res = new memberDTO();
				
				res.setId(rs.getString("id"));
				res.setName(rs.getString("name"));
				res.setCarnum(rs.getString("carnum"));
				res.setTel(rs.getString("tel"));
				
			}
			System.out.println(res);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
		return res;		
	}
	
public memberDTO findingPW(String id, String tel)	{
		
		memberDTO res = null;
		try {
			
			sql = "select * from member where id = '"+id+"' and tel = '"+tel+"'";
			System.out.println(sql);
			
			rs = stmt.executeQuery(sql);
			
			if(rs.next())
			{
				res = new memberDTO();
				
				res.setId(rs.getString("id"));
				res.setName(rs.getString("name"));
				res.setCarnum(rs.getString("carnum"));
				res.setTel(rs.getString("tel"));
				res.setPw(rs.getString("pw"));
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
		return res;		
	}
	
}
