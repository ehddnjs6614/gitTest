package dp_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Book {
	static class bookmgr{
		int bookid;
		String bookname;
		String publisher;
		int price;
		static Connection conn = null;
		static PreparedStatement stmt;
		
		bookmgr(int s1, String s2, String s3 , int s4){
			this.bookid =s1;
			this.bookname =s2;
			this.publisher =s3;
			this.price =s4;
		}
		public static Connection dbConnect() {
			String url= "jdbc:oracle:thin:@localhost:1521:orcl";
			String userid = "hr";
			String pwd ="1234";
			
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
				}catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				try {
					System.out.println("데이터베이스 연결 준비 ...");
					conn=DriverManager.getConnection(url,userid,pwd);
					System.out.println("데이터베이스 연결 성공");
				}catch(SQLException e) {
					e.printStackTrace();
				}
				return conn;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
