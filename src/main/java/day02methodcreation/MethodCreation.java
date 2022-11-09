package day02methodcreation;

public class MethodCreation {

    public static void main(String[] args) {

        //main method icinde kullanacaginiz hersey "static" olmalidir.
        //voıd:bu method yenı bır data uretmıyor demektır. ornegın ekrana bır sey yazdırma methodu bıt tusa tıklama gıbı...


        System.out.println(toplamaYap(1.2, 5));
        System.out.println(ucSayiyiCarp(2, 1.5, 6));

        System.out.println(dortsayıyıtopla(5, 6.5, 8, 9));

        System.out.println(ilkIkiyiToplaUcuncuIleCarp(2, 8, 3.2));



            System.out.println(ılkIkıSayıyıToplaUcuncuyeBol(2, 3, 5));

            //sout yazip "Enter" a basiniz System.out.println() otomatik olarak yazilir.
            //Ekrana bir sey yazdirmak icin iki tane kod var i)System.out.println() ==> Satirbasi yapar      ii)System.out.print() ==> Satirbasi yapmaz



        }

        //Example 1: Toplama islemi yapan bir method olusturunuz
        public static double toplamaYap  (double a, double b){
            return a+b;
        }
        //Example 2: Uc sayiyi birbiri ile carpan bir method olusturunuz
        public static double ucSayiyiCarp(double a, double b, double c){
            return a*b*c;
        }



        //Example 3: Uc sayidan ilk ikisini toplayip ucuncu ile carpan method olusturup, sonucu ekrana yazdiriniz
        public static double ilkIkiyiToplaUcuncuIleCarp(double a, double b, double c){
            return (a+b) * c;
        }


        //Example 4: dort sayıyı topla

        public static double dortsayıyıtopla(double a, double b, double c, double d){return a+b+c+d;}


    public static double ılkIkıSayıyıToplaUcuncuyeBol(double a, double b, double c){return  (a+b) / c;}

    }


















