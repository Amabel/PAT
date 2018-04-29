package grade_b;

import java.util.Scanner;

public class PAT1061 {

	public static void main(String[] args) {
		int n, m;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int[][] arr = new int[n + 2][m];
		for (int i = 0; i < n + 2; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		// calculate points
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < m; j++) {
				if (arr[i + 2][j] == arr[1][j]) {
					sum += arr[0][j];
				}
			}
			System.out.println(sum);
		}
	}
}
