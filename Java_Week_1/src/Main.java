import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        String a = "Java Öğreniyorum.";
        System.out.println(a);
        System.out.println("Öğrenci sayınızı giriniz.: ");
        Scanner degeral = new Scanner(System.in);
        int sayi = degeral.nextInt();
        System.out.println("Öğrenci Sayisi : " + sayi);
    }
}