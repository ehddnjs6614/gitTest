package test_test;

import java.util.Scanner;

public class test_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정숫값 : ");
		int n = sc.nextInt();
		
		if(n>=0)
			System.out.println("절대 값은 " + n + "입니다");
		else
			System.out.println("절대값은" + -n + "입니다");
	}

}
