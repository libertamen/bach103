package day11loops.day12loops;

import java.util.Scanner;

public class WhileLoops01 {

    public static void main(String[] args) {

       // Example 1: 3 den 10 a kadar tam sayıları aynı satırda ekrana yazdıran kodu yazdırın.

        for(int i=3; i<11; i++){
            System.out.print(i +  "  ");
                continue;
            }

      // 2. yol
        int i=3;

        while (i<11){

            System.out.println(i + " ");

            i++;
        }



      // Examlpe 2 : 17 den 4 e kadar tum cıft sayıları ekrana yazdırın...
        int k=17;

        while (k>3){

            if(k%2==0){
                System.out.println(k + " ");
            }

            k--;
        }

        //Example 3: 12 den 67 e kadar sayıların toplamını yazan kodu yaz.
        int sum = 0;
        int m = 12;

        while (m<68){

            sum = sum + m;

            m++;
        }

        System.out.println(sum);

        // Examlpe 4: size verılen bır tamsayının rakamlarının toplamını ekrana yazdırınız.

        int sonuc = 0;

        int sayı = 385;

        while (sayı>0){

            sonuc = sonuc + sayı%10;

            sayı = sayı/10;

        }

        System.out.println(sonuc);

        // Example 5: kullanıcıdan aldıgınız bır sayının carpım tablosunu ekrana yazdırınız.
        //            3==> 3*1
          Scanner input = new Scanner(System.in);
          System.out.println("carpım tablosunu gormek ıcın bır sayı yazınız");
          int s  = input.nextInt();

          int n = 1;

          while (n<11){

              System.out.println(s  + "x" + n + " = " + s*n);

              n++;
          }




        }


















    }

