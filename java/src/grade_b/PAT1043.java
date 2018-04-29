package grade_b;

import java.util.Scanner;

public class PAT1043 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		int[] arr = new int[6];
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			switch (c) {
				case 'P': arr[0]++; break;
				case 'A': arr[1]++;	break;
				case 'T': arr[2]++;	break;
				case 'e': arr[3]++;	break;
				case 's': arr[4]++;	break;
				case 't': arr[5]++;	break;
				default: break;
			}
		}
		// print
		boolean flag = true;
		while (flag) {
			flag = false;
			if (arr[0]-- > 0) {System.out.print("P"); flag = true;}
			if (arr[1]-- > 0) {System.out.print("A"); flag = true;}
			if (arr[2]-- > 0) {System.out.print("T"); flag = true;}
			if (arr[3]-- > 0) {System.out.print("e"); flag = true;}
			if (arr[4]-- > 0) {System.out.print("s"); flag = true;}
			if (arr[5]-- > 0) {System.out.print("t"); flag = true;}
		}
	}

}
