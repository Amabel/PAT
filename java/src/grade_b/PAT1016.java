package grade_b;

import java.util.Scanner; 
public class PAT1016 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 2; i++) {		
			String a = sc.next();
			String b = sc.next();
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < a.length(); j++) {
				if (b.charAt(0) == a.charAt(j)) {
					sb.append(b);
				}
			}
			sum += sb.toString().equals("") ? 0 : Integer.parseInt(sb.toString());
		}
		System.out.println(sum);
	}
}
