package day05IfStatement;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        //Example 1: Kullanicidan alinan sayinin tek mi cift mi oldugunu ekrana yazan kodu yaziniz.
        Scanner input = new Scanner(System.in);
//        System.out.println("Bir sayi giriniz...");
//        int s = input.nextInt();
//        //1.Yol:
//        if(s%2==0){
//            System.out.println("Cift sayi...");
//        }
//        if(s%2!=0){//"!=" demek "esit degil" demektir.
//            System.out.println("Tek sayi...");
//        }
//        //2.Yol:
//        // "else" ing de diger butun  durumlar ıcın anlamına gelir..
//        if(s%2==0){
//            System.out.println("Cift sayi...");
//        }else{
//            System.out.println("Tek sayi...");
//        }
//

        // Example kadir:

        System.out.println("Bir sayi giriniz...");
        int t = input.nextInt();

        if (t%2==0){
            System.out.println("cıft sayı....");
        }else {
            System.out.println("tek sayı...");
        }

        //Example 2: Bir sayinin negatif, pozitif veya notr oldugunu soyleyen kodu yaziniz
        // "else" ing de diger butun  durumlar ıcın anlamına gelir..
//        System.out.println("Bir sayi giriniz...");
//        double d = input.nextDouble();
//
//        if(d>0){
//            System.out.println("Pozitif");
//        }else if(d==0){
//            System.out.println("Notr");
//        }else{
//            System.out.println("Negatif");
//        }
//
        // Example Kadir

        System.out.println("bir sayı gir");
        double f = input.nextDouble();

        if (f>0){
            System.out.println("pozitifff");

        } else if (f==0) {
            System.out.println("tarafsız");
        }else {
            System.out.println("negatt");



        }

    }

}


