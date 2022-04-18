import java.util.Arrays;

public class Helloworld {
    static int a=10; //static or class variable
    int b=12; //instance variable

    public static void main(String[] args){
        int a=5;

        int c=2;
        Helloworld suman = new Helloworld();
        System.out.println(a);
        System.out.println(suman.b);
        System.out.println(c);

        System.out.println("Hellow world !!!");
       printName();
    }
    static void printName(){
        String name="Suman Karki";
        System.out.println(name);
    }
}


