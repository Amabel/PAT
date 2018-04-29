package grade_b;

import java.util.Scanner;

public class PAT1036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int hight = n / 2 + n % 2;
        for (int i = 0; i < hight; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == hight - 1) {
                    System.out.print(s);
                } else {
                    if (j == 0 || j == n - 1) {
                        System.out.print(s);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
