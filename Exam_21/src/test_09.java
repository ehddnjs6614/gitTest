
public class test_09 {
	public static void main(String[] args) {
		System.out.println(Math.PI); //원주율 상수 
		System.out.println(Math.ceil(3.14)); // 올림
		System.out.println(Math.floor(3.14)); // 내림
		System.out.println(Math.sqrt(9)); // 제곱근
		System.out.println(Math.exp(2)); // e의 2승
		System.out.println(Math.round(3.14)); // 반올림
		
		// 1,45 사이의 정수형 난수 5개
		System.out.println("이번주 행운의 번호는 ?");
		for(int i=0; i<6; i++)
			System.out.println((int)(Math.random()*45 +1)+ " ");
	}

}
