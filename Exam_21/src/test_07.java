import java.util.Scanner;
import java.util.StringTokenizer;

public class test_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String s = sc.nextLine();
			if(s.equals("�׸�")) {
				System.out.println("�����մϴ�");
				break;
			}
			StringTokenizer st = new StringTokenizer(s," ");
			System.out.println("���� ������ " + st.countTokens());
		}
		sc.close();

	}

}
