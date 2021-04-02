package dp_project;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

import java.util.*;

public class Jdbc_Update {



	public void updateMethod() {		

		Scanner scan = new Scanner(System.in);

		String driver = "oracle.jdbc.driver.OracleDriver";

		String user = "hr";
		String pw = "1234";
		String url= "jdbc:oracle:thin:@localhost:1521:orcl";

		String sql = "UPDATE GOODSINFO SET BOOKNAME = ?, PRICE = ? WHERE CODE = ?";			

		Connection con = null;

		PreparedStatement pstmt = null;		

		try {

			Class.forName(driver);

			con = DriverManager.getConnection(url, "st02", "st02");

			pstmt = con.prepareStatement(sql);

			

			System.out.printf("수정할 코드 입력: ");

			String BOOKID = scan.next();

			System.out.printf("수정할 상품명 입력: ");

			String BOOKNAME = scan.next();			

			System.out.printf("수정할 가격 입력: ");

			int price = scan.nextInt();			

			

			pstmt.setString(1, BOOKNAME);

			pstmt.setInt(2, price);			

			pstmt.setString(3, BOOKID);

			int cnt = pstmt.executeUpdate(); 

			System.out.println(cnt + "건이 실행되었습니다.");

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
