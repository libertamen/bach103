package day05IfStatement;

import java.util.Scanner;

public class IfStatement02 {

    public static void main(String[] args) {

        //Example 1: Kullanici gun numarasini girsin kod gun ismini yazsin
        //           2==>Pazartesi      5==>Persembe ...
        Scanner input = new Scanner(System.in);
//        System.out.println("Gun numarasini giriniz...");
//        byte gunNo = input.nextByte();
//
//        if(gunNo==1){
//            System.out.println("Pazar");
//        }else if(gunNo==2){
//            System.out.println("Pazartesi");
//        }else if(gunNo==3){
//            System.out.println("Sali");
//        }else if(gunNo==4){
//            System.out.println("Carsamba");
//        }else if(gunNo==5){
//            System.out.println("Persembe");
//        }else if(gunNo==6){
//            System.out.println("Cuma");
//        }else if(gunNo==7){
//            System.out.println("Cumartesi");
//        }else{
//            System.out.println("Gecerli bir gun numarasi giriniz. Gecerli gun numaralari 1, 2, 3, 4, 5, 6, 7 den birisidir.");
//        }



        // Example 2 Kadir:
        System.out.println("renk numarası girin....");
        byte renk = input.nextByte();

        if (renk==1){
            System.out.println("kırmızı");
        } else if (renk==2) {
            System.out.println("beyaz");
        } else if (renk==3) {
            System.out.println("mavi");
        } else if (renk==4) {
            System.out.println("yesil");
        } else if (renk==5) {
            System.out.println("turuncu");
        } else if (renk==6) {
            System.out.println("mor");
        } else if (renk==7) {
            System.out.println("sarı");
        } else if (renk==8) {
            System.out.println("siyah");
        } else if (renk==9) {
            System.out.println("kahve");
        } else{
            System.out.println(" gecerli renk numarası gırınız...gecerli renk numaraları 1-2-3-4-5-6-7-8-9-10 dan biridir....");
        }


    }

}
