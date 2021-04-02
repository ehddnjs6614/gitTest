package dp_project;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Jdbc_Select {

	public void selectMethod() {
		String user = "hr";
		String pw = "1234";
		String url= "jdbc:oracle:thin:@localhost:1521:orcl";
		String driver = "oracle.jdbc.driver.OracleDriver";
		String sql = "SELECT * FROM Book";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "st02", "st02");
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(); 
			while (rs.next()) {
				String BOOKID = rs.getString("BOOKID"); 
				String BOOKNAME = rs.getString("BOOKNAME"); 
				int PUBLISHER = rs.getInt("PUBLISHER");
				String PRICE = rs.getString("PRICE");				
				System.out.println(BOOKID + "\t" + BOOKNAME + "\t" + PUBLISHER + "\t" + PRICE);
			}
		}		
		catch (Exception e) {System.out.println(e.getMessage());}		
		finally {
			try {rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e) {}
		}
	}
}


