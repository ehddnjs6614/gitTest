package test_test;

class b{
	private String name;
	private int height;
	private int weight;
	
	b(String n, int h, int w){
		name = n; height = h; weight = w;
	}
	String getName() {return name;}
	int getHeight() {return height;}
	int getWeight() {return weight;}
	
	void gaiWeight(int w) {weight +=w;}
	void reduceWeight(int w) {weight -=w;}
	
}

public class test_25 {

	public static void main(String[] args) {
		b gildong = new b("�浿",170,60);
		b kdw = new b("����",180,60);
		
		gildong.gaiWeight(3);
		kdw.reduceWeight(5);
		
		System.out.println("�̸� :" + gildong.getName());
		System.out.println("���� :" + gildong.getHeight() + "cm");
		System.out.println("ü�� :" + gildong.getWeight() + "kg");
		System.out.println();
		System.out.println("�̸� :" + kdw.getName());
		System.out.println("���� :" + kdw.getHeight() + "cm");
		System.out.println("ü�� :" + kdw.getWeight() + "kg");

	}

}
