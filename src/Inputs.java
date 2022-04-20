import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1= scanner.nextInt();
        System.out.println("Enter another number:");
        int num2= scanner.nextInt();
        System.out.println("Enter third number:");
        int num3=scanner.nextInt();
        String result;
        result= (num1==num2&&num1==num3&&num2==num3)?"All the three numbers are equal":
                ((num1==num2||num1==num3||num2==num3 )?"Only two numbers are equal":"No numbers are equal.");
        System.out.println(result);
    }
}
