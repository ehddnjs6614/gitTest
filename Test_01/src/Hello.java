
public class Hello {
	
	public static int sum(int n, int m) {
		return n+ m;
	}

	// main() �޼ҵ忡�� ���� ����
	public static void main(String[] args) {
		int i = 20; //�������� ���� �������� 20
		int s; 		//s��� ������ �����ϴµ� ���� �ȳ���
		char a; 	//�������� a��� ������ ������ �ߴ� �������� ���ڸ������Է°���
		
		s =sum(i,10); // �޼ҵ� ȣ��
		a = '?';
		System.out.println(a);  		//���� '?'���
		System.out.println("Hello"); 	//"Hello" ���ڿ� ���
		System.out.println(s);			//���� s �� 30 ���
	}

}


