package sayiBulma;

public class sayiBulma {
    public static void main(String[] args) {
        int[] sayilar=new int[]{1,2,5,7,9,0};
        int aranacak =15;
        boolean varMi=false;
        for (int sayi:sayilar){
            if (sayi==aranacak){
                varMi=true;
             break;
            }
        }
        if (varMi==true){
            System.out.println("Aradığınız sayi mevcuttur.");
        }else{
            System.out.println("Aradığınız sayi yoktur.");
        }


    }
}
