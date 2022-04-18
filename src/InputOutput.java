import java.util.Arrays;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        System.out.print("Hello ");
        System.out.print("Suman ");
        System.out.printf("Ravi is a clever boy ");
        System.out.printf("And he is representing Butwal ");
        System.out.println("Hey, How are you ?");
        System.out.println("I hope you're fine");

        int [] a= new int[] {1,2,3,4,5};
        System.out.println(Arrays.toString(a));

        Scanner scanner =new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int b=scanner.nextInt();
//        System.out.println("Enter another number:");
//        int c=scanner.nextInt();
//        System.out.println("The sum of two numbers is:"+(b+c));

//        System.out.println("Enter your full name:");
//        String str=scanner.next();
//        scanner.nextLine();
//        System.out.println("You have entered your name as: "+str);
//
//        System.out.println("Enter one sentence:");
//        String sentence=scanner.nextLine();
//        System.out.println("Your sentence is: "+sentence);
        System.out.println("Enter Principal:");
        double P=scanner.nextDouble();
        System.out.println("Enter Rate:");
        double R=scanner.nextDouble();
        System.out.println("Enter time:");
        double T=scanner.nextDouble();
        double SI=(P*T*R)/100;
        System.out.println("The simple interest is: "+SI);




    }
}
