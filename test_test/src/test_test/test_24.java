package test_test;

class a{
	String name;
	int height;
	int weight;
		
}

public class test_24 {

	public static void main(String[] args) {
	
		a gildong = new a();
		a dw = new a();
		
		gildong.name = " �浿";
		gildong.height = 170;
		gildong.weight = 60;
		
		dw.name = "����";
		dw.height =183;
		dw.weight = 65;
		
		System.out.println("�̸� :" + gildong.name);
		System.out.println("���� :" + gildong.height + "cm");
		System.out.println("ü�� :" + gildong.weight + "kg");
		System.out.println();
		
		System.out.println("�̸� :" + dw.name);
		System.out.println("���� :" + dw.height + "cm");
		System.out.println("ü�� :" + dw.weight + "kg");					
	}

}
