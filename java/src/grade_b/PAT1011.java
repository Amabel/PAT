package grade_b;

import java.util.Scanner;

public class PAT1011 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			long a = sc.nextInt();
			long b = sc.nextInt();
			long c = sc.nextInt();
			System.out.println("Case #" + (i + 1) + ": " + (a + b > c ? true : false));
		}
	}
}
