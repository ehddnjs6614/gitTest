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
		
		gildong.name = " 길동";
		gildong.height = 170;
		gildong.weight = 60;
		
		dw.name = "동원";
		dw.height =183;
		dw.weight = 65;
		
		System.out.println("이름 :" + gildong.name);
		System.out.println("신장 :" + gildong.height + "cm");
		System.out.println("체중 :" + gildong.weight + "kg");
		System.out.println();
		
		System.out.println("이름 :" + dw.name);
		System.out.println("신장 :" + dw.height + "cm");
		System.out.println("체중 :" + dw.weight + "kg");					
	}

}
