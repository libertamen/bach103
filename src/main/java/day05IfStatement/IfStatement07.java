package day05IfStatement;

import java.util.Scanner;

public class IfStatement07 {
    public static void main(String[] args) {

        //Kullanici 0'dan kucuk 120'den buyuk deger giremiyecek sekilde degerleri aldiktan sonra ;
       // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabilir seklinde yazdiran bir kod yaziniz.


        Scanner input = new Scanner(System.in);

        System.out.println("lutfen cınsıyetınızı yazın...." + "\n kadın ıcın k \n erkek ıcın e harfı gırınız");
        char cınsıyet=input.next().toUpperCase().charAt(0);

        System.out.println("lutfen yasınızı gırın");
        double yas= input.nextDouble();

        if (cınsıyet=='k'){
            if (yas<0 || yas> 120){
                System.out.println("luyfen dogru yas degerlerını gırınız");

            }

        } else if (cınsıyet=='e') {


        }else System.out.println( "lutfen gecerlı bır harf gırınız...");


    }
}
