package day05IfStatement;

import java.util.Scanner;

public class IfStatement04 {

    public static void main(String[] args) {

/*Soru 6) Kullanicidan iki sayi isteyin,
 sayilarin ikisi de pozitif ise "sayilarin toplamini "yazdirin,
 sayilarin ikisi de negative ise "sayilarin carpimini" yazdirin,
 sayilarin ikisi farkli isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
 sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.*/


        Scanner input=new Scanner(System.in);
        System.out.println("lutfen ılk sayıyı gırınız");
        double sayı1=input.nextDouble();

        System.out.println("lutfen ıkıncı sayıyı gırınız");
        double sayı2=input.nextDouble();

        if(sayı1>0 && sayı2>0){
            System.out.println("sayıların toplamını"+(sayı1+sayı2));// ikiside pozıtıf ıse

        } else if (sayı1<0 && sayı2<0) {
            System.out.println("sayıların carpımını"+(sayı1*sayı2));// ıkısıde negatıf ıse


        } else if (sayı1*sayı2<0) { //sayı1<0 && sayı2>0
            System.out.println("farklı ısaretlerde sayılarla ıslem yapamazsın");


        }else
            System.out.println("sıfır carpmaya gore yutan elemandır...");


    }
}
