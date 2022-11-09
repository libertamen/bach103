package day05IfStatement;

import java.util.Scanner;

public class IfStatement05 {

    public static void main(String[] args) {

        // Kullanicidan yasini isteyin
// 65 veya daha buyukse emekli olabilirsin
// 65'den kucukse emekli olamazsin "? sene daha calisman lazim" yazdirin


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen yasınızı pozıtıf sayı olarak gırınız");
        int yas=input.nextInt();


        if (yas>=65){
            System.out.println("emekli olabılırsın");
        }else {
            System.out.println("emekli olamazsın...");
            System.out.println(65-yas + "sene daha calısmalısın...." );

        }

        // nested if else
        if (yas>0){
          if (yas>65){
              System.out.println("emeklı olabılırsın gozun aydın");
          }else {
              System.out.println("emeklı olamazsın...boku yedın");
              System.out.println( 65 - yas +"sene daha calısmalısın");
          }

        }else {
            System.out.println("lutden 0 dan buyuk bır sayı gırınız");
        }




























    }


}
