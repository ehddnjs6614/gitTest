package test_test;

class Car{
	private String name;
	private String number;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double tankage;
	private double fuel;
	private double sfc;
	
	Car(String name, String number,int width,int height, int length,double tankage,
			double fuel,double sfc){
	this.name = name;
	this.number = number;
	this.width = width;
	this.height = height;
	this.length = length;
	this.tankage = tankage;
	this.fuel = (fuel <= tankage) ? fuel : tankage;
	this.sfc = sfc; x = y = 0.0;
		
	}
	double getX() {return x;}
	double getY() {return y;}
	double getFuel() {return fuel;}
	
	void putSpec() {
		System.out.println("�̸� :" + name);
		System.out.println("��ȣ :" + number);
		System.out.println("���� :" + width + "mm");
		System.out.println("���� :" + height + "mm");
		System.out.println("���� :" + length + "mm");
		System.out.println("��ũ :" + tankage + "����");
		System.out.println("���� :" + sfc + "km/����");
		
	}
	boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy *dy);
		double f = dist /sfc;
		
		if(f > fuel)
			return false;
		else {
			fuel -=f;
			x+=dx;
			y+=dy;
			return true;
		}
	}
	void refuel(double df) {
		if(df > 0) {
			fuel +=df;
			if(fuel > tankage)
				fuel = tankage;
		}
	}
}

public class test_26 {

	public static void main(String[] args) {
		Car k3 =new Car("K3","����999-99",1660,1500,3640,40.0,35.0,12.0);
		Car k5 =new Car("K5","����999-98",1660,1525,3695,41.0,35.0,12.0);
		
		k3.putSpec();
		System.out.println();
		k5.putSpec();

	}

}
