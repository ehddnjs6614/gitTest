package test_test;

import java.util.Scanner;

public class test_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� A : ");
		int a = sc.nextInt();
		System.out.print("���� B : ");
		int b = sc.nextInt();
		
		if(a % b == 0)
			System.out.println("B�� A�� ����Դϴ�.");
		else
			System.out.println("B�� A�� ����� �ƴմϴ�");
		
		

	}

}
