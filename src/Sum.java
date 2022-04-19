import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
                int num1= scanner.nextInt();
        System.out.println("Enter another number:");
        int num2=scanner.nextInt();
        System.out.println("Enter the third number:");
        int num3=scanner.nextInt();
        System.out.println("Enter the fourth number:");
        int num4=scanner.nextInt();

        int sum=num1+num2+num3+num4;

        System.out.println("The sum of all four input numbers is:"+sum);


    }
}
