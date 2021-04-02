import java.util.Scanner;

public class test_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 :");
		
		String str =sc.nextLine();
		
		for(int i=1; i<=str.length(); i++) {
			
			System.out.print(str.substring(i));
			System.out.println(str.substring(0,i));
		}
			sc.close();
	}

}
