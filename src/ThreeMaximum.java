import java.util.Scanner;

public class ThreeMaximum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=scanner.nextInt();
        System.out.println("Enter another number:");
        int num2=scanner.nextInt();
        System.out.println("Enter third number:");
        int num3=scanner.nextInt();

        if (num1>num2&&num1>num3){
            System.out.println("The first number is greatest.");
        }
        else  if (num2>num1&&num2>num3){
            System.out.println("The second number is greatest.");
        }
        else {
            System.out.println("The third number is greatest.");
        }
    }
}
