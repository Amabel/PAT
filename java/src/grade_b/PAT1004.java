package grade_b;

import java.util.Scanner;

public class PAT1004 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String maxName = "", maxNumber = "";
		String minName = "", minNumber = "";
		String name, number;
		int maxScore = -1;
		int minScore = 101;

		for (int i = 0; i < n; i++) {
			name = sc.next();
			number = sc.next();
			int score = sc.nextInt();
			if (score > maxScore) {
				maxScore = score;
				maxName = name;
				maxNumber = number;
			}
			if (score < minScore) {
				minScore = score;
				minName = name;
				minNumber = number;
			}
		}
		System.out.println(maxName + " " + maxNumber);
		System.out.println(minName + " " + minNumber);
	}
}
