package test_test;

import java.util.Scanner;

class test_18{
	static int min(int i, int j) {
		int min =i;
		if(j>min)min=j;
		
		return min;
	}			
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� i :"); int i =sc.nextInt();
		System.out.print("���� j :"); int j =sc.nextInt();
	
		System.out.print(  min(i,j) + "��Ů�ϴ�");

	}

}
