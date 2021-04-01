import java.util.Scanner;
public class ArithmeticOperator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		//클래스 이름 Scanner , 
		
		System.out.println("정수를 입력하세요 : "); //출력
		int time = scanner.nextInt(); //정수형으로 time를줌 ,정수입력
		int second = time % 60; 	  // 60으로 나눈 나머지 초	
		int minute = (time / 60) % 60; //60으로 나눈 몫을 다시 60으로 나눈 나머지 분
		int hour = (time / 60) / 60; // 60으로 나눈 몫을 다시 60으로 나는 몫은 시간
		
		System.out.print(time + "초는"); // + 연결 연산자
		System.out.print(hour + "시간 ,");
		System.out.print(minute + "분,");
		System.out.println(second + "초입니다");
		scanner.close();
	}

}
