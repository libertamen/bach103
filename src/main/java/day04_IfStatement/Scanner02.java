package day04_IfStatement;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

//         Example:1 kullanıcıdan ilk ve soy ismini alınız ilk ve soy isminin ilk harflerini ekrana yazdırınız...
//        Ali Can ==> A C

        Scanner input = new Scanner(System.in);

//        System.out.println("ilk isminizi giriniz");
//        char ilk = input.next().charAt(0);
//
//        System.out.println("soy isminizi giriniz....");
//        char son = input.next().charAt(0);
//
//        System.out.println("" + ilk + son );

//        Example2: kullanıcıdan ilk ve soy isimlerinin ikinci harfini ekrana yazdırınız..


//        System.out.println("isminizin giriniz....");
//        char ikinci = input.next().charAt(1);
//
//        System.out.println("soy isminizin giriniz....");
//        char son = input.next().charAt(1);
//
//        System.out.println("" + ikinci + son);





       /* not:
       1 -: char verıablerı matematıksel ıslemlerde kullanırsanız java onların ascıı degerlerını kullanır...
        ornegın System.out.println('A' + 'C' ; Ekrana AC yerine 132 veya baska rakam yazdırır...
        2-: java da sembolun ıkı anlamı vardır. 1 toplama ıslemı 2 bırlestırme ıslemı
        java "+" sembolu gorunce once toplama yapmaya calısır yapamazsa bırlestırme ıslemı yapmaya calısır o da olmazsa hata verır..Bırseyın ılk harfını
        yazdırmak ıstersek basına (" " +) koymak gerekır
         */

//        2 yol:



//        System.out.println("Tam isminizi giriniz...");
//
//        String tamİsim = input.nextLine();
//        char ilkHarf = tamİsim.charAt(0);
//        System.out.print(ilkHarf);
//
//        char soyİsiminİlkHarfi =tamİsim.split(" ")[1].charAt(0);
//        System.out.println(soyİsiminİlkHarfi);

        // 2 Example:

        System.out.println("bir meyve adı giriniz....");

        String meyve = input.nextLine();
        char ikinci = meyve.charAt(1);
        System.out.println(ikinci);

        // 3 Example:

        System.out.println("bir araba markası yazınız....");

        String ford = input.nextLine();
        char ucuncu = ford.charAt(3);
        System.out.println(ucuncu);




//        String str1 = "java";
//        String str2 = "Guzel";
//        int sayı1 = 5;
//        int sayı2 = 4;
//
//        System.out.println(str1 + " " + str2 +" " + sayı1 + sayı2);
//        System.out.println(str1 +" " + sayı1 + " " + str2);
//        System.out.println(str1 + (sayı1+sayı2)+sayı2);
//        System.out.println(sayı1 + "" + "" +sayı2 +  " " + str2);





    }
}
