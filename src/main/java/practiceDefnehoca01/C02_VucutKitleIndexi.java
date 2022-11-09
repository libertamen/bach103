package practiceDefnehoca01;

import java.util.Scanner;

public class C02_VucutKitleIndexi {

    public static void main(String[] args) {

       /*
       Kullanicidan kilosunu ve boyunu alip
       Vucut kitle indeksini hesaplayan bir program yaziniz.
       Ipucu : Vucut
       Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
       ORNEK:
       INPUT      : Kilo: 71
                    Boy: 1,72
       OUTPUT  : Vucut Kitle Indeksiniz : 23

          */



            Scanner input = new Scanner(System.in);

            System.out.println("Lutfen kg olarak kilonuzu giriniz : ");
            double agirlik=input.nextDouble();

            System.out.println("Lutfen boyunuzu giriniz : ");
            double uzunluk= input.nextDouble();

            uzunluk= uzunluk/100;

            double vki= agirlik/(uzunluk*uzunluk);
            System.out.println("Vucut kitle indexiniz : " + vki);













        }
}
