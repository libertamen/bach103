package practiceDefnehoca01;

import java.util.Scanner;

public class C03vize {
    public static void main(String[] args) {


        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         * vize1=80
         * vize2=90
         * Final=70
         * Ornek cikti=74.5
         */

        Scanner input=new Scanner(System.in);

        int vize1;
        int vize2;
        int finalnotu;

        System.out.println("vize1= ");
        vize1=input.nextInt();

        System.out.println("vize2= ");
        vize2=input.nextInt();

        System.out.println("Final notu ");
        finalnotu=input.nextInt();

        double sonuc= (vize1+vize2) /2 *0.3 + (finalnotu*0.7);
        System.out.println("Ders ortalamamız " +sonuc);








    }
}
