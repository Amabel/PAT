package grade_b;

import java.util.Scanner;
public class PAT1049 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            int n = sc.nextInt();
            double sum = 0;
            for (int i = 1; i <= n; i++) {
                double a = sc.nextDouble();
                sum += a * i * (n - i + 1);
            }
            System.out.printf("%.2f", sum);
        }
    }
}
