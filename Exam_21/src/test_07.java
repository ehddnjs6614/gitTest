import java.util.Scanner;
import java.util.StringTokenizer;

public class test_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String s = sc.nextLine();
			if(s.equals("그만")) {
				System.out.println("종료합니다");
				break;
			}
			StringTokenizer st = new StringTokenizer(s," ");
			System.out.println("어절 갯수는 " + st.countTokens());
		}
		sc.close();

	}

}
