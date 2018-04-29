package grade_b;

import java.util.Scanner;
public class PAT1077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int g2 = sc.nextInt();
            int count = 0;
            int g1 = 0;
            int max = -1, min = m + 1;
            for (int j = 0; j < n - 1; j++) {
                int s = sc.nextInt();
                if (s >= 0 && s <= m) {
                    if (s > max) max = s;
                    if (s < min) min = s;
                    g1 += s;
                    count ++;
                }
            }
            System.out.println((int)(((g1 - max - min) / (count - 2.0) + g2) / 2 + 0.5));
        }
    }
}
