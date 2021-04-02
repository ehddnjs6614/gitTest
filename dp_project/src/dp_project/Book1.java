package dp_project;

import java.util.*;

public class Book1 {



	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		int cmdNo = 0;



		while (true) {

			System.out.println("");

			System.out.println("원하는 메뉴를 선택하십시오.");

			System.out.println("\t** 도서 	정보 **");
			System.out.println("\t1.도서 조회");
			System.out.println("\t2.도서 입력");
			System.out.println("\t3.도서 삭제");
			System.out.println("\t4.종	료");

			cmdNo = scan.nextInt();



			if (cmdNo == 1) {

				Jdbc_Select select = new Jdbc_Select(); // 조회 클래스의 객체 생성

				select.selectMethod(); // 조회 클래스의 조회 메소드 실행

			}

			else if (cmdNo == 2) {

				Jdbc_Update update = new Jdbc_Update(); // 수정 클래스의 객체 생성

				update.updateMethod(); // 수정 클래스의 수정 메소드 실행

			}

			else if (cmdNo == 3) {

				Jdbc_Delete delete = new Jdbc_Delete(); // 삭제 클래스의 객체 생성

				delete.deleteMethod(); // 삭제 클래스의 삭제 메소드 실행

			}

			else if (cmdNo == 4) {

				Jdbc_Insert insert = new Jdbc_Insert(); // 입력 클래스의 객체 생성

				insert.insertMethod(); // 입력 클래스의 입력 메소드 실행

			}

			else {

				scan.close();

			break;

			}			

		}

	}

}



