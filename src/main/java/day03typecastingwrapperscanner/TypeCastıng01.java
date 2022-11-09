package day03typecastingwrapperscanner;

public class  TypeCastıng01 {

    //Type Casting: Bir numeric data type'ini diger numeric data type'ina cevirmek demektir.
    //              byte < short < int < long < float < double




    //Note 1: Kucuk data type'ini buyuk data type'ine cevirmeye "Auto Widening" denir
    //Note 2: Buyuk data type'ini kucuk data type'ine cevirmeye "Explicit Narrowing" denir

    public static void main(String[] args) {

        byte age = 23;
        int newAge = age;

        long population = 1234;
        int newPopulation = (int)population;

        short sayı = 12;
        byte newSayı = (byte) sayı;

        float rakam = 21;
        short newRakam = (short) rakam;
        System.out.println("rakam");

        double depo = 51;
        int newDepo = (int) depo;

        //Example 1: short'u double'a ceviren kodu yaziniz
        short numOfStudents = 235;
        double newNumOfStudents = numOfStudents;//Auto Widening

        // Example 2: float'i byte yapan kodu yaziniz.
        float price = 12.99F;
        byte newPrice = (byte)price;//Explicit Narrowing

        System.out.println(newPrice);//12 ==> Java ondalik sayiyi, tam sayiya cevirirken yuvarlama islemi yapmaz.
        //       Java ondalik sayiyi, tam sayiya cevirirken ondalik kismini siler.

        int number = 515;
        byte newNumber = (byte)number;
        System.out.println(newNumber);//3 ==> Java 515'i 256(byte daki sayilarin sayisi)'ya boldu kalani return etti.

        int num = 510;
        byte newNum = (byte)num;
        System.out.println(newNum);// -2


        /*
        1- Verilen şayil ve sayi2 variable'larinin degerlerini degistiren (SWAP) bir

        program yaziniz
        Orn
        sayi1=10 ve sayi2=20;
        kod calistiktan sonra
        sayi1=20 ve sayi2=10 */


//        int sayı2 = 20;
//        int sayı1 = 10;
//
//        System.out.println("sayı1 : " + sayı1 +  "sayı2 :" +sayı2);
//
//        sayı1 = sayı2;
//        sayı2 = sayı1;
//        System.out.println("sayı1 : " + sayı1 +  "sayı2 :" +sayı2);
//



        int sayı1 = 20;
       int sayı2 = 30;
       int sayı3 = 40;
       int sayı4 = 50;
        int bos;

       System.out.println("sayı 1 :" + sayı1 + " sayı2: " + sayı2 + "sayı3 : " + sayı3 + "sayı4 :" + sayı4);
       bos = sayı1;
       sayı1= sayı2;
       sayı2 = sayı3;
       sayı3 = sayı4;
       sayı4 = bos;
      System.out.println("sayı 1 :" + sayı1 + " sayı2: " + sayı2 + "sayı3 : " + sayı3 + "sayı4 :" + sayı4);














    }
}


