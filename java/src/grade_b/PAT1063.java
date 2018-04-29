package grade_b;

import java.util.Scanner;

public class PAT1063 {

    public static void main(String[] args) {
        
       try (Scanner sc = new Scanner(System.in);) {
           double res = 0;
           int n = sc.nextInt();
           for (int i = 0; i < n; i++) {
               int x = sc.nextInt();
               int y = sc.nextInt();
               int abs = x * x + y * y;
               res = Math.max(res, abs);
               
           }
           System.out.printf("%.2f\n", Math.sqrt(res));
       }
    }
}
