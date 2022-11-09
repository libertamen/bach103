package practiceDefnehoca01;

import java.util.Scanner;

public class cay {

    public static void main(String[] args) {

        //Kullanıcıya günde ne kadar çay içtiğini ve
// ne kadar şeker kullandığını sorun. Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.
//1 şeker = 1.7 gr
//Örnek Çıktı:
//5 cay
//2 seker
//Yılda 6.205 kg şeker kullanıyor.

        Scanner input = new Scanner(System.in);
        System.out.println("gunde kac bardak cay ıcıyorsun");

        double cay=input.nextDouble();

        System.out.println("gunde kac bardak cay ıcıyorsun");
        double seker = input.nextDouble();

        double sekergr=(cay+seker*365*1.7)/1000;

        System.out.println("bir yılda " + sekergr + "kg seker kullanıyor");












    }
}
