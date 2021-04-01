
public class Hello {
	
	public static int sum(int n, int m) {
		return n+ m;
	}

	// main() 메소드에서 실행 시작
	public static void main(String[] args) {
		int i = 20; //정수형을 선언 정수형은 20
		int s; 		//s라는 정수를 선언하는데 값을 안넣음
		char a; 	//문자형의 a라는 변수를 선언을 했다 문자형은 한자리수만입력가능
		
		s =sum(i,10); // 메소드 호출
		a = '?';
		System.out.println(a);  		//문자 '?'출력
		System.out.println("Hello"); 	//"Hello" 문자열 출력
		System.out.println(s);			//정수 s 값 30 출력
	}

}


