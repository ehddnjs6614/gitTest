/*package test_test;

import java.util.Scanner;

public class test_28 {
	public static void printHumanArray(Human[] a) {
		for(int i = 0; i<a.length; i++)
			System.out.printf("No.%d %s $3dcm %3dkg\n",
					i, a[i].getName(),a[i].getHeight(),a[i].getWeight());	
	} 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		Human[] p = {
				new Human("ö��",170,70),
				new Human("�浿",170,59),
		};
		System.out.print("�迭 q�� ��� ��:");
		n = sc.nextInt();
		
		Human[]q = new Human[n];
		for(int i =0; i<q.length; i++) {
			System.out.println("q["+i+"]");
			System.out.print("�̸�:");String name = sc.next();
			System.out.print("����:");int height = sc.nextInt();
			System.out.print("ü��:");int weight = sc.nextInt();
			q[i] = new Human(name, height , weight);
		}
		Human[][] x = {
				{new Human("��ö�� ", 175, 52), new Human("�迵��",169 ,60)},
				{new Human("ȫ�浿 ", 175, 52),new Human("��ö��",169 ,60)},
				{new Human("�̿��� ", 175, 52), new Human("��浿",169 ,60)},
		};
				System.out.print("�迭 y�� �� ��:");
				n = sc.nextInt();
				Human[][] = new Human[n][];
				for(int i=0; i<y.length; i++) {
					System.out.print("y["+i+"]�� �� ��:");
					n =sc.nextInt();
					y[i] = new Human[n];
					for(int j=0; j<y[i].length; j++) {
						System.out.println("y["+i+"][" +j+"]");
						System.out.print("�̸�:");String name = sc.next();
						System.out.print("����:");int height = sc.nextInt();
						System.out.print("ü��:");int weight = sc.nextInt();
						y[i][j] = new Human(name, height , weight);
					}
				}
				System.out.println("m�� p");
				printHumanArray(p);
				System.out.println("m�� p");
				printHumanArray(p);
				
				System.out.println("m�迭 x");
				for(int i =0; i<x.length; i++) {
					System.out.printf("%d��\n", i);
					printHumanArray(x[i]);
				}
				System.out.println("m�迭 y");
				for(int i =0; i<y.length; i++) {
					System.out.printf("%d��\n", i);
					printHumanArray(y[i]);
				
		}
	}

}*/
