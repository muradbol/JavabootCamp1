package Diziler;

public class Diziler {
    public static void main(String[] args) {

        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Murat";
        ogrenciler[1] = "Engin";
        ogrenciler[2] = "Onur";
      /*  for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }*/
        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }

    }
}
