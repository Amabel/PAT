package grade_b;

import java.util.Scanner;
public class PAT1076 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < 4; j++) {
//				String s = sc.next();
//				if (s.charAt(2) == 'T') {
//					sb.append(s.charAt(0) - 'A' + 1);
//				}
//			}
//		}
//		System.out.println(sb);
		
		while (sc.hasNext()) {
			String s = sc.next();
			if (s.length() == 3 && s.charAt(2) == 'T') System.out.print(s.charAt(0) - 'A' + 1); 
		}
	}
}
