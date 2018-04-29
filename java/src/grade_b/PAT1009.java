package grade_b;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class PAT1009 {
	public static void main(String[] args) {
		Deque<String> list = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		for (String str : sc.nextLine().split(" ")) {
			list.addFirst(str);
		}
		System.out.print(list.removeFirst());
		while (!list.isEmpty()) {
			System.out.print(" " + list.removeFirst());
		}
	}
}
