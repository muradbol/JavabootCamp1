package Switch;

import java.util.Scanner;

public class Switch {
    public static void main(String[]args){
        System.out.println("Lütfen A , B , C , D , E notlarından birisiniz giriniz. ");
        Scanner sc=new Scanner(System.in);
       /* charAt(0)' demek girilen ilk harfi almak ilk değeri*/ char notgiris=sc.next().charAt(0);

        switch (notgiris){
            case 'A':
                System.out.println("Tebrikler Mükemmel : Geçtiniz :)");
                break;
            case 'B':
                System.out.println("Tebrikler Fevkalede : Geçtiniz :)");
                break;
            case 'C':
                System.out.println("Tebrikler İYİ : Geçtiniz :)");
                break;
            case 'D':
                System.out.println("Tebrikler ORTA : Geçtiniz :)");
                break;
            case 'E':
                System.out.println("Tebrikler KÖTÜ : Geçtiniz :)");
                break;
            default:
                System.out.println("Geçersiz not girdiniz.");

        }

    }
}
