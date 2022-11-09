package day08_loopssule;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {

/*
  Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
  tekrarlayan kodu yaziniz

 * ornek:  input            output
 *         elma  2           eaea
 *         army  3           ayayay

 */
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bır kelıme gırınız");
        String kelıme = input.nextLine();


        System.out.println("lutfen kac defa tekrarlanmasını ıstıyorsanız gırınız");
        int tekrarsayısı= input.nextInt();

        String ılksonharf = kelıme.substring(0,1)+kelıme.substring(kelıme.length()-1);

        String cıktı ="";

        for (int i = 1; i <=tekrarsayısı ; i++) {
            cıktı+=ılksonharf;


        }

        System.out.println(cıktı);













    }
}
