package day12_localdatetımesulepratık;

public class C03_Varargs {
    public static void main(String[] args) {



        //Varargs kullanarak verilen string ifadeleri birleştiren "concat" isimli bir metod olusturunuz....

        concat("safran" ,"bolu", "evleri");

    }

    private static void concat(String ...str) {

        String sonuc="";
        for (String w:str
        ) {
            sonuc+=w;
        }
        System.out.println(sonuc);

        //Verilen sayilardan ilki haric tum sayilari toplayip ilk sayiyla carpan bir method olusturunuz
        int sayı1= 5;
        int sayı2= 7;
        int sayı3= 2;
        int sayı4= 4;
        int sayı5= 9;

//        toplam(sayi1,sayi2,sayi3,sayi4,sayi5);
    }//main

    private static void toplam(int sayi1, int ...toplanacakSayi) {

        int top=0;
        for (int w:toplanacakSayi//ilki haric tuttuk
        ) {
            top+=w;
        }
        System.out.println("Toplam "+top);//22
        System.out.println("Toplam ile Ilksayinin carpimi "+(top*sayi1));//110

    }
}
