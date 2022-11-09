package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        //Example 1 :Kullanıcıdan bır dıkdortgenın en ve boyunu alan ve cevresını hesaplayan kodu yazınız

        Scanner input = new Scanner(System.in);

//        System.out.println("Dıkdorgenın kısa kenarını gırınız...");
//        int en = input.nextInt();
//
//        System.out.println("Dıkdortgenın uzun kenarıunı gırınız...");
//        int boy = input.nextInt();
//
//
//        System.out.println("Alan" + en*boy);
//
//
//        System.out.println("Cevre" + 2*(en+boy));



//
//        System.out.println("karenin bir kenarını giriniz");
//        int kısa = input.nextInt();
//
//        System.out.println("karenin diger kenarını giriniz");
//        int kenar = input.nextInt();
//
//        System.out.println( 2* (kısa+kenar));

        System.out.println("bir ucgenin bir kenarını yaz...");
        short bir = input.nextShort();

        System.out.println("ucgenin diger kenarını gir....");
        short iki = input.nextShort();

        System.out.println( 2 / (bir * iki));


    }

}
