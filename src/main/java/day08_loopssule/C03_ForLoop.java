package day08_loopssule;

import java.util.Scanner;

public class C03_ForLoop {
    public static void main(String[] args) {



        /*
  Kullanicidan bir cumle ve bir harf alin,
  Cumlede verilen harfin kac kere
  kullanildigini bulup, yazdirin

  ORNEK:

  INPUT : Cumle: Java ogrenmek cok guzel. ==> Harf :e

  OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
 */
        Scanner input = new Scanner(System.in);

        System.out.println(" lutfen bır cumle gırınız ....");
        String cumle= input.nextLine().toLowerCase();

        System.out.println(" lutfen saydırmak ıstedıgınız harfı gırınız...");

        char harf =input.next().toLowerCase().charAt(0);

        int sayac=0;

        for (int i = 0; i < cumle.length(); i++) {

            if (cumle.charAt(i)==harf){
                sayac++;

            }

        }

        System.out.println("gırdıgınız cumlede" + harf+ "harfı" +sayac+"tanedır");


    }
}
