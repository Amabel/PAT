package grade_b;

import java.util.Scanner;

public class PAT1023 {

	public static void main(String[] args) {
		int[] num = new int[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		for (int i = 1; i < num.length; i++)  {
			if (num[i] != 0) {
				System.out.print(i);
				num[i] --;
				break;
			}
		}
		for (int i = 0; i < num.length; i++) {
			while (num[i] > 0) {
				System.out.print(i);
				num[i] --;
			}
		}
		System.out.println();
	}
}
