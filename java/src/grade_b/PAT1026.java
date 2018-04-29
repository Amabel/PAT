package grade_b;

import java.util.Scanner;
public class PAT1026 {
	public static void main(String[] args) {
		final int CLK_TCK = 100;
		Scanner sc = new Scanner(System.in);
		long sec = Math.round((- sc.nextDouble() + sc.nextDouble()) / CLK_TCK);
		System.out.printf("%02d:%02d:%02d\n", sec / 3600, sec / 60 % 60 , sec % 60);	
	}
}
