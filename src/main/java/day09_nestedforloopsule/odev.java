package day09_nestedforloopsule;

public class odev {

    //        1 2 3 4 5 6
//             2 3 4 5 6
//              3 4 5 6
//               4 5 6
//                5 6
//                 6

    public static void main(String[] args) {

       for (int i = 1; i <7 ; i++) {
            System.out.println(" ");
            for (int bosluk =1; bosluk<= i; bosluk++) {
                System.out.print("");
            }
            for (int j = i; j <7 ; j++) {
                System.out.print(j +"/");
            }
        }



            }
        }



















