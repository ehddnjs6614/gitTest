package test_test;

import java.util.Scanner;

public class test_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� : ");
		int n = sc.nextInt();
		
		if(n>0)
			System.out.println("���� ����Դϴ�");
		else if(n < 0)
			System.out.println("���� �����Դϴ�");
		else
			System.out.println("���� 0 �Դϴ�.");

	}

}
