package grade_b;

import java.util.Scanner;
public class PAT1021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] bits = new int[10];
		for (int i = 0; i < str.length(); i++) {
			bits[str.charAt(i) - '0'] ++;
		}
		// print
		for (int i = 0; i < 10; i++) {
			if (bits[i] != 0) {
				System.out.println(i + ":" + bits[i]);				
			}
		}
	}
}
