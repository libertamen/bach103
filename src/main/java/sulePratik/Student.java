package sulePratik;

public class Student {



    String name;
    static String collage=" UNF";
    Student(String n, String collage){

        this.name= n;
        this.collage=collage;

    }

    public static void main(String[] args) {

        Student s1= new Student("Mark", "UFC");
        Student s2= new Student("Kadir", "FIU");
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s1.collage);
        System.out.println(s2.collage);



    }
}
