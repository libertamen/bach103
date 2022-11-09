package day04_IfStatement;

public class IfStatement01 {

    public static void main(String[] args) {


        //If it rains I will cancel the picnic
        //if statement belli kodlari belli sartlara bagli olarak calistirmaya yarar

        //Example 1: Sayi pozitif ise ekrana pozitif yazdirin.
        int s = 12;
        if(s>0){
            System.out.println("Positive");

        }

        // Example 2:
        int a = 15;
            if(a>10){
                System.out.println("pozitif");
            }



        //Example 3: Verilen character buyuk harf ise ekrana "Buyuk Harf" yazdirin
        // "&&" ve anlamına gelir..
        char ch = 'V';
        if(ch>='A' && ch<='Z'){
            System.out.println("Buyuk Harf");
        }

        // Example 3:

        char h = 'K';
        if (h>='B' && h<'L'){
            System.out.println("buyuk harf");
        }

        /*
            && islemi sadece boolean ile kullanilir
                true && true = true
                true && false = false
                false && true = false
                false && false = false
            && islemi mukemmelliyetcidir, true sonucunu alabilmek icin hersey true olmalidir.
            Bir tane false varsa sonuc false demektir.
        */

        //Example 3: Verilen bir sayi uc basamakli ise ekrana "Uc basamakli" yazdiriniz.
        int n = -2430;
        n = Math.abs(n);
        if(n>99 && n<1000){// n>=100 && n<=999 veya n>99 && n<1000
            System.out.println("Uc basmakli");
        }

        // Example 4:
        int i = -984;

        i = Math.abs(i);
       if (i>99 && i<1000){
           System.out.println("uc basamaklı");
       }

        //Example 4: Verilen bir sayi cift sayi ise ekrana cift sayi yazdiriniz.

        //"=" isareti atama operatorudur, matematikteki esittir anlamina gelmez.
        //Matematikteki esittir sembolu Java'da "==" seklindedir
        //2+3  ==  5


        int p = -18;

        p = Math.abs(p);
        if(p%2 == 0){
            System.out.println("Cift sayi");
        }

        // Example 5:

        int c = -20;

        c = Math.abs(c);
        if (c%2 == 0){
            System.out.println("cıft sayı");
        }



        //Example 5: Verilen bir sayi 300 den kucuk veya 1200 den buyuk ise ekrana "Harika sayi" yazdirin
        int r = 250;
        if(r<300 || r>1200){
            System.out.println("Harika sayi");
        }

        /*  "||" JAVA da veya anlamına gelir..
             || islemi sadece boolean ile kullanilir.
                  true || true = true
                  true || false= true
                  false || true= true
                  false || false= false
            Not: || ( veya ) isleminde false alabilmek icin herseyin false olmasi gerekir.
                 || isleminde sadece bir tane true sonucu true yapmaya yeter
         */

        // Example 6:

        int q = 500;
        if (q<600 || q>1500){
            System.out.println("sayı");
        }

    }

    }

