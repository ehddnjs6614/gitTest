package test_test;

import java.util.Scanner;

public class test_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���Ѵ�");
		System.out.print("n�� �� : ");
		
		int n =sc.nextInt();
		
		int sum =0;
		for(int i = 1; i<=n; i++)
			sum +=i;

		System.out.println("1����" + n +"������ ���� " + sum +"��");
	}

}
