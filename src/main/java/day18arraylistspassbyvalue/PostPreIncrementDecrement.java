package day18arraylistspassbyvalue;

public class PostPreIncrementDecrement {

    public static void main(String[] args) {

        int a = 5;

           //        post ıncrement : sonra artırır  demek...

          int b = a++;

          System.out.println(b);//5

        System.out.println(a);//6

//        pre ıncrement
        int c = 10;

        int d = ++c;

        System.out.println(11);

        System.out.println(c);


// post Decrement
        int e = 20;

        int f = e--;

        System.out.println(f);//20

        System.out.println(e);//19

        // Pre decrement
        int h = 30;
        int i = --h;
        System.out.println(i);// 29
        System.out.println(h);// 29


    }
}
