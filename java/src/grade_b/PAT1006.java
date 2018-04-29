package grade_b;

import java.util.Scanner;

public class PAT1006 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int bai = n / 100 % 10;
		// 百位
		for (int i = 0; i < bai; i++) {
			System.out.print("B");
		}
		// 十位
		int shi = n / 10 % 10;
		for (int i = 0; i < shi; i++) {
			System.out.print("S");
		}
		// 个位
		int ge = n % 10;
		for (int i = 0; i < ge; i++) {
			System.out.print(i + 1);
		}
	}
}
