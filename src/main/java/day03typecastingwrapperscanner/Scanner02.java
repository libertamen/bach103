package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {


    public static void main(String[] args) {

//        //Example 1: Sayıları kullanıcıdan alan ve toplama ısı yapan kodu yazın
//
//        //1.adım : scanner classdan object olustur.
//        Scanner input = new Scanner(System.in);
//
//        // 2. adım kullanıcıya ne yapacıgını soyle
//        System.out.println("ilk sayıyı gırın...");
//        double sayı1 = input.nextDouble();
//
//        System.out.println("ıkıncı sayıyı gırınız...");
//        double sayı2 = input.nextDouble();
//
//        System.out.println(sayı1 + sayı2);

//        örnek: sayıları kullanıcıdan alan ve toplama işi yapan kodu giriniz.
        Scanner input = new Scanner(System.in);

//        System.out.println("bir sayı gir");
//
//        double sayı = input.nextDouble();
//
//        System.out.println("bir daha sayı gir");
//
//        double sayı1 = input.nextDouble();
//        System.out.println(sayı + sayı1);
//
//        System.out.println("sayı yaz");
//        int rakam = input.nextInt();
//        System.out.println("bir daha yaz");
//        int rakam1 = input.nextInt();
//        System.out.println(rakam / rakam1);

        System.out.println(" iki basamaklı bir sayı giriniz....");
        double sayı1 = input.nextDouble();
        System.out.println("uc basamaklı bir sayı giriniz.....");
        short sayı2 = input.nextShort();

        System.out.println(sayı1 + sayı2 );

    }
}

