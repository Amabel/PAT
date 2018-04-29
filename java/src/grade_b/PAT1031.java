package grade_b;

import java.util.Scanner;
public class PAT1031 {
    public static void main(String[] args) {
        char[] checkArr = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};
        int[] w = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            boolean checked = true;
            String s = sc.nextLine();
            int sum = 0;
            for (int j = 0; j < s.length() - 1; j++) {
                if (s.charAt(j) < '0' || s.charAt(j) > '9') {
                    checked = false;
                    break;
                }
                sum += (s.charAt(j) - '0') * w[j];
            }
            if (!checked || s.charAt(s.length() - 1) != checkArr[sum % 11]) {
                System.out.println(s);
            } else {
                count ++;
            }
        }
        if (count == n) {
            System.out.println("All passed");
        }
    }
}

