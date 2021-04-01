package test_test;

import java.util.Scanner;

public class test_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 : ");
		int n = sc.nextInt(); //정수값으로 변환
		
		if(n < 0) //if 조건식 실행문
			//n<0 true때 실행
			System.out.println("이 값은 음의 값입니다.");

	}

}
