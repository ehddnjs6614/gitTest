
public class test_04 {

	public static void main(String[] args) {
		
		int count=0;
		String a = "my name is kim";
		
		for(int i = 0; i<a.length(); i++) {
			if(a.charAt(i) == ' ')
				count++;
		}
			System.out.println(count);
	}

}
