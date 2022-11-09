package day26exceptions;

public class Exceptions02 {

    public static void main(String[] args) {

        char ch1 = getCharFromString("java", 2);
        System.out.println(ch1);// v

        char ch2 = getCharFromString("selenium", 8);
        System.out.println(ch2);//StringIndexOutOfBoundsException: bir string ten bir karakter veya karakterler alırken olmayan bır ındex kullanılırsa
                                //StringIndexOutOfBoundsException alınır.



    }

    public static char getCharFromString(String str, int idx){

        char c = ' ';

        try{

            c = str.charAt(idx);

        }catch(StringIndexOutOfBoundsException e){

            System.out.println("Index ile ilgili bir problem olustu. " + e.getMessage());//e.getMessage() mesaji verir

            e.printStackTrace();//Detayli "log" icin

        }

        return c;
    }

}
