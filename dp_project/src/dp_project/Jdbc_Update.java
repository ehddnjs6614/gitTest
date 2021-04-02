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

			

			System.out.printf("������ �ڵ� �Է�: ");

			String BOOKID = scan.next();

			System.out.printf("������ ��ǰ�� �Է�: ");

			String BOOKNAME = scan.next();			

			System.out.printf("������ ���� �Է�: ");

			int price = scan.nextInt();			

			

			pstmt.setString(1, BOOKNAME);

			pstmt.setInt(2, price);			

			pstmt.setString(3, BOOKID);

			int cnt = pstmt.executeUpdate(); 

			System.out.println(cnt + "���� ����Ǿ����ϴ�.");

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
