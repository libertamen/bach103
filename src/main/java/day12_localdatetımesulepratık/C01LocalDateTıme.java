package day12_localdatetımesulepratık;

import java.util.Scanner;

public class C01LocalDateTıme {

    public static void main(String[] args) {



        // kullanıcıdan dogdugu gun ve ay bılgılerını alarak burcunu hesaplatan kodu yazınız.


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen dogdunuz ayı strıng olarak gırınız");

        String ay = input.nextLine();

        System.out.println("lutfen dogdunuz gun bılgısını yazınız");

        int gun= input.nextInt();

        String burc = "";

        if (ay.equalsIgnoreCase("Ocak")){
            if (gun>22)
                burc="Kova";
            else
                burc="Oglak";
        } if (ay.equalsIgnoreCase("Subat")) {
            if (gun > 20)
                burc = "Balik";
            else
                burc = "Kova";
        } if (ay.equalsIgnoreCase("Mart")) {
            if (gun > 21)
                burc = "Koc";
            else
                burc = "Balik";
        }
        if (ay.equalsIgnoreCase("Nisan")) {
            if (gun > 21)
                burc = "Boga";
            else
                burc = "Koc";
        } if (ay.equalsIgnoreCase("Mayis")) {
            if (gun > 22)
                burc = "Ikizler";
            else
                burc = "Boga";
        } if (ay.equalsIgnoreCase("Haziran")) {
            if (gun > 23)
                burc = "Yengec";
            else
                burc = "Ikizler";
        } if (ay.equalsIgnoreCase("Temmuz")) {
            if (gun > 23)
                burc = "Aslan";
            else
                burc = "Yengec";
        } if (ay.equalsIgnoreCase("Agustos")) {
            if (gun > 23)
                burc = "Basak";
            else
                burc = "Aslan";
        } if (ay.equalsIgnoreCase("Eylul")) {
            if (gun > 23)
                burc = "Terazi";
            else
                burc = "Basak";
        } if (ay.equalsIgnoreCase("Ekim")) {
            if (gun > 23)
                burc = "Akrep";
            else
                burc = "Terazi";
        } if (ay.equalsIgnoreCase("Kasim")) {
            if (gun > 22)
                burc = "Yay";
            else
                burc = "Akrep";
        } if (ay.equalsIgnoreCase("Aralik")) {
            if (gun > 22)
                burc = "Oglak";
            else
                burc = "Yay";
        }
        System.out.println(gun+" "+ay+" "+" tarihinde dogduysaniz burcunuz "+burc);








    }
}
