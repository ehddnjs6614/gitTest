package test_test;

import java.util.Scanner;

public class test_05 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("����  a : ");
		int a = stdIn.nextInt();
		
		System.out.print("����  b : ");
		int b = stdIn.nextInt();
		
		System.out.print("����  c : ");
		int c = stdIn.nextInt();

	int med;
	if(a >= b)
		if(b >= c)
			med = b;
		else if (a <=c)
			med = a;
		else 
			med = c;
	else if(a > c)
		med = a;
	else if (b >c)
		med = c;
	else
		med =b;
	System.out.println("�߾Ӱ��� " + med + "�Դϴ�");
	}

}
