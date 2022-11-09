package day07_stringmanipulationsule;

public class C01_StringManipulationsConcat {
    public static void main(String[] args) {

 /*

    ONEMLI NOT=JAVA YUKARIDAN ASAGI ; SOLDAN SAGA CALISIR.

     */

//        System.out.println(15 + 20 + "Merhaba");//35Merhaba
//        System.out.println("Merhaba" + 15 + 20);//Merhaba1520
//        System.out.println("Merhaba" + (15 + 20));//Merhaba35
//        System.out.println("Merhaba" + 15 * 20);//Merhaba300
//
//            //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola kullanici nasil girerse girsin
//            //tam isminin buyuk harfle yazilmasini saglayin.
//
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("lutfen adınızı ve soyadınızı gırın");
//        String isim = input.nextLine(), soyIsim=input.nextLine();
//        String tamIsim=isim.concat(" "+ soyIsim).toUpperCase();
//        System.out.println("tamIsim" + tamIsim);

        /** substring()
         //substring() in iki kullanimi vardir.
         //1)substring(baslangic indexi, bitis indexi) String'in ortasindan bir parca almaya yarar
         //2)substring(baslangic indexi) String'in verilen index'ten sonuna kadar almaya yarar. Sonuc ise String dir.
         */

        //10.index dahil sonuna kadar verilen Stringi yazdiriniz
        String cumle = "Her dert Java gibi olsa";
        System.out.println("Her dert Java gibi olsa >>> "+ cumle.substring(10));// gibi olsa



        //son 10 harfi yazdirin >>>>gibi olsa:
        System.out.println("Her dert Java gibi olsa >>> "+ cumle.substring(cumle.length()-9));


        // ilk 10 karakteri yazdirma yontemi//Her dert J
        System.out.println(cumle.substring(0,10));//Her dert J



        // 11.ci karakterden sonuna kadar olan Stringi yazdiralim
        System.out.println(cumle.substring(10));//ava gibi olsa
















    }
}
