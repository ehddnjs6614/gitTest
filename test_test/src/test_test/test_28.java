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
				new Human("Ã¶¼ö",170,70),
				new Human("±æµ¿",170,59),
		};
		System.out.print("¹è¿­ qÀÇ ¿ä¼Ò ¼ö:");
		n = sc.nextInt();
		
		Human[]q = new Human[n];
		for(int i =0; i<q.length; i++) {
			System.out.println("q["+i+"]");
			System.out.print("ÀÌ¸§:");String name = sc.next();
			System.out.print("½ÅÀå:");int height = sc.nextInt();
			System.out.print("Ã¼Áß:");int weight = sc.nextInt();
			q[i] = new Human(name, height , weight);
		}
		Human[][] x = {
				{new Human("±èÃ¶¼ö ", 175, 52), new Human("±è¿µÈñ",169 ,60)},
				{new Human("È«±æµ¿ ", 175, 52),new Human("ÀÌÃ¶¼ö",169 ,60)},
				{new Human("ÀÌ¿µÈñ ", 175, 52), new Human("±è±æµ¿",169 ,60)},
		};
				System.out.print("¹è¿­ yÀÇ Çà ¼ö:");
				n = sc.nextInt();
				Human[][] = new Human[n][];
				for(int i=0; i<y.length; i++) {
					System.out.print("y["+i+"]ÀÇ ¿­ ¼ö:");
					n =sc.nextInt();
					y[i] = new Human[n];
					for(int j=0; j<y[i].length; j++) {
						System.out.println("y["+i+"][" +j+"]");
						System.out.print("ÀÌ¸§:");String name = sc.next();
						System.out.print("½ÅÀå:");int height = sc.nextInt();
						System.out.print("Ã¼Áß:");int weight = sc.nextInt();
						y[i][j] = new Human(name, height , weight);
					}
				}
				System.out.println("m¹ò¿­ p");
				printHumanArray(p);
				System.out.println("m¹ò¿­ p");
				printHumanArray(p);
				
				System.out.println("m¹è¿­ x");
				for(int i =0; i<x.length; i++) {
					System.out.printf("%dÇà\n", i);
					printHumanArray(x[i]);
				}
				System.out.println("m¹è¿­ y");
				for(int i =0; i<y.length; i++) {
					System.out.printf("%dÇà\n", i);
					printHumanArray(y[i]);
				
		}
	}

}*/
