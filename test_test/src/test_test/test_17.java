package test_test;

import java.util.Scanner;

public class test_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ұ�Ģ�� 2���� �迭�� �����մϴ�.");
		System.out.print("�� �� :");
		int height = sc.nextInt();
		
		int[][] c =new int[height][];
		
		for(int i =0; i<c.length; i++) {
			System.out.print(i + "��°�� �� ��:");
			int width = sc.nextInt();
			c[i] = new int[width];
		}
		
		System.out.println("�� ����� ���� �Է��ϼ���");
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length; j++) {
				System.out.printf("c[%d][%d] :", i,j);
				c[i][j] = sc.nextInt();
			}
		}
		System.out.println("�迭c�� �� ��� ���� ������ �����ϴ�.");
		for(int i =0; i<c.length; i++) {
			for(int j=0; j<c[i].length; j++)
				System.out.printf("%3d", c[i][j]);
			System.out.println();
		}

	}

}
