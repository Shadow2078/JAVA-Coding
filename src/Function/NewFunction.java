package Function;

import java.util.Scanner;
import java.util.function.Function;

public class NewFunction {
    public static void main(String[] args) {
        helloWorld();

        NewFunction function=new NewFunction();
        function.helloSuman();

        String value=function.helloAshutosh();
        System.out.println(value);

        System.out.println(function.helloBhatta("Hello Bhatta K cha yar ?"));


    }
    // parameterless function with no return type
    public static void helloWorld(){
        System.out.println("Hello World!!!");

    }

    public void helloSuman(){
        System.out.println("Hello Suman");
        String helloSuman = "My name is Suman";
    }

    public String helloAshutosh()
    {
        String helloAshutosh="Hello K cha ?";
        return helloAshutosh;
    }
    public String helloBhatta(String data){
        return data;
    }


}

class Operation{
    public static void main(String[] args) {
        Operation operation= new Operation();
        System.out.println("The sum is "+operation.additionNumber());
        System.out.println("The difference is "+operation.SubtractionNumber());
        System.out.println("The division is "+operation.DivisionNumber());
        System.out.println("The multipication is "+operation.MultipicationNumber());



    }


        public int additionNumber(){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter a Number:");
            int a=scanner.nextInt();
            System.out.println("Enter another Number");
            int b=scanner.nextInt();
            int c=a+b;
            return c;

        }
    public int SubtractionNumber(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int a=scanner.nextInt();
        System.out.println("Enter another Number");
        int b=scanner.nextInt();
        int c=a*b;
        return c;

    }
    public int DivisionNumber(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int a=scanner.nextInt();
        System.out.println("Enter another Number");
        int b=scanner.nextInt();
        int c=a/b;
        return c;

    }
    public int MultipicationNumber(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int a=scanner.nextInt();
        System.out.println("Enter another Number");
        int b=scanner.nextInt();
        int c=a*b;
        return c;

    }

}


