package test_test;

import java.util.Scanner;

public class test_08 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ǥ���ұ�� ? ");
		int n = sc.nextInt();
		if(n>0) {
			int i =0;
			while(i<n) {
				if(i%2==0)
					System.out.print('*');
				else
					System.out.print('+');
				i++;
				
			}
			System.out.println();
		}

	}

}
