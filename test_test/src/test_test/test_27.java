package test_test;

import java.util.Scanner;

class PersonInfo{
	private int PN; //고유번호
	private String name; //이름
	private int age;// 나이 
	private String number;//전화번호
 
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
	System.out.println("이름 :" + this.name);
	System.out.println("나이 :" + this.age);
	System.out.println("전화번호 :" + this.number);
	
}
 
	    
	 
	
}
public class test_27 {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        //추가, 삭제, 수정을 위한 객체 생성
        PersonManager pm = new PersonManager();
        
 
        boolean power = true;
        
        while(power) {
            scan.reset();
            System.out.println("*************\n***연락처관리 ***\n*************\n");
            System.out.println("1. 출력, 2. 추가, 3. 수정, 4. 삭제, 5. 종료, 6. 처음으로");
            
            String menuNum = scan.next();
 
            if("1".equals(menuNum)) {
                pm.showInfo();
            }else if("2".equals(menuNum)) {
                pm.addInfo(makeInfo());
            }else if("3".equals(menuNum)) {
                System.out.println("수정할 정보의 고유번호를 입력해 주세요.");
                int PN = scan.nextInt();
                pm.updateInfo(makeInfo(), PN);
            }else if("4".equals(menuNum)) {
                System.out.println("삭제할 정보의 고유번호를 입력해 주세요.");
                pm.removeInfo(scan.nextInt());
            }else if("5".equals(menuNum)) {
                power = false;
                System.out.println("종료되었습니다");
            }else if("6".equals(menuNum)) {
                continue;
            }else {
                System.out.println("해당 메뉴는 없는 메뉴입니다. 다시 선택 바랍니다.");
                continue;    
            }
        }
        scan.close();
    }
    
    public static PersonInfo makeInfo() {
        scan.reset();
        PersonInfo person = new PersonInfo();
        
        System.out.print("이름 : ");
        person.setname(scan.next());
        System.out.println();
 
        System.out.print("나이 : ");
        person.setage(scan.nextInt());
        System.out.println();
 
        System.out.print("전화번호  : ");
        person.setnumber(scan.next()); 
        System.out.println();
                
        return person;
    }
}
