package day05IfStatement;

import java.util.Locale;
import java.util.Scanner;

public class prtk {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("bir ay adı ismi giriniz");
        String ayAdı = input.next();


        if (ayAdı.equals("aralık") || ayAdı.equals("ocak")||ayAdı.equals("subat")){

            System.out.println("kıs");

        } else if (ayAdı.equals("mart")||ayAdı.equals("nisan")||ayAdı.equals("mayıs")) {

            System.out.println("ilkbahar");

        } else if (ayAdı.equals("haziran")||ayAdı.equals("temmuz")||ayAdı.equals("agustos")) {

            System.out.println("yaz");
        } else if (ayAdı.equals("eylul")||ayAdı.equals("ekım")||ayAdı.equals("kasım")) {

            System.out.println("sonbahar");

        }else {
            System.out.println("gecersız ay");
        }

    }
}
