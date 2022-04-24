import java.util.Scanner;

public class Equilateral_Isosceles_scalene {
    public static void main(String[] args) {
        System.out.println("Checking either a traingle is equilateeral,isosceles or scalane");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the side1 of a triangle.");
        int side1=scanner.nextInt();
        System.out.println("Enter the side2 of a triangle");
        int side2=scanner.nextInt();
        System.out.println("Enter the side3 of a triangle:");
        int side3=scanner.nextInt();
        if(side1==side2&&side2==side3&&side1==side3){
            System.out.println("It is an equilateral triangle.");
        }
        else if(side1==side2||side1!=side3||side2!=side3){
            System.out.println("It is an isosceles triangle.");
        }
        else{
            System.out.println("It is scalene triangle.");
        }
    }
}
