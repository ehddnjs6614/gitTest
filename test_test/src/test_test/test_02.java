package test_test;

import java.util.Scanner;

public class test_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ : ");
		int n = sc.nextInt();
		
		if(n>=0)
			System.out.println("���� ���� " + n + "�Դϴ�");
		else
			System.out.println("���밪��" + -n + "�Դϴ�");
	}

}
