package day08_loopssule;

public class C02_ForLoop {
    public static void main(String[] args) {

/*

 Interview Question
      Kullanicidan 100’den kucuk bir tamsayi isteyin.
      1’den baslayarak girilen sayiya kadar tum sayilari yazdirin.
      Ancak;
      - Sayi 3’un kati ise sayi yerine "Java" yazdirin.
      - Sayi 5’in kati ise sayi yerine "Guzeldir" yazdirin.
      - Sayi hem 3’un hem 5’in kati ise sayi yerine " ** Java Guzeldir ** " yazdirin.
 */

//        int sayı=30;
//
//
//
//        for (int i = 1; i <=sayı ; i++) {
//
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.print("** Java Guzeldir ** ");
//
//
//            } else if (i % 3 == 0) {
//                System.out.print(" Java ");
//            } else if (i % 5 == 0) {
//                System.out.print(" Guzeldir ");
//
//            } else System.out.print(i + " ");
//        }


        int sayı=50;

        for (int i = 2; i <=sayı ; i++) {

            if (i % 2 == 0 && i % 6== 0){

                System.out.println("***kadir karataş***");

            } else if (i % 2 == 0) {
                System.out.println(" esra");

            }else if (i % 3 == 0){
                System.out.println("yigit-ayse");

            }else System.out.println(i + "  ");
        }



    }
}
