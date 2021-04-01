
//변환

public class test_1228 {

	public static void main(String[] args) {
		byte a =127; // 127로 값을줌 바이트형
		int b = a; // 정수형으로 b라는 걸 선언하고 a를 대입시킴 자동으로 변환
		System.out.println(b);
		
		float c =b; //float 실수형이고 c라는 변수를 잡아서 대입시킴
		System.out.println(c);
		
	}
}

/* 강제형변환 , 큰거에서 작은걸로 바꿀때는 조심
 * int a = 263;
 * system.out.println(a);
 * 
 * byte b = (byte)a;  // cast
 * system.out.println(b);
 * 
 */
