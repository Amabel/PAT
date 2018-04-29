package grade_b;

import java.util.Scanner;

public class PAT1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] p = sc.next().split("\\.");
        int pGalleon = Integer.parseInt(p[0]);
        int pSickle = Integer.parseInt(p[1]);
        int pKnut = Integer.parseInt(p[2]);
        String[] a = sc.next().split("\\.");
        int aGalleon = Integer.parseInt(a[0]);
        int aSickle = Integer.parseInt(a[1]);
        int aKnut = Integer.parseInt(a[2]);
        // a - p
        int sign = 1;
        if (!(aGalleon >= pGalleon || (aGalleon == pGalleon && aSickle >= pSickle) ||
                (aGalleon == pGalleon && aSickle == pSickle && aKnut >= pKnut))) {
            // a <= p
            sign = -1;
            // swap
            int temp = pGalleon; pGalleon = aGalleon; aGalleon = temp;
            temp = pSickle; pSickle = aSickle; aSickle = temp;
            temp = pKnut; pKnut = aKnut; aKnut = temp;
        }
        // a - p
        int x = 0, y = 0, z = 0;
        if (aKnut >= pKnut) {
            z = aKnut - pKnut;
        } else {
            z = aKnut + 29 - pKnut;
            aSickle --;
        }
        if (aSickle >= pSickle) {
            y = aSickle - pSickle;
        } else {
            y = aSickle + 17 - pSickle;
            aGalleon --;
        }
        x = aGalleon - pGalleon;
        System.out.println((sign == 1 ? "" : "-") + x + "." + y + "." + z);
    }
}
