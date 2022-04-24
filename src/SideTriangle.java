import java.util.Scanner;

public class SideTriangle {
    public static void main(String[] args) {
        System.out.println("Validity of a triangle through its side. ");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a side one of a triangle:");
        int Side1=scanner.nextInt();
        System.out.println("Enter another side of a triangle:");
        int Side2=scanner.nextInt();
        System.out.println("Enter the third side of a triangle:");
        int Side3=scanner.nextInt();
        // For a valid triangle, the sum of two sides must be greater than the remaining side of a triangle.
        if((Side1+Side2>Side3)||(Side1+Side3>Side2)||(Side2+Side3>Side1)){
            System.out.println("It is a valid triangle.");
        }
        else {
            System.out.println("It is not a valid triangle.");
        }
    }
}
