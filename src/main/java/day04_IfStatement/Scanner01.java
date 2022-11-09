package day04_IfStatement;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {


        /*
        kullanıcıdan ilk orta ve soy ismini alınız ve asagıdakı formatta ekrana yazdırınız.
        ali mert can
        123456789
         */

        Scanner input = new Scanner(System.in);

//        System.out.println("ilk isminizi giriniz....");
//        String ilkİsim = input.next();// next() methodu kullanıcıdan string almak icin kullanılır..
//
//        System.out.println("orta isminizi giriniz...");
//        String ortaİsim = input.next();
//
//        System.out.println("soy isminizi giriniz....");
//        String soyİsim = input.next();
//
//        System.out.println("kimlik numarasını giriniz....");
//        String kimlik = input.next();
//
//        System.out.println(ilkİsim +" " + ortaİsim + " " + soyİsim);
//        System.out.println(kimlik);
//
//        System.out.println("arabanızı markasını giriniz");
//        String marka = input.next();
//
//        System.out.println("arabanızı rengini yazın");
//        String renk = input.next();
//
//
//       System.out.println("arabanızı modelini giriniz");
//        String model = input.next();
//
//        System.out.println("arabanızı yılını giriniz");
//        String yıl = input.next();


//        System.out.println(marka);
//        System.out.println(renk);
//        System.out.println(model);
//        System.out.println(yıl);

//        System.out.println(marka +" " + renk + " " + model + " " + "" + yıl );// bu sekilde de yapılabilir.


//
//        System.out.println("aile fertlerini yazınız");
//        String aile = input.next();
//
//        System.out.println("baba adı");
//        String baba = input.next();
//
//
//        System.out.println("anne adı");
//        String anne = input.next();
//
//        System.out.println("cocuk adı");
//        String cocuk = input.next();
//
//        System.out.println(aile +" " + baba + " " + anne + " " + cocuk );



        /*
        3 yol.....next ve nextline arasındaki fark nedir
        next ilk kelimesini yazar
                nextline ise string ifadenin tamamını yazar...*/

        System.out.println("arabanızı markasını modelini ve rengini yazınız");
        String araba = input.nextLine();

        System.out.println(araba);

        System.out.println("kadir karatas");
        String isim = input.nextLine();


        System.out.println("yurtdısında seyahat ettıgınız ulkerı yazınız...");
        String kongo = input.next();
        String tacikistan = input.next();
        String afganistan = input.next();
        String kırgızistan = input.next();
        String afganistan2 = input.next();

        System.out.println(kongo+" " + afganistan +" " + tacikistan + " " + kırgızistan);










    }


}
