package grade_b;

import java.util.Scanner;

public class PAT1002 {

	public static void main(String[] args) {
		String[] pinyin = {"ling", "yi", "er", "san", "si", 
							"wu", "liu", "qi", "ba", "jiu"};
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += str.charAt(i) - '0';
		}
		String res = Integer.toString(sum);
		System.out.print(pinyin[res.charAt(0) - '0']);
		for (int i = 1; i < res.length(); i++) {
			System.out.print(" " + pinyin[res.charAt(i) - '0']);
		}	
	}
}
