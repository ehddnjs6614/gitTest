package test_test;

import java.util.Scanner;

public class test_23 {
	
	static int absolute(int x) {
		return x >= 0? x : -x;
	}
	
	static long absolute(long x) {
		return x >= 0? x : -x;
	}
	static float absolute(float x) {
		return x >= 0? x : -x;
		
	}
	static double absolute(double x) {
		return x >= 0? x : -x;
		
	}	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("int �� ���� a�� �� :");
		int a= sc.nextInt();
		System.out.print("long �� ���� a�� �� :");
		long b= sc.nextLong();
		System.out.print("float �� ���� a�� �� :");
		float c= sc.nextFloat();
		System.out.print("double �� ���� a�� �� :");
		double d= sc.nextDouble();
		System.out.println("a�� ���밪�� " + absolute(a) + "�Դϴ�");
		System.out.println("b�� ���밪�� " + absolute(b) + "�Դϴ�");
		System.out.println("c�� ���밪�� " + absolute(c) + "�Դϴ�");
		System.out.println("d�� ���밪�� " + absolute(d) + "�Դϴ�");
		
	}

}
