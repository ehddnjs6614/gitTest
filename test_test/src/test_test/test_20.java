package test_test;

import java.util.Scanner;

public class test_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구한다");
		System.out.print("n의 값 : ");
		
		int n =sc.nextInt();
		
		int sum =0;
		for(int i = 1; i<=n; i++)
			sum +=i;

		System.out.println("1부터" + n +"까지의 합은 " + sum +"임");
	}

}
