package test_test;

import java.util.Scanner;

public class test_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� ��:");
		int n = sc.nextInt();
		int [] a =new int[n];
		
		for(int j=0; j<n; j++) {
			System.out.print("a["+j+"] = ");
			a[j] = sc.nextInt();
		}
		System.out.print("ã�� ����: ");
		int key = sc.nextInt();
		
		int i;
		for(i = 0; i<n; i++)
			if(a[i] == key)
				break;
				
		if (i<n)
			System.out.println("�� ����  a["+ i +"]�� �ֽ��ϴ�.");
		else
			System.out.println("�ش� ���� �������� �ʽ��ϴ�.");
	}

}
