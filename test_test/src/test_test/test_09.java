package test_test;

import java.util.Scanner;

public class test_09 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1���� n������ ���� ���մϴ�");
		int n;
		do {
			System.out.print("n�� �� : ");
			n = stdIn.nextInt();
		}while(n <=0);
		int sum = 0;
		for(int i=1;i<n;i++) {
			System.out.println(i+"+");
			sum +=i;
		}
		System.out.print(n + "=");
		sum +=n;
		System.out.println(sum);
	}
	

}
