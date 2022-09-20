package asalsayi;

import java.util.Scanner;

/* public class asalsayi {
    public static void main(String[] args) {
        System.out.println("Bir sayi girin asal mı değilmi bulalım.");
        Scanner sc = new Scanner(System.in);
        boolean asalMi = true;
        int sayi = sc.nextInt();
        if (sayi == 1) {
            System.out.println("1 SAYİSİ ASAL DEĞİLDİR.");
            return;
        }
        if (sayi < 1) {
            System.out.println("Hatalı sayi");
            return;
        }
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asalMi = false;
                break;
            }
        }
        if (asalMi == true) {
            System.out.println("Asal sayidir");
        } else {
            System.out.println("Asal sayi değildir.");
        }
    }
}
*/
class asalsayi {
    public static void main(String[] args) {

        System.out.println("Bir sayi girin asal mı değilmi bulalım.");
        Scanner sc = new Scanner(System.in);

        String str = "Asal sayidir";
        int sayi = sc.nextInt();
        if (sayi == 1) {
            System.out.println("1 SAYİSİ ASAL DEĞİLDİR.");
            return;
        }
        if (sayi < 1) {
            System.out.println("Hatalı sayi.");
            return;
        }

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                str = "Asal sayi değildir.aaaaaaa";

                break;
            }
        }
        System.out.println(sayi + str);


    }
}