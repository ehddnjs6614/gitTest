package test_test;

import java.util.Scanner;

public class test_21 {
	
	static int minOf(int[]a) {
		int min = a[0];
		for (int i =1; i<a.length; i++)
			if(a[i] < min)
				min = a[i];
		return min;
	}					
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("��� ���� : ");
	int num = sc.nextInt();
	int[] height = new int[num];
	int[] weight = new int[num];
	
	System.out.println(num+"���� ����� ü���� �Է�����." );
	for(int i =0; i<num; i++) {
		System.out.print((i+1) +"���� ����  :");
		height[i] = sc.nextInt();
		System.out.print((i+1) +"���� ü��  :");
		weight[i] = sc.nextInt();
	}
	
	System.out.println("���� Ű�� ���� ����� ���� :" + minOf(height) + "cm");
	System.out.println("���� ���� ����� ü�� :" + minOf(weight) + "kg");

	}

}
