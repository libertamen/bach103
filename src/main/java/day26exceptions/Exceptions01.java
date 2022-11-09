package day26exceptions;

public class Exceptions01 {

    public static void main(String[] args) {

        String str = "123";

        int result = convertStringToInteger(str);
        System.out.println(result + 5);


        String st = "1a2b";
        int r = convertStringToInteger(st);//NumberFormatException:Eger icinde rakamdan farklı karakter barındıran bır Strıng ın valueOf metodu kullanarak Integer e cevırmek NumberFormatException alırsınız..
        System.out.println(r + 10);

    }

    public static int convertStringToInteger(String str){

        int i = 0;


        try{
            //hergangı bır satırda exception atılırsa java direkt "catch" bolumune gecer.Try ıcındekı sonrakı kodları calıstırmaz...

           i =  Integer.valueOf(str);
            System.out.println("Burasi try bolumu...");


    }catch (NumberFormatException E){

            System.out.println("rakam olmayan karakter ıceren Strıng'ler Integer'e cevrılmez...");
        }
        return  i;

    }

    }
