import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number:");
        int a=scanner.nextInt();
        System.out.println("Enter another number:");
        int b=scanner.nextInt();
        if (a>b){
            System.out.println("The first number is greater");
        }
        else {
            System.out.println("The second number is greater");
        }
    }
}
