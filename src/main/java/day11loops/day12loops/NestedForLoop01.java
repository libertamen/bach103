package day11loops.day12loops;

import java.util.Scanner;

public class NestedForLoop01 {
    public static void main(String[] args) {


        //Example 1 Asagıdakı seklı ekrana yazdırın kodu yazınız.
        //****
        //****
        //****
        Scanner input = new Scanner(System.in);

        System.out.println("satır sayısını gırınız");
        int satır = input.nextInt();

        System.out.println("sutun sayısını gırınız");
        int sutun = input.nextInt();

        System.out.println("karakter secınız");
        char ch =input.next().charAt(0);

        for(int i=1; i<satır;  i++) {
            for (int k = 1; k < sutun; k++) {
                System.out.print("ch");
            }


            System.out.println();

        }

           /*
              Example  2  Asagıdsakı seklı cızen kodu yazın.

              1
              1 2
              1 2 3
              1 2 3 4
              1 2 3 4 5
           */

        for (int i=1; i<6; i++){

            for (int k=1; k<=i; k++){
                System.out.print(k);

            }
            System.out.println();
        }
        /*
        Exampe 3 Asagıdakı seklı cızen kodu yazın.

                         * * * *
                         * * *
                         * *
                         *

         */
        int row = 4;

        for (int i=1; i<row; i++){

            for (int k=row; k>=i; k--){
                System.out.print("* ");

            }
                System.out.println();
            }
        }
    }