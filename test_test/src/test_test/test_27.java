package test_test;

import java.util.Scanner;

class PersonInfo{
	private int PN; //������ȣ
	private String name; //�̸�
	private int age;// ���� 
	private String number;//��ȭ��ȣ
 
public int getPN() {
	return PN;
}
public void setPN(int pn) {
	this.PN = pn;
}
public String getname() {
	return name;
}
public void setname(String name ) {
	this.name = name;
}
public int getage() {
	return age;
}
public void setage(int age) {
	this.age = age;
}
public String number() {
	return number;
}
public void setnumber(String number) {
	this.number = number;
}
public void showInfo() {
	System.out.println("�̸� :" + this.name);
	System.out.println("���� :" + this.age);
	System.out.println("��ȭ��ȣ :" + this.number);
	
}
 
	    
	 
	
}
public class test_27 {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        //�߰�, ����, ������ ���� ��ü ����
        PersonManager pm = new PersonManager();
        
 
        boolean power = true;
        
        while(power) {
            scan.reset();
            System.out.println("*************\n***����ó���� ***\n*************\n");
            System.out.println("1. ���, 2. �߰�, 3. ����, 4. ����, 5. ����, 6. ó������");
            
            String menuNum = scan.next();
 
            if("1".equals(menuNum)) {
                pm.showInfo();
            }else if("2".equals(menuNum)) {
                pm.addInfo(makeInfo());
            }else if("3".equals(menuNum)) {
                System.out.println("������ ������ ������ȣ�� �Է��� �ּ���.");
                int PN = scan.nextInt();
                pm.updateInfo(makeInfo(), PN);
            }else if("4".equals(menuNum)) {
                System.out.println("������ ������ ������ȣ�� �Է��� �ּ���.");
                pm.removeInfo(scan.nextInt());
            }else if("5".equals(menuNum)) {
                power = false;
                System.out.println("����Ǿ����ϴ�");
            }else if("6".equals(menuNum)) {
                continue;
            }else {
                System.out.println("�ش� �޴��� ���� �޴��Դϴ�. �ٽ� ���� �ٶ��ϴ�.");
                continue;    
            }
        }
        scan.close();
    }
    
    public static PersonInfo makeInfo() {
        scan.reset();
        PersonInfo person = new PersonInfo();
        
        System.out.print("�̸� : ");
        person.setname(scan.next());
        System.out.println();
 
        System.out.print("���� : ");
        person.setage(scan.nextInt());
        System.out.println();
 
        System.out.print("��ȭ��ȣ  : ");
        person.setnumber(scan.next()); 
        System.out.println();
                
        return person;
    }
}
