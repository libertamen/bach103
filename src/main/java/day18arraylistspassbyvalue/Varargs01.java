package day18arraylistspassbyvalue;

public class Varargs01 {


    public static void main(String[] args) {

        /*
        1-farklı sayılardakı parametrelerle calısabılen bır method olusturmakk ıstersenız "varargs" kullanmalısınız.

        2-"varargs" arka tarafta "Array" kullanır, bu yüzden "varargs" larla çalışırken "Array"lerle çalışıyormuş gibi davranabilirsiniz.

        3- "varargs" olusturmk ıcın "<data type>...<varargs ısmı>"

        4-bır method ta varargs ın yanında baska bır parametre kullanılabılır mı?
        "varargs" en sonda olma0k sartı ıle kullanılabılır.

        5- bır method ta bırden fazla varargs kullanılabılır mı?
        "varargs" en sonda olmak zorunda oldugundan bırden fazla kullanırsanız en az bırı sonda olmayacaktır. bu da 4 madde ıle celısır.
        */

        int r1 = topla(2,3);
        System.out.println(r1);

        int r2 = topla(2, 3, 4);
        System.out.println(r2);

        int r3 = topla(2, 3, 4 ,5);
        System.out.println(r3);




    }
    // ıkı sayının toplamını return eden bır method olusturunuz..

    public static int topla(int a, int b){
        return a+b;

    }

    // uc sayının toplamını return eden bır method olusturunuz..

    public static int topla(int a, int b, int c) {

        return a + b + c;

    }

    // istedıgımız kadar sayıyı toplayacabılecegımız bır method olusturalım.

    public static int topla(int...kadir){

        int sum =0;

        for (int w : kadir){

            sum = sum +w;

        }
        return sum;
    }

}
