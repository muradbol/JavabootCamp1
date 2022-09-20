package ForLoop;

import java.util.Scanner;

public class LoopFor {
    public static void main(String[]args){
        System.out.println("Bir rakam giriniz, girdiğiniz rakamlar tek tek sıralansın. :)");
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        for (int i=1;i<=a;i++){
            System.out.println("Sayi : "+i);
        }
        System.out.println("İşlemimiz Bitti :)");
    }
}
