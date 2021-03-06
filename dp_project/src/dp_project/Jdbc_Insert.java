package dp_project;


import java.sql.*;

import java.util.*;

public class Jdbc_Insert {



	public void insertMethod() {		

		Scanner scan = new Scanner(System.in);

		String driver = "oracle.jdbc.driver.OracleDriver";

		String user = "hr";
		String pw = "1234";
		String url= "jdbc:oracle:thin:@localhost:1521:orcl";

		String sql = "INSERT INTO Book values(BOOKID,BOOKNAME,PUBLISHER,PRICE) VALUES(?, ?, ?, ?)";			

		Connection con = null;

		PreparedStatement pstmt = null;

		

		try {

			Class.forName(driver);

			con = DriverManager.getConnection(url, "st02", "st02");

			pstmt = con.prepareStatement(sql);

			

			System.out.printf("입력할 코드: ");

			String code = scan.next();

			System.out.printf("입력할 상품명: ");

			String name = scan.next();			

			System.out.printf("입력할 가격: ");

			int price = scan.nextInt();

			System.out.printf("입력할 메이커: ");

			String maker = scan.next();			

			

			pstmt.setString(1, code);

			pstmt.setString(2, name);

			pstmt.setInt(3, price);

			pstmt.setString(4, maker);

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

