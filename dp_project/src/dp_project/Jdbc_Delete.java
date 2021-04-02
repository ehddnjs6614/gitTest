package dp_project;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

import java.util.*;

public class Jdbc_Delete {



	public void deleteMethod() {

		Scanner scan = new Scanner(System.in);

		String driver = "oracle.jdbc.driver.OracleDriver";

		String user = "hr";
		String pw = "1234";
		String url= "jdbc:oracle:thin:@localhost:1521:orcl";

		String sql = "DELETE FROM GOODSINFO WHERE CODE = ?";

		String code = "";

		

		Connection con = null;

		PreparedStatement pstmt = null;		

		try {

			Class.forName(driver);

			con = DriverManager.getConnection(url, "st02", "st02");

			pstmt = con.prepareStatement(sql);

			

			System.out.println("삭제할 코드를 입력하시오");

			code = scan.next();

			

			pstmt.setString(1, code);

			int cnt = pstmt.executeUpdate(); 

			System.out.println(cnt);

		}

		catch (Exception e) {System.out.println(e.getMessage());}

		finally {

			try {

				pstmt.close();

				con.close();

			} catch (Exception e) {

			}

		}

	}

}
