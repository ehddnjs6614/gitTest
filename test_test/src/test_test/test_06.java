package test_test;

import java.util.Scanner;

public class test_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����  a: ");
		int a = sc.nextInt();
		
		System.out.print("����  b: ");
		int b = sc.nextInt();
		
		System.out.print("����  c: ");
		int c = sc.nextInt();
		
		if(a > b) {
			int t = a; a=b; b=t;
		}
		if(b>c) {
			int t=b; b=c; c=t;
		}
		if(a> b) {
			int t =a; a=b; b=t;
		}
		System.out.println("a < b < c �� �ǵ��� �����߽��ϴ�");
		System.out.println("���� a�� "+ a + "�Դϴ�.");
		System.out.println("���� b�� "+ b + "�Դϴ�.");
		System.out.println("���� c�� "+ c + "�Դϴ�.");
	}

}
