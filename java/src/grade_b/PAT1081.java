package grade_b;

import java.util.Scanner;

public class PAT1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            if (str.length() >= 6) {
                boolean hasAlpha = false;
                boolean hasNum = false;
                boolean invalid = false;
                for (int j = 0; j < str.length(); j++) {
                    char c = str.charAt(j);
                    if (c != '.' && !Character.isDigit(c) && !Character.isLetter(c)) {
                        invalid = true;
                    } else if (Character.isDigit(c)) {
                        hasNum = true;
                    } else if (Character.isLetter(c)) {
                        hasAlpha = true;
                    }
                }
                if (invalid) System.out.println("Your password is tai duan le.");
                else if (!hasNum) System.out.println("Your password needs shu zi.");
                else if (!hasAlpha) System.out.println("Your password needs zi mu.");
                else System.out.println("Your password is wan mei.");
            } else {    
                System.out.println("Your password is tai duan le.");
            } 
        }
    }
}
