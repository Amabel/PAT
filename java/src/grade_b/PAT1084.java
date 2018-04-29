package grade_b;

import java.util.Scanner;
public class PAT1084 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String d = sc.next();
		int n = sc.nextInt();

		for (int i = 1; i < n; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < d.length(); j++) {
				int count = 1;
				char c = d.charAt(j);
				while (j + 1 < d.length() && d.charAt(j + 1) == c) {
					count ++;
					j ++;
				}
				sb.append(c + "" + count);						
			}
			d = sb.toString();
		}
		System.out.println(d);
	}
}
