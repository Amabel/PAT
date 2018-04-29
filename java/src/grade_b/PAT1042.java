package grade_b;

import java.util.Scanner;

public class PAT1042 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		String str = sc.nextLine().toLowerCase();
		for (int i = 0; i < str.length(); i ++) {
			char v = str.charAt(i);
			int n = v - 'a';
			if (n >= 0 && n <= 25) {
				arr[n] ++;
			}
		}
		int count = 0;
		int maxIndex = 0;
		for (int i = 0; i < arr.length; i ++) {
			if (arr[i] > count) {
				count = arr[i];
				maxIndex = i; 
			}
		}
		System.out.println((char)('a' + maxIndex) + " " + count);
	}
}
