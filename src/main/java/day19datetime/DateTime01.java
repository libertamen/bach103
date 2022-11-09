package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {


        // example 1 anlık tarıhı (current date) ekrana yazdıran kodu yazdırın..

        LocalDate currentDate = LocalDate.now();

        System.out.println(currentDate);

        // example 2 "anlık zamanı" (current time) ekrana yazdıran kodu yazdırın.

        LocalTime currentTime = LocalTime.now();

        System.out.println(currentTime);

        // example 3 "anlık tarıhı" (current date) ve "anlık zamanı" (current time) ekrana yazdıran kodu yazdırın.

        LocalDateTime  currentDateTime = LocalDateTime.now();

        System.out.println(currentDateTime);

        // example 4 japonya'dakı "anlık tarıhı" (current date) ve "anlık zamanı" (current time) ekrana yazdıran kodu yazdırın.

        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println(currentDateTimeInJapan);

        // example 5 Istanbul 'dakı "anlık tarıhı" (current date) ve "anlık zamanı" (current time) ekrana yazdıran kodu yazdırın.


        LocalDateTime currentDateTimeInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));

        System.out.println(currentDateTimeInIstanbul);

        //Example 6: Bugunden 789 gun sonra emeklı olacagınıza gore emeklılık tarıhını hesaplayan kodu yazınız.

        LocalDate countDate = LocalDate.of(2022,10,21);
        LocalDate retireDate = countDate.plusDays(789);
        System.out.println(retireDate);

        // example 7 : ıkı cocugunuzun dogum tarıhlerı arasındakı farkı gun olarak hesaplayın.

        LocalDate dobAli = LocalDate.of(2005,5,17);
        LocalDate dobVeli = LocalDate.of(2013,2,8);

       //  "between(dobAli, dobVeli)" methodu kullanıldıgında daha eskı olan once yazılmalıdır.

        Long diff = ChronoUnit.DAYS.between(dobAli, dobVeli);
        System.out.println(diff);

        //Example 8: Istanbul'un fethi ile, Cumhuriyetin kurulması arasında kaç ay olduğunu gösteren kodu yazınız.
//           29 Mayıs 1453 ==> İstanbul'un fethi           29 Ekim 1923 ==> Cumhuriyetin kuruluşu

        LocalDate republicDay = LocalDate.of(1923, 10, 29);

        LocalDate conquestOfIstanbul = LocalDate.of(1453, 5, 29);

        Long monthDifference = ChronoUnit.MONTHS.between(conquestOfIstanbul, republicDay);
        System.out.println(monthDifference);



        //Example 9: Verilen tarih'in hangi burcta oldugunu gosteren kodu yaziniz
        LocalDate myDate = LocalDate.of(1989, 3, 22);

        int day = myDate.getDayOfMonth();
        int month = myDate.getMonthValue();

        //1.Yol:
        if(day>=21 && month==3){
            System.out.println("Koc");
        }else if(day<=20 && month==4){
            System.out.println("Koc");
        }else if(day>=21 && month==4){
            System.out.println("Boga");
        }else if(day<=20 && month==5){
            System.out.println("Boga");
        }
        //2.Yol:
        if((day>=21 && month==3) || (day<=20 && month==4) ){
            System.out.println("Koc");
        }else if((day>=21 && month==4) || (day<=20 && month==5)){
            System.out.println("Boga");

    }
}
    }
