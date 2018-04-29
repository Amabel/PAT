package grade_b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PAT1013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		int count = 0;
		int num = 2;
		// find prime numbers
		while (count < n) {
			if (isPrime(num)) {
				count++;
				if (count >= m) {
					list.add(num);
				}
			}
			num++;
		}
		// print
		count = 1;
		for (int i = 0; i < list.size(); i++) {
			if (count % 10 != 1) {
				System.out.print(" ");
			}
			System.out.print(list.get(i));
			if (count % 10 == 0) {
				System.out.println();
			}
			count++;
		}
	}

	static boolean isPrime(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
