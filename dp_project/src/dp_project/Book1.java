package dp_project;

import java.util.*;

public class Book1 {



	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		int cmdNo = 0;



		while (true) {

			System.out.println("");

			System.out.println("���ϴ� �޴��� �����Ͻʽÿ�.");

			System.out.println("\t** ���� 	���� **");
			System.out.println("\t1.���� ��ȸ");
			System.out.println("\t2.���� �Է�");
			System.out.println("\t3.���� ����");
			System.out.println("\t4.��	��");

			cmdNo = scan.nextInt();



			if (cmdNo == 1) {

				Jdbc_Select select = new Jdbc_Select(); // ��ȸ Ŭ������ ��ü ����

				select.selectMethod(); // ��ȸ Ŭ������ ��ȸ �޼ҵ� ����

			}

			else if (cmdNo == 2) {

				Jdbc_Update update = new Jdbc_Update(); // ���� Ŭ������ ��ü ����

				update.updateMethod(); // ���� Ŭ������ ���� �޼ҵ� ����

			}

			else if (cmdNo == 3) {

				Jdbc_Delete delete = new Jdbc_Delete(); // ���� Ŭ������ ��ü ����

				delete.deleteMethod(); // ���� Ŭ������ ���� �޼ҵ� ����

			}

			else if (cmdNo == 4) {

				Jdbc_Insert insert = new Jdbc_Insert(); // �Է� Ŭ������ ��ü ����

				insert.insertMethod(); // �Է� Ŭ������ �Է� �޼ҵ� ����

			}

			else {

				scan.close();

			break;

			}			

		}

	}

}



