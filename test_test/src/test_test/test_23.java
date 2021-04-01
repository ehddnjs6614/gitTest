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
		System.out.print("int 형 정수 a의 값 :");
		int a= sc.nextInt();
		System.out.print("long 형 정수 a의 값 :");
		long b= sc.nextLong();
		System.out.print("float 형 정수 a의 값 :");
		float c= sc.nextFloat();
		System.out.print("double 형 정수 a의 값 :");
		double d= sc.nextDouble();
		System.out.println("a의 절대값은 " + absolute(a) + "입니다");
		System.out.println("b의 절대값은 " + absolute(b) + "입니다");
		System.out.println("c의 절대값은 " + absolute(c) + "입니다");
		System.out.println("d의 절대값은 " + absolute(d) + "입니다");
		
	}

}
