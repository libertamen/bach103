package day08_loopssule;

import java.util.Scanner;

public class C01_ForLoop {

//         //Kullanicidan baslangic , bitis ve artis miktarini alarak
//         // aradaki tum sayilari aralarina virgul koyarak yazdirin
//
   public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        int baslangıc=10;
//        int bıtıs=50;
//        int artısmıktarı=5;
//
//        for (int i = baslangıc; i <=bıtıs ; i+=artısmıktarı){
//
//            if (i<bıtıs){
//                System.out.print(i+",");
//
//            } else
//                System.out.println(i);
//        }


//      Scanner input = new Scanner(System.in);
//
//       int gırıs=50;
//       int gelısme=550;
//       int sonuc=100;
//
//       for (int i = gırıs; i <=gelısme ; i+=sonuc) {
//
//           if (i<gelısme){
//
//               System.out.println(i+"." );
//
//
//           }else
//               System.out.println(i);
//
//       }

       Scanner kulla = new Scanner(System.in);

       int gırıs= 2;
       int gelısme=10;
       int sonuc=1;

       for (int i = gırıs; i <=gelısme ; i+=sonuc) {

           if (i<gelısme){

               System.out.println(i+" ");
           }else
           System.out.println(i);
       }












    }
}
