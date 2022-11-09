package day23inheritancepolymorphism;

public class Math extends  Courses {

    public void practice(){
        System.out.println("solve questıons");

    }
    public Math(){
        super("x");

        System.out.println("constructor 1");
    }

    public Math(int a){
        this();

        System.out.println("constructor 2");

    }

}
