package grade_b;

import java.util.Scanner;
public class PAT1041 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] id = new String[n];
        int[] seat = new int[n];
        for (int i = 0; i < n; i++) {
            String sid = sc.next();
            int seat1= sc.nextInt() - 1;
            seat[seat1] = sc.nextInt();
            id[seat1] = sid;
        }
        int findCount = sc.nextInt();
        for (int i = 0; i < findCount; i++) {
            int seat1 = sc.nextInt() - 1;
            System.out.println(id[seat1] + " " + seat[seat1]);
        }
    }
}
