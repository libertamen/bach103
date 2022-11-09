package day13loopsarr;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        //Example1: kullanıcıdan bır sayı alınınz. sayı 100 kucuk  ıse ekrana kazandın yazdırın
        // aksı halde kaybettın yazdırın.
        //kullanıcı kazandıkca oyun devam etmelı.

        Scanner input = new Scanner(System.in);
//        int sayı = 0;
//        do {
//            System.out.println("bır sayı gırınız");
//            sayı = input.nextInt();
//
//            if (sayı < 100) {
//                System.out.println("kazandınız!");
//
//            }
//        } while (sayı < 100);
//
//        System.out.println("kaybettınız!!!");

        // Example 2: Kullanıcıdan ısımleer  alınız ılk harfının buyuk olup olmadıgını kontrol edınız.

        do {
            System.out.println("isim gırınız");

            char ilkHarf = input.next().charAt(0);

            if (ilkHarf>= 'A' && ilkHarf <= 'Z') {
                System.out.println("ismi basarıyla gırdınız");
            } else {
                System.out.println("ısmı yanlıs gırdıgınız ıcın ıptal edılmıstır");
                break;
            }

        }while (true);

//        // Infinite Loop: Sonsuz dongu
//
//        // artırma azaltma kısmındsa hata yaparsanız " infinite loop sorunsal"'ı olusur.
//
//       for (int i=1; i<4; i--){
//          System.out.println("hi!");
//       }
//         // artırma azaltma kısmını yazmazsanız hata yaparsanız " infinite loop sorunsal"'ı olusur.
//        for (int i=1; i<4; ){
//            System.out.println("hi!");
//        }

        int i = 12;

        while (i<15){
            System.out.println("hi!");
        }

    }

    }

