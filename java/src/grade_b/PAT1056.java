package grade_b;

import java.util.Scanner;

public class PAT1056 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i ++) {
			num[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < num.length; i ++) {
			for (int j = 0; j < num.length; j ++) {
				if (i != j) {
					sum += num[i] * 10 + num[j];
				}
			}
		}
		System.out.println(sum);
	}
}
