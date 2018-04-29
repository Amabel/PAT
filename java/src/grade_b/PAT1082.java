package grade_b;

import java.util.Scanner;

public class PAT1082 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String maxID = "", minID = "";
		int maxDis = -1, minDis = 10000000;
		for (int i = 0; i < n; i++) {
			String id = sc.next();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int dis = x * x + y * y;
			if (dis < minDis) {
				minDis = dis;
				minID = id;
			}
			if (dis > maxDis) {
				maxDis = dis;
				maxID = id;
			}
		}
		System.out.println(minID + " " + maxID);
	}
}
