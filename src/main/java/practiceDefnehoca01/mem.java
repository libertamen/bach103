package practiceDefnehoca01;

import java.util.Scanner;

public class mem {
    // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
// ve yasadiklari yeri seviyorlarsa
// bu bilgiyi yazdirin

// next() only can read the first word/next() sadece ilk kelimeyi okuyabilir
// nextLine() can read the whole line/nextLine() tüm satırı okuyabilir



      public static void main(String[] args) {
    Scanner input=new Scanner(System.in);

    System.out.println("isminiz :");
    String isim=input.nextLine();

    System.out.println("memleket :");
    String memleket=input.nextLine();

    System.out.println("sunaki konumunuz :");
    String konum=input.nextLine();

    System.out.println("yasınız :");
    byte yas=input.nextByte();

    System.out.println("Boyunuz : ");
    short boy= input.nextShort();

    System.out.println("yasadiginiz " + konum + "seviyormusunuz? ");
    boolean seviyorMu=input.hasNextBoolean();

    System.out.println("********************");

    System.out.println("isim = " + isim);
    System.out.println("memleketınız  = " + memleket);
    System.out.println("suanki konumunuz  = " + konum);
    System.out.println("yasinız  = " + yas);
    System.out.println("boyunuz  = " + boy );
    System.out.println("yasadiginiz yeri seviyormusunuz  = " + seviyorMu);












}







}
