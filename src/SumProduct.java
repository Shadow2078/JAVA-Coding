import java.util.Scanner;

public class SumProduct {
    public static void main(String[] args) {
        System.out.println("Here will be your sum and product:");
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a integer:");
        int one=scanner.nextInt();
        System.out.println("Enter another integer:");
        int two=scanner.nextInt();

        int sum= one+two;
        int product=one*two;

        System.out.println("The sum of two integers is:"+sum);
        System.out.println("The product of two integers is:"+product);

        double result= (double) sum/product;
        System.out.println("The division is "+result);

    }
}


